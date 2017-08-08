package br.com.caelum.pilhas;

public class Encriptador {
	private PilhaParametrizada<Character> pilhaDeCaracteres = new PilhaParametrizada<Character>();
	
	public void encriptar(String frase) {
		this.pilhaDeCaracteres.esvaziar();
		
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) {
			// System.out.println(palavra + " Tamanho: " + palavra.length());
			for(int i = palavra.length() - 1; i >= 0 ; i--) {
				//System.out.println(frase.charAt(i));
				this.pilhaDeCaracteres.insere( palavra.charAt(i) );
			}
			this.pilhaDeCaracteres.insere(' ');
		}		
		this.pilhaDeCaracteres.remove(); // Remove o ultimo caracter de espaco
		
		//System.out.println("Encriptando...");
		/*for(int i = 0; i < frase.length(); i++) {
			System.out.print(this.pilhaDeCaracteres.pegar(i));
		}*/
	}
	
	public String desencriptar() {
		// Remonta a string a partir da pilha
		StringBuilder builder = new StringBuilder();
		while(!pilhaDeCaracteres.vazia()) {
			builder.append(this.pilhaDeCaracteres.remove());
		}
		
		// O builder está com a ordem das palavras invertida, então devemos colocar na ordem certa
		String[] palavras = builder.toString().split(" ");
		String emOrdem = "";
		
		for(int i = palavras.length - 1; i >= 0; i--) {
			emOrdem += palavras[i] + " ";
		}		
		
		return emOrdem.trim();
	}
	
	public void mostrarEncriptacao() {
		for(int i = 0; i < this.pilhaDeCaracteres.tamanho(); i++) {
			System.out.print(this.pilhaDeCaracteres.pegar(i));
		}
		System.out.println();
	}
}
