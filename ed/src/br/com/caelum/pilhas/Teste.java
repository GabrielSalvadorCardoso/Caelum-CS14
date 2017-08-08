package br.com.caelum.pilhas;

import br.com.caelum.ed.Peca;

public class Teste {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		Peca pecaInsere = new Peca();
		
		pilha.insere(pecaInsere);
		
		Peca pecaRemove = pilha.remove();
		
		if(pecaInsere != pecaRemove) {
			System.out.println("ERRO: Peça inserida diferente da removida");
		}
		
		if(!pilha.vazia()) {
			System.out.println("ERRO: Pilha não esta vazia");
		}
	}
}
