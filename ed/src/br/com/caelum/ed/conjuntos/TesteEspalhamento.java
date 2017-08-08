package br.com.caelum.ed.conjuntos;

public class TesteEspalhamento {

	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<String>();
		
		for(int i = 0; i < 100; i++) {
			conjunto.adiciona("" + i);
		}

		conjunto.imprimeTabela();
	}
}
