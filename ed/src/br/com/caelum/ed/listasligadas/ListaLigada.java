package br.com.caelum.ed.listasligadas;

public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}		
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if(this.totalDeElementos == posicao) {
			this.adiciona(elemento);
		} else {
			Celula proxima = this.pegaCelula(posicao);
			Celula anterior = proxima.getAnterior();
			
			Celula nova = new Celula(elemento);
			
			anterior.setProxima(nova);
			nova.setAnterior(anterior);
			nova.setProxima(proxima);
			proxima.setAnterior(nova);
			
			this.totalDeElementos++;
		}
	}
	
	public Object pega(int posicao) {
		return pegaCelula(posicao).getElemento();
	}
	
	public void remove(int posicao) {
		if(!celulaOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		if(posicao == 0) {
			this.removeDoComeco();
		}else if(posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula atual = this.pegaCelula(posicao);
			Celula anterior = atual.getAnterior();
			Celula proxima = atual.getProxima();
			
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	
	public boolean contem(Object o) {
		for(int i = 0; i < this.totalDeElementos; i++) {
			if(o.equals(this.pegaCelula(i).getElemento())) {
				return true;
			}
		}
		
		return false;
	}
	
	public void adicionaNoComeco(Object elemento) {		
		if(this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;			
		} else {
			// A nova célula aponta para a antiga primeira
			Celula nova = new Celula(this.primeira, elemento);
			
			// A antiga primeira célula aponta para a nova célula, que é o nova primeira
			this.primeira.setAnterior(nova);
			
			// A nova célula passa a ser a primeira da lista
			this.primeira = nova;
		}
		
		this.totalDeElementos++;
	}
	
	public void removeDoComeco() {
		if(!this.celulaOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		this.primeira = this.primeira.getProxima(); // pode retornar null, o que esvaziará a lista
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim() {
		if(!celulaOcupada(0)) { // Se a lista já estiver vazia, lançe uma excecao
			throw new IllegalArgumentException("Posição não existe");
		} else if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
	}
	
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		Celula atual = this.primeira;
		
		for(int i = 0; i < this.totalDeElementos -1; i++) {			
			builder.append(atual.getElemento());
			builder.append(", ");			
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
	private boolean celulaOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private Celula pegaCelula(int posicao) {
		if(!celulaOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		Celula atual = this.primeira;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual; // Retorna a celula correspondente a posição indicada
	}
}
