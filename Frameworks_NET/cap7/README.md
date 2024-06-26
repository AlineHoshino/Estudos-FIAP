Primeiros criar os Models

Depois criar o os Data:

Não esquecer de instalar os pacotes:

EntityGrameworkCore, EntityFrameworkTools
Oracle.EntityFrameworkCore

Não esquecer de colocar

#region INICIALIZANDO O BANCO DE DADOS
var connectionString = builder.Configuration.GetConnectionString("DatabaseConnection");
builder.Services.AddDbContext<DatabaseContext>(
    opt => opt.UseOracle(connectionString).EnableSensitiveDataLogging(true)
);
#endregion

Naõ esquecer de mexer no appsettings.json para por a senha 

Fazer as migrações

Ferramentas , gerenciador de pacoteNuget, manager console
Add-Migration AddRepresentanteAndClientes - cria a migração
Update-Database - aplica ao banco de dados


Depois criar os repositórios:

ClienteRepository e IClienteRepository

Criar os Services: ClienteService IClienteService
No PorgramCs fazer isso:

#region Repositorios
builder.Services.AddScoped<IClienteRepository, ClienteRepository>();
builder.Services.AddScoped<IRepresentanteRepository, RepresentanteRepository>();
#endregion


#region Services
builder.Services.AddScoped<IClienteService, ClienteService>();
builder.Services.AddScoped<IRepresentanteService, RepresentanteService>();
#endregion

Depois criar as viewModels e adicionar no program cs
Não esquecer de instalar o AutoMapper
#region IMPORTAÇÃO REFERENTE AO BANCO DE DADOS
using AutoMapper;
using Fiap.Web.Alunos.Data.Contexts;
using Fiap.Web.Alunos.Logging;
using Fiap.Web.Alunos.Models;
using Fiap.Web.Alunos.ViewModels;
using Microsoft.AspNetCore.Identity.Data;
using Microsoft.EntityFrameworkCore;
#endregion
var builder = WebApplication.CreateBuilder(args);
#region INICIALIZANDO O BANCO DE DADOS
var connectionString = builder.Configuration.GetConnectionString("DatabaseConnection");
builder.Services.AddDbContext<DatabaseContext>(
    opt => opt.UseOracle(connectionString).EnableSensitiveDataLogging(true)
);
#endregion
#region Registro IServiceCollection
builder.Services.AddSingleton<ICustomLogger, MockLogger>();
#endregion
#region AutoMapper
// Configuração do AutoMapper
var mapperConfig = new AutoMapper.MapperConfiguration(c => {
    // Permite que coleções nulas sejam mapeadas
    c.AllowNullCollections = true;
    // Permite que valores de destino nulos sejam mapeados
    c.AllowNullDestinationValues = true;
    // Define o mapeamento de ClienteModel para ClienteCreateViewModel
    c.CreateMap<ClienteModel, ClienteCreateViewModel>();
    // Define o mapeamento reverso de ClienteCreateViewModel para ClienteModel
    c.CreateMap<ClienteCreateViewModel, ClienteModel>();
});
// Cria o mapper com base na configuração definida
IMapper mapper = mapperConfig.CreateMapper();
// Registra o IMapper como um serviço singleton no container de DI do ASP.NET Core
builder.Services.AddSingleton(mapper);
#endregion...

Tem de ir em adiconar controlaador e escolher a aopção API 
Controller:

using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Fiap.Api.Teste.Services;
using AutoMapper;
using Fiap.Api.Teste.ViewModel;
using Fiap.Api.Teste.Models;

