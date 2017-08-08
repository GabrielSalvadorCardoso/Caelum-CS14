package br.com.caelum.ed.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* A classe implementada abaixo tem o objetivo de reproduzir o funcionamento de um HashSet*/
public class ConjuntoEspalhamento<T> {
	private List<List<T>> tabela = new ArrayList<List<T>>();
	private int tamanho = 0; // Total de palavra em todo o conjunto
	
	public ConjuntoEspalhamento() {
		for(int i = 0; i < 26; i++) { // 26 letras do alfabeto
			// As listas secundárias(armazenadas na lista principal) terão LinkedList como implementação
			LinkedList<T> lista = new LinkedList<T>();
			this.tabela.add(lista);
		}
	}
	
	private int calculaIndiceDaTabela(T objeto) {
		int codigoDeEspalhamento = Math.abs( objeto.hashCode() ); // Retirando sinais
		// Cada char tem uma representação em decimal
		// Portanto char % 26 sempre retornará um número entre 0 e 25
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	/*// Este método pode ser substituido pelo uso do método hashCode de Object
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for(int i = 0; i < palavra.length(); i++) {
			// O número 31 dará um peso a cada caracter da palavra evitando que anagramas tenha codigo iguais
			codigo = 31 * codigo + palavra.charAt(i);
		}
		return codigo;
	}*/
	
	public void adiciona(T objeto) {
		if(!contem(objeto)) {
			this.verificaCarga();
			int indice = this.calculaIndiceDaTabela(objeto); // Gera um indice de acordo com a primeira letra
			List<T> lista = this.tabela.get(indice); // Retorna a lista correspondente ao indice gerado
			lista.add(objeto); // Adiciona a palavra na lista retornada
			this.tamanho++;
		}
	}
	
	public List<T> pegaTodas() {
		List<T> objetos = new ArrayList<T>();
		for(int i = 0; i < this.tabela.size(); i++) { // tabela.size() == 26 == número de letras do alfabeto
			objetos.addAll(this.tabela.get(i)); // Adiciona todas as palavra de cada lista secundária
		}
		return objetos;
	}
	
	public void remove(T objeto) {
		if(contem(objeto)) {
			int indice = this.calculaIndiceDaTabela(objeto);
			List<T> lista = this.tabela.get(indice);
			lista.remove(objeto); // Remove a primeira ocorrência, o suficiente para estrutura sem repetições
			this.tamanho--;
			this.verificaCarga();
		}
	}
	
	public boolean contem(T objeto) {
		int indice = this.calculaIndiceDaTabela(objeto);
		List<T> lista = this.tabela.get(indice);
		
		return lista.contains(objeto);
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void imprimeTabela() {		
		for(List<T> lista : this.tabela) {
			
			System.out.print("[");
			
			for(int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			
			System.out.println("]");
			
		}
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<T> objetos = this.pegaTodas(); // Recupera todas as palavras da tabela
		this.tabela.clear(); // Apaga todas as listas da tabela e seus respectivos dados
		
		for(int i = 0; i < novaCapacidade; i++) {
			// Adiciona novas listas de acordo com a novaCapacidade
			this.tabela.add(new LinkedList<T>());
		}
		
		for(T objeto : objetos) {
			// Recoloca as palavras nas listas iniciando o processo de adição para cada palavra adicionada
			this.adiciona(objeto);
		}
	}
	
	private void verificaCarga() {
		double carga = (double) this.tamanho / this.tabela.size();
		
		if(carga > 0.75) { // Se o numero de elementos ocupar mais de 75% da capacidade total, dobramos a capacidade
			this.redimensionaTabela(this.tamanho * 2);
		} else if(carga < 0.25) { // Se ocupar menos de 25%, então cortamos a capacidade pela metade mantendo o minimo de 10
			this.redimensionaTabela( Math.max(this.tamanho / 2, 10) ); // Math.max(a, b) determina o maior numero entre a e b
		}
	}
}
