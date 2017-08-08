package br.com.caelum.pilhas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Esta classe é parametrizada. Isto quer dizer que irá trabalhar somente com objetos do tipo que for informado
 * na instanciação da classe. <T> representa o tipo que foi informado na instanciação */
public class PilhaParametrizada<T> {
	
	/* LinkedList também é uma classe parametrizada e receberá objetos do mesmo tipo declarado na instanciação
	 * da classe PilhaParametrizada */
	private List<T> objetos = new LinkedList<T>();
	//private List<T> objetos = new ArrayList<T>();
	
	public void insere(T t) {
		this.objetos.add(t);
	}
	
	public T remove() {
		return this.objetos.remove( this.objetos.size() - 1 );
	}
	
	public T pegar(int posicao) {
		return this.objetos.get(posicao);
	}
	
	public boolean vazia() {
		return this.objetos.size() == 0;
	}
	
	public int tamanho() {
		return this.objetos.size();
	}
	
	public void esvaziar() {
		this.objetos.clear();
	}
}
