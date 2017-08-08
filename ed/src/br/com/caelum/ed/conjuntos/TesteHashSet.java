package br.com.caelum.ed.conjuntos;

import java.util.HashSet;

public class TesteHashSet {

	public static void main(String[] args) {
		// Como não estamos usando o Generics, a classe irá trabalhar com Object
		HashSet conjunto = new HashSet();
		
		conjunto.add("Rogerio");
		conjunto.add("Malena");
		conjunto.add("Carlos");
		
		System.out.println(conjunto);
	}
}
