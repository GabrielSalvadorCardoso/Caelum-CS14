package br.com.caelum.ed.mapas;

import java.util.List;

import java.util.ArrayList;

public class MapaLista<C, V> {
	private List<Associacao<C, V>> associacoes = new ArrayList<Associacao<C, V>>();
	private int tamanho = 0;
	
	public void adiciona(C placa, V carro) {
		if(!contem(placa)) {
			Associacao associacao = new Associacao(placa, carro);
			this.associacoes.add(associacao);
			this.tamanho++;
		}
	}
	
	public V pega(C placa) {
		if(contem(placa)) {
			for(Associacao<C, V> associacao : this.associacoes) {
				if( placa.equals(associacao.getChave()) ) {
					return associacao.getValor();
				}
			}
		}
		throw new IllegalArgumentException("Chave não existe");
	}
	
	public void remove(C placa) {
		if(contem(placa)) {
			for(int i = 0; i < this.associacoes.size(); i++) {
				if( placa.equals(this.associacoes.get(i).getChave()) ) {
					this.associacoes.remove(i);
					this.tamanho--;
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave não existe");
		}
	}
	
	public boolean contem(C placa) {
		for(Associacao<C, V> associacao : this.associacoes) {
			if( placa.equals(associacao.getChave()) ) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
}
