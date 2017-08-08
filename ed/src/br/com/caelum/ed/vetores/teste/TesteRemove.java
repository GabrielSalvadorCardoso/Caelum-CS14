package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemove {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a1.setNome("Lucas");
		a2.setNome("Matheus");
		a3.setNome("Gabriel");
		a4.setNome("Viviane");
		a5.setNome("Eduardo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		
		System.out.println(lista); // [Lucas, Matheus, Gabriel, Viviane, Eduardo]
		
		lista.remove(2);		
		
		System.out.println(lista); // [Lucas, Matheus, Viviane, Eduardo]
	}
}