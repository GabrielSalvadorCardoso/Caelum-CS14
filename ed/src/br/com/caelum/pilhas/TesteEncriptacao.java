package br.com.caelum.pilhas;

public class TesteEncriptacao {

	public static void main(String[] args) {
		Encriptador encriptador = new Encriptador();
		encriptador.encriptar("Olá mundo");
		
		encriptador.mostrarEncriptacao();
		
		encriptador.encriptar("Why do we fall?");
		
		encriptador.mostrarEncriptacao();
		
		System.out.println("Desencriptando...");
		System.out.println(encriptador.desencriptar());
	}
}
