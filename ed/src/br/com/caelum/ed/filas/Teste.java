package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class Teste {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Aluno aluno = new Aluno();
		
		fila.insere(aluno);
		
		Aluno alunoRemovido = fila.remove();
		
		if(aluno != alunoRemovido) {
			System.out.println("ERRO: Aluno inserido é diferente do removido");
		}
		
		if(!fila.vazia()) {
			System.out.println("ERRO: Fila não esta vazia");
		}

	}

}
