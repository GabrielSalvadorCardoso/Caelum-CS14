package br.com.caelum.ed.mapas;

import java.util.HashMap;

import br.com.caelum.ed.Carro;

public class TesteHashMap {

	public static void main(String[] args) {
		HashMap<String, Carro> mapa = new HashMap<String, Carro>();
		
		mapa.put("abcd1234", new Carro("a"));
		System.out.println(mapa);
		mapa.put("abcd1234", new Carro("b"));
		System.out.println(mapa);
		mapa.put("dcba1234", new Carro("c"));

		System.out.println(mapa.containsKey("abcd1234"));
		System.out.println(mapa.get("abcd1234"));
		mapa.remove("abcd1234");
		System.out.println(mapa);
	}
}