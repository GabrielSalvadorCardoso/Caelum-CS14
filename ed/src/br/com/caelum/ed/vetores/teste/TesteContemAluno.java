package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteContemAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1)); // true
		System.out.println(lista.contem(a2)); // true
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(lista.contem(aluno)); // false
	}
}
