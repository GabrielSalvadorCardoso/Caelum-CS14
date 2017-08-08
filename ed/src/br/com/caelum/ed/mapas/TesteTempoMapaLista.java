package br.com.caelum.ed.mapas;

import br.com.caelum.ed.Carro;

public class TesteTempoMapaLista {

	public static void main(String[] args) {
		MapaLista mapa = new MapaLista();
		int nElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		// INSERÇÃO
		for(int i = 0; i < nElementos; i++) {
			mapa.adiciona("" + i, new Carro("Carro: " + i));
		}
		
		// RECUPERAÇÃO
		for(int i = 0; i < nElementos; i++) {
			mapa.pega("" + i);
		}
		
		// VERIFICA CHAVE
		for(int i = 0; i < nElementos; i++) {
			mapa.contem("" + i);
		}
		
		for(int i = 0; i < nElementos; i++) {
			mapa.remove("" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo total da operação: " + (fim - inicio) + " milessegundos");
	}
}
