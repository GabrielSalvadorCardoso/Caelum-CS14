package br.com.caelum.ed.conjuntos;

import br.com.caelum.ed.Aluno;

public class TesteConjuntoGenerico {

	public static void main(String[] args) {
		ConjuntoEspalhamento<Aluno> conjunto = new ConjuntoEspalhamento<Aluno>();
		
		Aluno a1 = new Aluno();
		a1.setNome("Geovana");
		
		Aluno a2 = new Aluno();
		a2.setNome("Paulo");
		
		Aluno a3 = new Aluno();
		a3.setNome("Jorge");

		conjunto.adiciona(a1);
		conjunto.adiciona(a2);
		conjunto.adiciona(a3);
		
		System.out.println(conjunto.pegaTodas());
	}

}
