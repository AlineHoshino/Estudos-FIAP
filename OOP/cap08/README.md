Não pode ter heranças multiplas, ou seja nao posso que um aluno herde de pessoa e de outra classe
É possível fazer herança multipla entre interfaces, entre classes jamais
Usa o extends. 
public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial
	}

Usar o super para pegar o método de saldo 
Pode criar variavel a partir da superclasse
Pode criar a partir da subclasse

	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}

Dois metodos com a mesma assinatura, só que usa de duas formas diferentes - chamamos isso de polimorfismo
Com isso nao precisa criar um metodo chamado retirarComTaxa
Não existe herança de construtores
A  anotação @Overridemarca  o  método,  identificando  que  o  método  está sobrescrevendo um método de sua superclasse. 

Outras duas regras dos construtores são: 1) Não são herdados. 2) A chamada do construtor da superclasse deve ser sempre feita na primeira linha do construtor da subclasse.