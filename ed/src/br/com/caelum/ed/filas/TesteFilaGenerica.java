package br.com.caelum.ed.filas;

import br.com.caelum.ed.Aluno;

public class TesteFilaGenerica {

	public static void main(String[] args) {
		FilaGenerica filaGenerica = new FilaGenerica();
		
		Aluno aluno = new Aluno();
		
		filaGenerica.insere(aluno);
		
		Object alunoRemovido = filaGenerica.remove();
		
		if(aluno != alunoRemovido) {
			System.out.println("ERRO: Aluno inserido é diferente do removido");
		}
		
		if(!filaGenerica.vazia()) {
			System.out.println("ERRO: Fila não esta vazia");
		}

	}
}
