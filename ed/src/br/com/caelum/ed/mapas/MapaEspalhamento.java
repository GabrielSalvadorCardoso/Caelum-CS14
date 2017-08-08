package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* Esta classe reproduz o funcionamento da classe HashMap */
public class MapaEspalhamento<C, V> {
	private List<List<Associacao<C, V>>> tabela = new ArrayList<List<Associacao<C, V>>>();
	
	public MapaEspalhamento() {
		// Preenche a tabela com 100 LinkedList
		for(int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<Associacao<C, V>>()); 
		}
	}
	
	public void adiciona(C chave, V valor) {
		if(contemChave(chave)) {
			this.remove(chave);
		}
		
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);
		lista.add(new Associacao<C, V>(chave, valor));
	}
	
	public void remove(C chave) {
		if(contemChave(chave)) {
			int indice = this.calculaIndiceDaTabela(chave);
			List<Associacao<C, V>> lista = this.tabela.get(indice);
			for(int i = 0; i < lista.size(); i++) {
				Associacao<C, V> associacao = lista.get(i); 
				if(associacao.getChave().equals(chave)) {
					lista.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("Chave não existe");
		}
	}

	public boolean contemChave(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);
		for(int i = 0; i < lista.size(); i++) {
			Associacao<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}
	
	public V pega(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);
		
		for(int i = 0; i < lista.size(); i++) {
			Associacao<C, V> associacao = lista.get(i);
			if(associacao.getChave().equals(chave)){
				return associacao.getValor();
			}
		}
		throw new IllegalArgumentException("Chave não exite");
	}

	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}
	
	public List<Associacao<C, V>> pegaTodas() {
		List<Associacao<C, V>> lista = new ArrayList<Associacao<C, V>>();
		
		for(int i = 0; i < this.tabela.size(); i++) {
			lista.addAll(this.tabela.get(i));
		}
		
		return lista;
	}
	
	@Override
	public String toString() {
		// Pega todas retorna um ArrayList com todos os elementos do mapa
		// invocar o método to string do ArrayList irá mostrar todos os elementos entere '[' e ']'
		return this.pegaTodas().toString();
	}
}
