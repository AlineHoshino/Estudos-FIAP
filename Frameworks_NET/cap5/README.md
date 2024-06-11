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

Manipulação de dados - 06:45