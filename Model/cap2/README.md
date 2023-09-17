int [] notas = new int[40];
No  momento  da  declaração,  precisamos  definir  entre  os  colchetes  o comprimento do array.Neste exemplo, criamos um arrayde 40 números inteiros. Ao criar um arrayde números, todos os elementos são inicializados com 0. Um arrayde boolean é inicializado com false,e um arrayde objeto é inicializado com nul

Existem duas formas de declarar um vetor com suas posições preenchidas com valores predeterminados:aprimeira consiste em atribuir uma lista de valores entre chaves { }, sendo cada valor separado por vírgula:int notas[] = {10,9,8,2};

2 jeito usa o operador new:
int notas[] = new int{10,9,8,2};

// Calcular a média dos alunos
float totalNotas = 0;
for(int i=0;i<notas.length;i++) {
  totalNotas = totalNotas + notas[i];
}
float mediaNotas = totalNotas/notas.length;
System.out.println("A média dos alunos é " + mediaNotas);

Carro[] carros = new Carro[5];

Carro carro = new Carro();
carro.setModelo("Gol");

carros[0] = carro;

for (<tipo> <variável> : <array>){
  <instruções>
}

for (Carro carro : carros){
  System.out.println(carro.getModelo());
}


Comparação de strings- A comparação de string deve ser realizada por meio de métodos. Os principais métodos para comparação são:equals(string):verifica a igualdade do valor das strings.equalsIgnoreCase(string):verifica a igualdade do valor das strings sem diferenciar as letras maiúsculas e minúsculas. Não devemos utilizar o operador == para comparar strings,pois esse operador compara o endereço de memória em que a string está alocada em vezdo valor armazenado nastring.
String nome = new String("FIAP");
String nome2 = new String("FIAP");

if (nome == nome2){
  System.out.println("As Strings são iguais.");
}else{
  System.out.println("As Strings são diferentes.");
}

As duas variáveis têm o mesmo valor, porém estão alocadas em endereços de memória diferentes. Dessa forma, o resultado será “As strings são diferentes”, pois o operador == compara o endereço de memória e não o valor

sem instanciar 

String nome = "FIAP";
String nome2 = "FIAP";

if (nome == nome2){
  System.out.println("As Strings são iguais.");
}else{
  System.out.println("As Strings são diferentes.");
}


Por esse motivo, é extremamente recomendado sempre utilizar os métodos
para realizar a comparação de strings, porque eles funcionam independentemente da
forma que a variável foi inicializada.

1.4.1.1 Método equals
O método equals compara o conteúdo de duas strings, diferenciando os
caracteres maiúsculos e minúsculos. Dessa forma, a string “Fiap” é diferente de “fiap”.
O exemplo abaixo compara o conteúdo das variáveis, assim o valor impresso no
console será “As strings são iguais

String nome = "FIAP";
String nome2 = new String("FIAP");

if (nome.equals(nome2)){
  System.out.println("As Strings são iguais.");
}else{
  System.out.println("As Strings são diferentes.");
}


O método equalsIgnoreCase compara o conteúdo de duas strings, mas não
diferencia os caracteres maiúsculos e minúsculos. Assim sendo, a string “Fiap” é igual
à string “fiap”
Collection - List ArrayList e Set
List - ordenados que podem ser repetidos

package com.fiap;
import java.util.ArrayList;
import java.util.List;
public class Teste {
	public static void main(String[] args) {
		List<String> carrinho = new ArrayList<String>();
		System.out.println(carrinho.isEmpty());
		
		carrinho.add("maça");
		carrinho.add("morango");
		carrinho.add("maça");
		carrinho.set(1,  "Pera");
		
		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size);
		
	}
}

Interface List e uso de Generics, Generics não permite tipos primitivos
isEmpty(retorna True ou False)
set altera a lista,size retorn o tamanho
2.2 Set
A interface Set define uma coleção que não pode conter valores duplicados.
Corresponde à abstração de um conjunto que funciona de forma análoga aos
conjuntos da matemática. Outro ponto importante é que nem sempre a ordem de
inserção dos elementos será a ordem dos elementos dispostos na coleção, isso pode
variar de implementação para implementação. A interface contém somente os
métodos herdados da interface Collection:
Podemos armazenar informações em mapas, que são muito úteis quando
precisamos recuperar de forma rápida as informações do objeto. Para isso, é preciso
passar uma chave. Por exemplo, podemos armazenar o objeto Aluno em um mapa e
utilizar o RM como chave. Dessa forma, é possível informar o RM do aluno para
recuperar o objeto que tem todas as suas informações