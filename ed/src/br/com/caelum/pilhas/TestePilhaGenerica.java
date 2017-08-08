package br.com.caelum.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaGenerica {

	public static void main(String[] args) {
		PilhaGenerica pilhaGenerica = new PilhaGenerica();
		Peca pecaInsere = new Peca();
		
		pilhaGenerica.insere(pecaInsere);
		
		Object pecaRemove = pilhaGenerica.remove();
		
		
		if(pecaInsere != pecaRemove) {
			System.out.println("ERRO: Peca inserida é diferente da removida");
		}
		
		if(!pilhaGenerica.vazia()) {
			System.out.println("ERRO: Pilha não esta vazia");
		}
	}
}