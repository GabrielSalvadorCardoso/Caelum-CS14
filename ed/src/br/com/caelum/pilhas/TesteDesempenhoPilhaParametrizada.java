package br.com.caelum.pilhas;

import br.com.caelum.ed.Peca;

public class TesteDesempenhoPilhaParametrizada {

	public static void main(String[] args) {
		PilhaParametrizada<Peca> pilhaDePecas = new PilhaParametrizada<Peca>();
		
		// INSERÇÃO
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			Peca peca = new Peca();
			
			pilhaDePecas.insere(peca);
		}
		
		long fim = System.currentTimeMillis();		
		System.out.println("Tempo de inserção: " + (fim - inicio) + " milissegundos");
				
		//REMOÇÃO
		inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			pilhaDePecas.remove();
		}
		
		fim = System.currentTimeMillis();
		System.out.println("Tempo de remoção: " + (fim - inicio) + " milissegundos");
		
		// Tempo de inserção e de remoção do ArrayList e do LinkedList praticamente idênticos
	}
}
