package br.com.caelum.ed.vetores.teste;

import java.util.ArrayList;
import java.util.Vector;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteVetor {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		System.out.println("Tamanho do Vetor antes da inserção: " + vetor.tamanho());
		
		for(int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		System.out.println("Tamanho do Vetor depois da inserção: " + vetor.tamanho());
		
		System.out.println("-----------------------------------------------------------");
		
		Vector vector = new Vector();
		System.out.println("Tamanho do Vector antes da inserção: " + vector.size());
		for(int i = 0; i < 1000; i++) {
			vector.add(vetor.pega(i));
		}
		System.out.println("Tamanho do Vector depois da inserção: " + vector.size());
		
		System.out.println("-----------------------------------------------------------");
		
		ArrayList list = new ArrayList();
		System.out.println("Tamanho do ArrayList antes da inserção: " + list.size());
		for(int i = 0; i < 1000; i++)
			list.add(vetor.pega(i));
		System.out.println("Tamanho do ArrayList depois da inserção: " + list.size());
	}
}
