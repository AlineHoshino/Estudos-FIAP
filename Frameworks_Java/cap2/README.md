No Java os dados são manipulados como objetos e no banco de dados na forma de tabelas.Assim para persistir o objeto em ua tabela se faz necessário serializá-lo.
JPA - java persistence api
JPA - conjunto de boas práticas.
Hibernate e elcipse link. 
Hibernate permite o CRUD muito próxima a orientação a objeto.
~ -> indica que está na pasta pessoal

No pom adicionar o oracle, e o hibernate.
mvn repository.com
Todas as bibliotecas que nossa seção depende colocamos dentro das dependencias do pom.
Com o Maven ele ja faz tudo para a gente de colocar as bibliotecas. Usamos o jdbc e o Hibernate
Precisamos criar um arquivo chamado persistence.xml. Dentro da resources
Criar uma pasta chamada META-INF, depois cria um arquivo chamado persistence.xml


<?xml version="1.0" encoding="UTF-8"?>

<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd"
             version="2.2">
    <persistence-unit name="games" transaction-type="RESOURCE_LOCAL">

        <properties>
            <property name="javax.persistence.jdbc.driver" value="oracle.jdbc.driver.OracleDriver" />

            <property name="javax.persistence.jdbc.url" value="jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL" />
            <property name="javax.persistence.jdbc.user" value="nomeusuario" />
            <property name="javax.persistence.jdbc.password" value="senha" />

        </properties>

        <property name="hibernate.show_sql" value="true"/>

    </persistence-unit>

</persistence>


Unidade de persistencia - coloca o nome que voce acha que condiz.

        <property name="hibernate.show_sql" value="true"/> - toda vez no console a gente consegue ver a instrução sql que o banco de dados está executando

Depois criar o Modedl, com os atributos e criar os getters and setters com Alt + Insert
alt + isnsrt para criar o toString

Criar anotações para o hibernate saber criar a entidade

A classe Contato deve ter uma tabela correspondente no banco 
@Entity
@Table(name="tbl_contato") - manter a nomenclatura adequada no banco de dados
 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbl_contatos_seq")


 Entity Manager vai fazer a gestão do nosso banco de dados vai ser responsável pelo CRUD.
 Factory se conecta com o banco, e agora vou criar o objeto que faz o CRUD - que é o manager.


         em.getTransaction().begin();
        em.persist(contato);
        em.getTransaction().commit();


Comecei a transação e deu certo eu commito.

 <property name="hibernate.hbm2ddl.auto" value="update"/> - vai fazer a tabela no banco

 DAO - data acess object

 Uma estrutura para criar as classes que vão ser responsáveis por fazer a persistência no banco de dados

 Classe define o que é o bjeto, o DAO vai ter os métodos que vão persistir nesse objeto do banco de dados.

 Separar as responsabilidades, uma classe que sabe como persistir esse objeto no banco de dados

Propriedade em letra maiúsucla é uma consttante e não uma variável

package br.com.fiap.contatos.dao;

import br.com.fiap.contatos.model.Contato;
import jakarta.persistence.EntityManager;

public class ContatoDao {

    private EntityManager em;

    public ContatoDao(EntityManager em){
        this.em = em;
    }

    public void salvar(Contato contato){
        em.persist(contato);
    }

    public void atualizar(Contato contato){
        em.merge(contato);
    }


merge rsponsável pela atualização

No merge roda o select automaticamente.

Na exclusão tem de recuperar o objeto, quando devolver o registro, daí ele converte num objeto do tipo contato.


Consulta de dados com DAO

    public void consultarContatoPorId(Long id){
        Contato contatoConsulta = em.find(Contato.class, id);

        if(contatoConsulta == null){
            System.out.println("Contato não encontrado");
        }else{
            System.out.println(contatoConsulta.toString());
        }

    }


Numa loja te pedem o seu cpf e voce não lembra , entao voce passa sue nome e te acham 
Java persistence query language - JPQL

Como não estou alterando nada no banco não precisa de transação:
    public static void listarTodosOsContatos(EntityManager em){

        // Criar uma instancia do DAO

        ContatoDao  contatoDao = new ContatoDao(em);

        contatoDao.listarTodosOsContatos();

    }

    public List<Contato> listarTodosOsContatos(){

        String consulta = "SELECT c FROM Contato c ORDER BY nome ASC";
        return em.createQuery(consulta).getResultList();
    }

    public List<Contato> listarContatosPorEmail(String emailProcurado){
        String consulta = "SELECT c FROM Contato c WHERE email = :email";
        return em.createQuery(consulta, Contato.class)
                .setParameter("email", emailProcurado)
                .getResultList();
    }

E se agente quisesse dizer qual o tipo de contato exemplo se é familia, amigo. Poderia adicionar mais um atributo
Vamos criar outra entidade e relacionar essas tabelas.

    @OneToMany
    private TipoContato tipoContato;


        public static void cadastrar(EntityManager em){

        TipoContato tipoContato = new TipoContato();
        tipoContato.setId(1L);
        tipoContato.setTipo("familia");

        TipoContatoDao tipoContatoDao = new TipoContatoDao(em);

        em.getTransaction().begin();
//        tipoContatoDao.salvar(tipoContato);

        Contato contato = new Contato();
        contato.setNome("Pedro da Silva");
        contato.setEmail("pedro@email.com");
        contato.setDataNascimento(LocalDate.of(1997,5,13));
        contato.setTipoContato(tipoContato);

        // Criar uma instancia do DAO

        ContatoDao  contatoDao = new ContatoDao(em);

        contatoDao.salvar(contato);
        em.getTransaction().commit();

    }

Como já salvei o tipo contato família, não precisa criar de novo por isso está comentado

No unidirecional, apenas um lado conhece. 

Mapeamento bidirecioanal

Lado A precisa saber e o lado B também 

    @OneToMany(mappedBy = "tipoContato")
    private List<Contato> contatos;