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