package com.fiap;
import java.util.HashMap;
import java.util.Map;
public class Teste {
	public static void main(String[] args) {
		Map<String, String> caixa = new HashMap<String, String>();
		caixa.put("M222", "Fer");
		caixa.put("M223", "Lu");
		caixa.put("M224", "Line");
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M222"));
		System.out.println(caixa.containsValue("Line"));
		System.out.println(caixa);

	}
}