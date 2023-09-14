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