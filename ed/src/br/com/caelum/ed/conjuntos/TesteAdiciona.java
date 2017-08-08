package br.com.caelum.ed.conjuntos;

import java.util.List;

public class TesteAdiciona {

	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<String>();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Gabriel");
		conjunto.adiciona("Mariana");
		
		List<String> palavras = conjunto.pegaTodas();
		
		for(String palavra : palavras) {
			System.out.println(palavra);
		}
		
		System.out.println("Tamanho antes da inserção repetida: " + conjunto.tamanho());
		conjunto.adiciona("Gabriel");
		System.out.println("Tamanho depois da inserção repetida: " + conjunto.tamanho());
	}
}
