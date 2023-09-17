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