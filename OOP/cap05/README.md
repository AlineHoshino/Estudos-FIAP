Por exemplo, para a faculdade FIAP, que possui o domínio fiap.com.br e está
desenvolvendo um projeto para e-commerce, o pacote será definido como
br.com.fiap.ecommerce.

package br.com.fiap.tds;
public class OlaMundo {
	public static void main(String[] args) {
		System.out.println("FIAP - Olá Mundo!");
	}
	
}

Vamos executar o programa. Para isso, utilize o atalho F11 ou o botão “play”
localizado na barra de ferramentas.

Variaveis em Java:

int idade = 10;
double preco = 10.0;
char sexo = ‘M’;
boolean maiorIdade = false;

Os nomes das variáveis podem começar com uma letra, um caractere de
sublinhado (_) ou $. Depois do primeiro caractere, os nomes das variáveis podem
conter qualquer combinação de letras ou números

Observe que para o valor do tipo float (peso) foi preciso adicionar a letra f no
final do número para o Java entender que o número é do tipo float e não double.
Outro detalhe é que o valor do char deve estar entre aspas simples (‘).
Aqui foi feito um cast, mas só vai o valor inteiro 
package br.com.fiap.tds;
public class ConvesaoComCast {
	public static void main(String[] args) {
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble;
		System.out.println(valorInt);
	}
	
}

System.out.Println(); existe também a instrução System.out.Print(); sendo que a
diferença entre eles é a quebra de linha. O Println pula uma linha no final, enquanto
o Print somente imprime a informação e continua na mesma linha.

Informações inseridas pelo usuário usa o Scanner.
Scanner sc = new Scanner(System.in);
Scanner sc = new Scanner(System.in);
int idade = sc.nextInt();
double preco = sc.nextDouble();

import java.util.Scanner;