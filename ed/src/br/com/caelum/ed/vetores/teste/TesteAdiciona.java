package br.com.caelum.ed.vetores.teste;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAdiciona {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		Aluno a7 = new Aluno();
		Aluno a8 = new Aluno();
		Aluno a9 = new Aluno();
		Aluno a10 = new Aluno();
		
		a1.setNome("Jorge");
		a2.setNome("Maria");
		a3.setNome("Gilberto");
		a4.setNome("Ana");
		a5.setNome("Bianca");
		a6.setNome("Fabio");
		a7.setNome("Fagner");
		a8.setNome("Irineu");
		a9.setNome("Barbara");
		a10.setNome("Tania");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		
		lista.adiciona(3, a6);
		
		System.out.println(lista);
		
		lista.adiciona(9000000, a10);
	}
}
