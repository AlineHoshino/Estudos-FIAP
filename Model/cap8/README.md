Ao criar uma tabela da para arrastar a tabela na parte que digita as queries e escolher a instrução update , insert, delete , select 
Pode cirar uma sequencia de forma visual tambem-> Clicando na pasta sequencias
PreparedStatement stmt = conexao.prepareStatement("INSERT INTO TAB_COLABORADOR(CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?)");
  stmt.setString(1, "Thiago"); //Primero parâmetro (Nome)
  stmt.setString(2, "thiago@gmail.com");//Segundo parâmetro (Email)
  stmt.setDouble(3, 5000); //Terceiro parâmetro (Salário)
  //Instancia um objeto do tipo java.sql.Date com a data atual
  java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
  stmt.setDate(4,data);//Quarto parâmetro (data contratação)
        
  stmt.executeUpdate();


Para executar comandos SQLs no SGBDR, existem três objetos do tipo
Statement:
Statement: utilizado para executar um comando SQL estático. 
Statement stmt = conexao.createStatement();
stmt.executeUpdate("DELETE FROM TAB_COLABORADOR WHERE
CODIGO_COLABORADOR = 1");

Prepared Statement: utilizado para executar um comando SQL que recebe
um ou mais parâmetros. 

Callable Statement: utilizado para chamar stored procedures ou
functions.
Os principais métodos dessas implementações são:
.executeUpdate: executa um comando SQL(INSERT, UPDATE, DELETE)
e retorna o número de linhas afetadas.
executeQuery: executa um comando SQL(SELECT) e retorna o(s)
resultado(s) por meio de um objeto do tipo ResultSet.
Para recuperar o objeto do tipo Statement, utilizamos o método
createStatement(), da interface Connection, conforme ilustraremos a seguir:

Callable Statement: utilizado para chamar stored procedures ou
functions.
Os principais métodos dessas implementações são:
.executeUpdate: executa um comando SQL(INSERT, UPDATE, DELETE)
e retorna o número de linhas afetadas.
executeQuery: executa um comando SQL(SELECT) e retorna o(s)
resultado(s) por meio de um objeto do tipo ResultSet.
Para recuperar o objeto do tipo Statement, utilizamos o método
createStatement(), da interface Connection, conforme ilustraremos a seguir:

PreparedStatement stmt = conexao.prepareStatement("INSERT INTO TAB_COLABORADOR(CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?, ?, ?)");
  stmt.setString(1, "Thiago"); //Primero parâmetro (Nome)
  stmt.setString(2, "thiago@gmail.com");//Segundo parâmetro (Email)
  stmt.setDouble(3, 5000); //Terceiro parâmetro (Salário)
  //Instancia um objeto do tipo java.sql.Date com a data atual
  java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
  stmt.setDate(4,data);//Quarto parâmetro (data contratação)
        
  stmt.executeUpdate();


  Observe que, no lugar dos dados dos parâmetros, foram adicionados pontos
de interrogação (?) para que, posteriormente, informemos os respectivos valores por
meio dos métodos set, que serão escolhidos de acordo com o tipo de dado. Esse
método recebe dois parâmetros: o primeiro é a posição do ponto de interrogação (?),
que se inicia em 1, e o segundo é o valor que será atribuído a essa posição. Para cada
uma das operações em SQL, é possível utilizar o PreparedStatement, como
observaremos em cada um deles:
Evita SQL Injection

A interface ResultSet é responsável pelo conjunto de registros retornados de
um comando SELECT do SQL. Por meio desse tipo de objeto, podemos navegar por
seus registros de forma sequencial. Dessa forma, precisamos chamar o método next
para mover o cursor para o próximo registro. Esse método retorna false quando não
conseguir ir para o próximo registro, o que caracteriza o final dos registros.
Inicialmente, o cursor está posicionado antes do primeiro registro. As colunas do
registro podem ser acessadas por meio de um índice que representa a posição da
coluna (inicia em 1) ou por meio do próprio nome da coluna. Veja os principais
métodos:
next: move o cursor para a próxima linha.
getInt: retorna os dados da coluna designada como um int do Java.
getString: retorna os dados da coluna designada como uma String do
Java.
getBoolean: retorna os dados da coluna designada como um boolean do
Java.
getDouble: retorna os dados da coluna designada como um double do
Java.
Exemplo:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TesteView {
PDF exclusivo para Aline Eiko Hoshino - rm99291
hoshinoaline@yahoo.com.br
Quando o café javanês consulta o oráculo
public static void main(String[] args) {
try {
//Registra o Driver
Class.forName("oracle.jdbc.driver.OracleDriver");
//Abre uma conexão
Connection conexao = DriverManager.getConnection(
"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
"OPS$PF0392", "123456");
System.out.println("Conectado!");
PreparedStatement stmt = conexao.prepareStatement("SELECT *
FROM TAB_COLABORADOR WHERE NOME = ?");
stmt.setString(1, "Thiago");
ResultSet result = stmt.executeQuery();
//Percorre todos os registros encontrados
while (result.next()){
//Recupera os valores de cada coluna
int codigo = result.getInt("CODIGO_COLABORADOR");
String nome = result.getString("NOME");
String email = result.getString("EMAIL");
double salario = result.getDouble("SALARIO");
java.sql.Date data =
result.getDate("DATA_CONTRATACAO");
//Exibe as informações do registro
System.out.println(codigo + " " + nome + " " +
email + " " + salario + " " + data);
}
//Fecha a conexão
conexao.close();
//Tratamento de erro
} catch (SQLException e) {
System.err.println("Não foi possível conectar no
Banco de Dados");
e.printStackTrace();
} catch (ClassNotFoundException e) {
System.err.println("O Driver JDBC não foi
encontrado!");
e.printStackTrace();
}


ACID é uma sigla para as quatro principais características que definem uma transação: Atomicidade, Consistência, Isolamento e Durabilidade