package com.fiap;

public class Teste {
	public static void main(String[] args) {
		Carro[] carros = new Carro[2];

		Carro carro1 = new Carro();
		carro1.setModelo("Gol");
		Carro carro2 = new Carro();
		carro2.setModelo("Teste");

		carros[0] = carro1;
		carros[1] = carro2;
		
		
		for (Carro carro : carros){
			  System.out.println(carro.getModelo());
			}
		
		String facu = "FIAP – A melhor faculdade de tecnologia.";

		char caractere = facu.charAt(1);
		System.out.println("O segundo caractere da string é " + caractere);
	}
}