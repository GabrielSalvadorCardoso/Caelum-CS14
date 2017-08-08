package br.com.caelum.ed.vetores;
import br.com.caelum.ed.Aluno;
/* Esta classe funciona mais ou menos como a classe ArrayList */
public class Vetor {
	private Object[] objetos = new Object[100000];
	
	private int totalDeObjetos = 0;
	
	public void adiciona(Object objeto) {
		this.garantaEspaco();
		// Maneira ineficiente
		/*for(int i = 0; i < this.alunos.length; i++) {
			if(this.alunos[i] == null) {
				this.alunos[i] = aluno;
				break;
			}
		}*/
		
		// Maneira eficiente
		this.objetos[this.tamanho()] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, Object objeto) {
		this.garantaEspaco();
		if(!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = this.tamanho(); i > posicao; i--) {
			this.objetos[i] = this.objetos[i - 1];
		}
		
		this.objetos[posicao] = objeto;
		this.totalDeObjetos++;
	}
	
	public Object pega(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}		
		return this.objetos[posicao];	
	}
	
	public void remove(int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = posicao ; i < this.totalDeObjetos; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		this.totalDeObjetos--;
	}
	
	public boolean contem(Object objeto) {
		// 'this.alunos.length' itera todo o array
		// 'this.tamanho()' itera somente atá o ultimo elemento preechido do array
		for(int i = 0; i < this.tamanho(); i++) {
			if(this.objetos[i] == objeto) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		// Retorna o número de objetos na lista
		// Este número também representa o indice do próximo espaço livre
		return this.totalDeObjetos;
	}
	
	// Só devemos permitir o usuario informar um indice dentro dos elemento não nulos
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.tamanho();
	}
	
	// Qualquer posição ocupada ou a primeira posição nula é válida para inserção
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.tamanho();
	}
	
	private void garantaEspaco() {
		// Se o número de alunos atingir o tamanho total do array, dobramos a sua capacidade
		if(this.tamanho() == this.objetos.length) {
			// O novo array tem o dobro do tamanho do antigo
			Object[] novoArray = new Object[this.objetos.length * 2];
			// Passando os dados do antigo array para o novo
			for(int i = 0; i < this.objetos.length; i++) {
				novoArray[i] = this.objetos[i];
			}
			
			this.objetos = novoArray;
		}
	}
	
	@Override
	public String toString() {
		if(this.totalDeObjetos == 0)
			return "[]";
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for(int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
}
