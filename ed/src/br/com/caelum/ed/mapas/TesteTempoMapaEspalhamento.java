package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public class TesteTempoMapaEspalhamento {

	public static void main(String[] args) {
		MapaEspalhamento<String, Carro> mapa = new MapaEspalhamento<String, Carro>();
		int numElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		// INSERÇÃO
		for(int i = 0; i < numElementos; i++) {
			mapa.adiciona("" + i, new Carro("Carro: " + i));
		}
		
		// RECUPERAÇÃO
		for(int i = 0; i < numElementos; i++) {
			mapa.pega("" + i);
		}
		
		// VERIFICAÇÃO
		for(int i = 0; i < numElementos; i++) {
			mapa.contemChave("" + i);
		}
		
		// REMOÇÃO
		for(int i = 0; i < numElementos; i++) {
			mapa.remove("" + i);
		}
		
		long fim = System.currentTimeMillis();		
		System.out.println("Tempo total de execução: " + (fim - inicio) + " milessegundo");
	}
}
