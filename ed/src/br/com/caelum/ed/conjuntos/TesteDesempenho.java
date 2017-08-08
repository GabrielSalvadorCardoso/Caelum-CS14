package br.com.caelum.ed.conjuntos;

public class TesteDesempenho {

	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<String>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			conjunto.adiciona("palavra" + i);
		}
		
		for(int i = 0; i < 50000; i++) {
			conjunto.contem("palavra" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de inserção e de varificação: " + (fim - inicio) + " milessegundos");
	}
}
