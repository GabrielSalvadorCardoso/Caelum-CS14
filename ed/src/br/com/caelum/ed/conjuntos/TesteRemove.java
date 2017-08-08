package br.com.caelum.ed.conjuntos;

public class TesteRemove {

	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<String>();
		
		conjunto.adiciona("Isabel");
		conjunto.adiciona("Douglas");
		conjunto.adiciona("Guilherme");
		
		System.out.println("Antes de remover");
		for(String palavra : conjunto.pegaTodas()) {
			System.out.println(palavra);
		}
		
		conjunto.remove("Douglas");
		
		System.out.println("Depois de remover");
		for(String palavra : conjunto.pegaTodas()) {
			System.out.println(palavra);
		}
	}
}