namespace Fiap.Api.Teste.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class RepresentanteController : ControllerBase
    {
        private readonly IRepresentanteService _representanteservice;
        private readonly IMapper _mapper;

        public RepresentanteController(IRepresentanteService representanteservice, IMapper mapper)
        {
            _representanteservice = representanteservice;
            _mapper = mapper;
        }

        [HttpGet]
        public ActionResult<IEnumerable<RepresentanteViewModel>> Get()
        {
            var lista = _representanteservice.ListarRepresentantes();
            var viewModelList = _mapper.Map<IEnumerable<RepresentanteViewModel>>(lista);

            if (viewModelList == null)
            {
                return NoContent();
            }
            else
            {
                return Ok(viewModelList);
            }


        }

        [HttpGet("{id}")]
        public ActionResult<RepresentanteViewModel> Get([FromRoute] int id)
        {
            var model = _representanteservice.ObterRepresentantePorId(id);


            if (model == null)
            {
                return NotFound();

            }
            else
            {
                var viewModel = _mapper.Map<RepresentanteViewModel>(model);
                return Ok(viewModel);
            }


        }

        [HttpPost]
        public ActionResult Post([FromBody] RepresentanteViewModel viewModel)
        {
            var model = _mapper.Map<RepresentanteModel>(viewModel);
            _representanteservice.CriarRepresentante(model);
            return CreatedAtAction(nameof(Get), new { id = model.RepresentanteId }, model);

        }

        [HttpPut("{id}")]
        public ActionResult Put([FromRoute]int id,[FromBody] RepresentanteViewModel viewModel)
        {
            if (viewModel.RepresentanteId == id)
            {
                var model = _mapper.Map<RepresentanteModel>(viewModel);
                _representanteservice.AtualizarRepresentante(model);
                return NoContent();
            }
            else 
            {

                return BadRequest();
            }
           

        }

        [HttpDelete("{id}")]
        public ActionResult Delete([FromRoute] int id)
        {
            _representanteservice.DeletarRepresentante(id);

            return NoContent();


        }
    }
}


Segurança - baixar o pacote jwt bearer
colocar no Program.cs
#region Autenticação
builder.Services.AddAuthentication(options =>
{
    options.DefaultAuthenticateScheme = JwtBearerDefaults.AuthenticationScheme;
    options.DefaultChallengeScheme = JwtBearerDefaults.AuthenticationScheme;
})
    .AddJwtBearer(options =>
    {
        options.TokenValidationParameters = new TokenValidationParameters
        {
            ValidateIssuerSigningKey = true,
            IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes("f+ujXAKHk00L5jlMXo2XhAWawsOoihNP1OiAM25lLSO57+X7uBMQgwPju6yzyePi")),
            ValidateIssuer = false,
            ValidateAudience = false
        };
    });
#endregion


Criar um UserModel, Uma interface de autenticação, um service de autenticação, um controller
Atualizar controller

        [HttpDelete("{id}")]
        [Authorize(Roles = "gerente")]


Paginação

public IEnumerable<ClienteModel> GetAll(int page, int size)
{
    return _context.Clientes.Include(c => c.Representante)
                    .Skip( (page - 1) * page  )
                    .Take( size )
                    .AsNoTracking()
                    .ToList();  
}
public IEnumerable<ClienteModel> GetAllReference(int lastReference, int size)
{
    var clientes = _context.Clientes.Include(_ => _.Representante)
                        .Where(c => c.ClienteId > lastReference)
                        .OrderBy( c => c.ClienteId) 
                        .Take(size)
                        .AsNoTracking()
                        .ToList();
    return clientes;
}

Fazer ViewModel de paginação



namespace Fiap.Api.Teste.ViewModel
{
    public class RepresentantePaginacaoViewModel
    {
        public IEnumerable<RepresentanteViewModel> Representantes { get; set; }
        public int CurrentPage { get; set; }
        public int PageSize { get; set; }
        public bool HasPreviousPage => CurrentPage > 1;
        public bool HasNextPage => Representantes.Count() == PageSize;
        public string PreviousPageUrl => HasPreviousPage ? $"/representante?pagina={CurrentPage - 1};tamanho={PageSize}" : "";
        public string NextPageUrl => HasNextPage ? $"/representante?pagina={CurrentPage + 1};tamanho={PageSize}" : "";
    }
}

Atualizar Service, interface, repository e interface do repository 
