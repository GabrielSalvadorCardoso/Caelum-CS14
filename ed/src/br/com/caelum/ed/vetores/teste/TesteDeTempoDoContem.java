package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteDeTempoDoContem {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		long inicio = System.currentTimeMillis();
		
		// Adiciona e verifica se o aluno foi adicionado
		for(int i = 0; i < 30000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
			
			if(!vetor.contem(aluno))
				System.out.println("Erro: aluno " + aluno + " não encontrado");
		}
		
		// Verifica se um aluno que não deveria estar no vetor esta presente
		for(int i = 0; i < 30000; i++) {
			Aluno aluno = new Aluno();
			if(vetor.contem(aluno)) {
				System.out.println("Erro: aluno " + aluno + " foi adicionado");
			}
		}
		
		long fim = System.currentTimeMillis();
		long tempo = (fim - inicio);
		System.out.println("Tempo de execução: " + tempo + " milissegundos");
	}
}
