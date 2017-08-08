package br.com.caelum.ed.listasligadas;

public class Celula {
	private Celula proxima;
	private Celula anterior;
	
	private Object elemento;
	
	public Celula(Celula proxima, Object elemento) {
		this.setProxima(proxima);
		this.elemento = elemento;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
}
