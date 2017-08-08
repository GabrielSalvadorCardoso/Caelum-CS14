package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteDesempenhoFila {
	public static void main(String args[]) {
		FilaParametrizada<Aluno> fila = new FilaParametrizada<Aluno>();
		
		// INSERÇÃO
		long inicio = System.currentTimeMillis();		
		for(int i = 0; i < 100000; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome("Aluno " + i);
			fila.insere(aluno);
		}		
		long fim = System.currentTimeMillis();
		System.out.println("Quantidade de registros: " + fila.tamanho());
		System.out.println("Tempo de inserção: " + (fim - inicio) + " milessegundos");
		
		// REMOÇÃO
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			fila.remove();
		}
		fim = System.currentTimeMillis();
		System.out.println("Quantidade de registros: " + fila.tamanho());
		System.out.println("Tempo de inserção: " + (fim - inicio) + " milessegundos");
	}
}
