package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLinearVSConstante {

	public static void main(String[] args) {
		Vetor lista = new Vetor();
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			Aluno aluno = new Aluno();
			lista.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = (fim - inicio);
		System.out.println("Tempo decorrido: " + tempo + " milesegundos");

	}

}
