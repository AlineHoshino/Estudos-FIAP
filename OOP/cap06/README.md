3 categorias de objetos: 

objetos físicos - carros
objetos conceituais - matemática
objetos de software - conta corrente, usuário

Dica digitar main e apetar ctrl + espaço para ver todas as opções
public static void main(String[] args)
O static acima significa estático - acessado diretamente da memória sem gerar um objeto.

variavel dentro dos métodos, atributo dentro da classe
No exemplo do professor na idade ele  usou byte para receber até 3 digitos

Métodos - responsável para que o comportamento se torne a ação de um objeto
Sintaxe o método:
<modificador>- nível de acessibilidade 
<tipo de retorno> - retorno do método, alguns serão void- não retornam nada
<nomeDoMetodo> - exemplo- exibeSaldo
(<lista de argumentos>) - pode ter nenhum ou vários
abra chaves {} para começar a lista de instruções
exemplo:
void depositar(int agencia, string numeroConta, double valor){

}

Sintaxe dos argumentos: primeiro passar o tipo de dado, depois separa por vírgulas os demais parametros 

Segue exemplo de método:
	public void depositar(double valor) {
		saldo = saldo + valor;
	}


Sobrecarga de métodos - significa ter mais de uma versão de um mesmo método. A versão precisa ter parametros diferentes seja no tipo ou número de parametro

public class Conta {
    double saldo;
    public void retirar(double valor) {
        saldo = saldo - valor;
    }
    public void retirar(double valor, double taxa) {
        saldo = saldo - valor - taxa;
    }
}

Ou seja eles tem assinaturas diferentes. Assinatura nome do método e os tipos de dados da lista de argumentos.

This referencia atributo ou método do escopo daquela classe;

Construtor:
É possível criar lógica durante a construção do objeto.
Construtor precisa ter o mesmo nome de uma classe, não ter retorno nem mesmo voide, não aceita return
Usa o new. Toda classe precisa ter pelo menos um construtor, java já tem um construtor padrão

Este seria o construtor padrão:

	public Conta() {
		
	}

Este o construtor com parametros:
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

Como debugar- Coloque um ponto do lado da linha que voce quer, aperte no inseto, F6, passe o mouse por cima para ver os dados daquela conta
Posso criar um construtor de forma automática botão direito, source, generate constructorusing fields

	int agencia; => são friendly não existe modificador ao declarar
	int numero;
	double saldo;

	public Conta(int numero, double saldo) {  => public qualquer outra classe pode construir um objeto a partor desses construtores
		this.numero = numero;
		this.saldo = saldo;
	}

	public class ContaCorrente {
	
	/**
	 * Realiza um depósito na conta corrente
	 * @param agencia O número da agencia
	 * @param numero O número da conta
	 * @param valor O valor que será depositado
	 * @return O número do protocolo de confirmação
	 */
	public int depositar(int agencia, long numero, double valor){
		//implementação do método
		return 0;
	}
	
}

@author - desenvolvedor

/** para criar um javadoc
Depois vai em Project generateJavadoc
Clica em finish, depois vai gerar no menu do lado uma pasta doc, clica no index.html, botao direito do mouse open with - web browser
Ficando assim:
![javaweb](https://github.com/AlineHoshino/Estudos-FIAP/assets/83770726/35e81b5c-7b57-42e0-88bb-46afb4bd661e)
