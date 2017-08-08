package br.com.caelum.pilhas;

import br.com.caelum.ed.Peca;

public class TestePilhaParametrizada {

	public static void main(String[] args) {
		// Se omitirmos o tipo de objetos a ser trabalhado, a pilha assumirá Object como o tipo padrão
		PilhaParametrizada<Peca> pilhaParametrizada = new PilhaParametrizada<Peca>();
		
		Peca pecaInsere = new Peca();
		
		pilhaParametrizada.insere(pecaInsere);
		
		Peca pecaRemove = pilhaParametrizada.remove();
		
		if(pecaInsere != pecaRemove) {
			System.out.println("ERRO: Peça inserida diferente da removida");
		}
		
		if(!pilhaParametrizada.vazia()) {
			System.out.println("ERRO: Pilha não esta vazia");
		}
		
		PilhaParametrizada<String> pilhaDeStrings = new PilhaParametrizada<String>();
		
		pilhaDeStrings.insere("Roberto");
		pilhaDeStrings.insere("Julio");
		
		System.out.println(pilhaDeStrings.remove());
		System.out.println(pilhaDeStrings.remove());

	}
}
