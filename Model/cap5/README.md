Dentro da plataforma Java, podemos classificar as exceções em:
- Checked : exceção que deve ser tratada pelo desenvolvedor
- Unchecked- que pode ser tratada ou relançada pelo desenvolvedor
Error: Erro crítico, utilizado pelo JVM para indicar que existe um problema que não permite a execução do programa continuar.


try{
			//Código
		}catch(Exceção){
			//Tratamento da exceção
    }

    Um exemplo clássico da utilização do bloco finally é o fechamento da conexão
com o banco de dados. Sempre devemos fechar a conexão, independentemente da
concretização ou não da operação no banco.


Então, a melhor maneira de tratar a exceção é não a tratar. Isto é, no caso,
devemos somente propagar a exceção, notificando ao ambiente de chamada que
algum problema aconteceu na execução. Para isso, devemos adicionar na assinatura
do método o throws, com a exceção que queremos propagar:
public int dividir(int n1, int n2) throws Exception{
		return n1 / n2;
}

Um método pode propagar mais de um tipo de exceção. Para isso, basta
adicionar as exceções separadas por vírgula:
public void gravarArquivo(String valor) throws
SecurityException, FileNotFoundException, IOException{
//Código...
}

Portanto, a cláusula throws declara exceções que podem ser lançadas em
determinados métodos. Isso é uma vantagem para os desenvolvedores, pois
deixamos de modo explícito os eventuais erros que podem ocorrer na chamada do
método, permitindo que o tratamento adequado para o erro seja implementado.
Podemos também lançar uma nova exceção nesse método, bastando utilizar o
comando throw

Podemos também lançar uma nova exceção nesse método, bastando utilizar o
comando throw

public void depositar(double valor){
if (valor < 0){
throw new IllegalArgumentException();
}
saldo = saldo + valor;
}

public void sacar(double valor) throws Exception{
if (valor > saldo){
throw new Exception("Saldo insuficiente");
}
saldo = saldo - valor;
}

O método acima valida se o valor a ser retirado é maior do que o valor do saldo.
Caso o valor do saldo seja insuficiente, uma exceção será lançada. Para isso, foi
necessário adicionar o throws na assinatura do método. Dessa forma, quem chamar
o método sacar deve tratar a exceção ou lançá-la novamente, conforme podemos
observar no Código-fonte “Método sacar”.

public static void main(String[] args) {
// Cria uma nova instância de Conta
Conta c = new Conta();
try {
// Saca
c.sacar(100);
} catch (Exception e) {
e.printStackTrace();
}
// Deposita
c.depositar(200);
}

A primeira exceção será unchecked, ou seja, ela vai descender de
RuntimeException. Por padrão, as exceções no Java terminam com Exception:
public class ValorInvalidoException extends RuntimeException {
}
Para utilizá-la, vamos modificar o método sacar para que lance a nossa
exceção customizada:
public void depositar(double valor){
if (valor < 0){
throw new ValorInvalidoException();
}
saldo = saldo + valor;
}

public class Conta {
protected double saldo;

public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo){
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
}
}
public class ContaCorrente extends Conta{

	private double limite;

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo + limite){
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
}

2 MODIFICADOR FINAL
O modificador final trabalha de forma contrária em relação ao modificador
abstract. Uma classe Java marcada como final não pode ser estendida. Exemplo:
public final class ContaPoupanca extends Conta {
@Override
public double verificarSaldo() {
return saldo;
}

A classe ContaPoupanca não pode possuir nenhuma subclasse. Dessa forma,
não podemos utilizá-la como base para criar nenhuma outra classe:
public class ContaPoupancaEspecial extends
ContaPoupanca{//Não Compila
}

O código mostrado não compila, pois, a ContaPoupanca está marcada como
final e, por isso, não pode ser estendida.

2.1 Modificador static
Outro modificador presente na plataforma Java é o static. Esse modificador
pode ser aplicado aos membros de uma classe: métodos e atributos. Um atributo ou
método estático é compartilhado por todas as instâncias de uma determinada classe.
Existem valores de atributos que devem ser compartilhados entre todos os objetos de
uma Classe, dessa forma, podemos marcá-los com o modificador static.

Interface é um contato entre a classe e o mundo externo. Quando uma classe
implementa uma interface, ela está comprometida a fornecer todos os
comportamentos definidos na interface.

Todas as entradas e saídas em Java são definidas em termos de fluxos, ou
streams, que são sequências ordenadas de dados que possuem uma fonte de origem,
os streams de entrada, ou um destino, no caso de streams de saída

• Output stream: para gravar em um destino.
• Input stream: para ler de uma fonte.

tratar a exceção IOException, pois podemos ter
problemas na hora de abrir ou manipular o arquivo