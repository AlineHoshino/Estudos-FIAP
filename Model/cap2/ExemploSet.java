package com.fiap;
import java.util.HashSet;
import java.util.Set;
public class TesteSet {
	public static void main(String[] args) {
		Set<String> cesta = new HashSet<String>();
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		System.out.println(cesta.size());
		System.out.println(cesta);
	}
}