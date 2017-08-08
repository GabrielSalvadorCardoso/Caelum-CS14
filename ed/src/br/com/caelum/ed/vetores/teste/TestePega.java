package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TestePega {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		
		System.out.println(lista.pega(0)); // Rafael
		System.out.println(lista.pega(1)); // null
		System.out.println(lista.pega(10000000)); // ArrayIndexOutOfBoundsException
	}
}