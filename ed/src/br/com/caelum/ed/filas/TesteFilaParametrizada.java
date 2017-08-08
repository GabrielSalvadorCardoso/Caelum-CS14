package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteFilaParametrizada {

	public static void main(String[] args) {
		FilaParametrizada<Aluno> alunos = new FilaParametrizada<Aluno>();
		
		Aluno aluno = new Aluno();
		
		alunos.insere(aluno);
		
		Aluno alunoRemovido = alunos.remove();
		
		if(aluno != alunoRemovido) {
			System.out.println("ERRO: Aluno inserido diferente do removido");
		}
		
		if(!alunos.vazia()) {
			System.out.println("ERRO: A fila não esta vazia");
		}
		
		
		FilaParametrizada<String> filaDeStrings = new FilaParametrizada<String>();
		
		filaDeStrings.insere("Gabriel");
		filaDeStrings.insere("Jonas");
		
		System.out.println(filaDeStrings.remove());
		System.out.println(filaDeStrings.remove());
	}

}
