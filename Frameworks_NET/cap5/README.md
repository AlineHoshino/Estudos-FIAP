Entity framework desempenha um papel fundamental, como mapeador objeto-relacional(ORM)


#region Configuracao do DB

var connectionString = builder.Configuration.GetConnectionString("DatabaseConnection");
builder.Services.AddDbContext<DataBaseContext>(

    opt => opt.UseOracle(connectionString).EnableSensitiveDataLogging(true)
    );

#endregion

var app = builder.Build();


using Fiap.Web.Alunos.Models;
using Microsoft.EntityFrameworkCore;

namespace Fiap.Web.Alunos.Data
{

    public class DataBaseContext : DbContext
    {
        public virtual DbSet<RepresentanteModel> Representnates { get; set; }

        public virtual DbSet<ClienteModel> Clientes { get; set; }
        public DataBaseContext(DbContextOptions options) : base(options)
        {
        }

        protected DataBaseContext()
        {
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<RepresentanteModel>( entity => 
            {
                entity.ToTable("Representantes");
                entity.HasKey(e => e.RepresentanteId);
                entity.Property(e => e.NomeRepresentante).IsRequired();
                entity.HasIndex(e => e.Cpf).IsUnique();
            
            });

            modelBuilder.Entity<ClienteModel>( entity =>
            {
                entity.ToTable("Clientes");
                entity.HasKey(e => e.ClienteId);
                entity.Property(e => e.Nome).IsRequired();
                entity.Property(e => e.Email).IsRequired();

                entity.Property(e => e.DataNascimento).HasColumnType("date");
                entity.Property(e => e.Observacao).HasMaxLength(500);

                entity.HasOne(e => e.Representante).WithMany().HasForeignKey(e=>e.RepresentanteId).IsRequired();

            });

            base.OnModelCreating(modelBuilder);
        }
    }
}


Add-Migration AddRepresentanteAndClientes - cria a migração
Update-Database - aplica ao banco de dados


using Fiap.Web.Alunos.Data;
using Fiap.Web.Alunos.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
namespace Fiap.Web.Alunos.Controllers
{
    public class ClienteController : Controller
    {

        private readonly DataBaseContext _databaseContext;
        public ClienteController(DataBaseContext databaseContext)
        {

            _databaseContext = databaseContext;

        }
        public IActionResult Index()
        {
            var clientes = _databaseContext.Clientes
                .Include(c=> c.Representante).ToList();
            // Evitando valores null 
            if (clientes == null)
            {
                clientes = new List<ClienteModel>();
            }
            return View(clientes);
        }

        [HttpGet]

        public IActionResult Create() {
            var selectListRepresentantes = new SelectList(_databaseContext.Representnates.ToList(),
                                                            nameof(RepresentanteModel.RepresentanteId),
                                                            nameof(RepresentanteModel.NomeRepresentante));
            ViewBag.Representantes = selectListRepresentantes;
            return View(new ClienteModel());
        }


        [HttpPost]
        public IActionResult Create(ClienteModel clienteModel)
        {
            _databaseContext.Clientes.Add(clienteModel);
            _databaseContext.SaveChanges();

            TempData["mensagemSucesso"] = $"O cliente {clienteModel.Nome} foi adicionado";

            return RedirectToAction(nameof(Index));
        }

        [HttpGet]
        public IActionResult Edit(int id) { 
            var selectListRepresentantes = new SelectList(_databaseContext.Representnates.ToList(),
                                                            nameof(RepresentanteModel.RepresentanteId),
                                                            nameof(RepresentanteModel.NomeRepresentante));
            ViewBag.Representantes = selectListRepresentantes;

            var clienteConsultado = _databaseContext.Clientes.Find(id);

            return View(clienteConsultado);

        }



        [HttpPost]

        public IActionResult Edit(ClienteModel clienteModel)
        {
            _databaseContext.Clientes.Update(clienteModel);
            _databaseContext.SaveChanges();
            return RedirectToAction(nameof(Index));
        }


        [HttpGet]

        public IActionResult Detail(int id) {
            var selectListRepresentantes = new SelectList(_databaseContext.Representnates.ToList(),
                                                    nameof(RepresentanteModel.RepresentanteId),
                                                    nameof(RepresentanteModel.NomeRepresentante));
            ViewBag.Representantes = selectListRepresentantes;

            var clienteConsultado = _databaseContext.Clientes.Find(id);

            return View(clienteConsultado);

        }
        // Anotação de uso do Verb HTTP Get
        [HttpGet]
        public IActionResult Delete(int id)
        {
            // Simulando a busca no banco de dados 
            var clienteConsultado = _databaseContext.Clientes.Find(id);

            if (clienteConsultado != null)
            {
                _databaseContext.Clientes.Remove(clienteConsultado);      
                _databaseContext.SaveChanges();
                TempData["mensagemSucesso"] = $"Os dados do cliente {clienteConsultado.Nome} foram removidos com sucesso";
            }
            else
            {
                TempData["mensagemSucesso"] = $"OPS !!! Cliente inexistente.";
            }
            return RedirectToAction(nameof(Index));
        }
    }
}


