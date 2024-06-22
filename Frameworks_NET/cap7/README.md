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

