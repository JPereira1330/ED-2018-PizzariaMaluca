package projeto;

public class Casa{
	
	// Declaração dos atributos
	private String casa;
	private Casa anterior;
	private Casa proximo;
	
	// Construtor do objeto vazio
	public Casa() {}
	
	// Construtor do objeto apenas com a acao da casa
	public Casa(String acao) {
		setCasa(acao);
	}
	
	// Construtor do objeto com parametro
	public Casa(String acao, Casa anterior, Casa proximo) {
		setCasa(acao);
		setAnterior(anterior);
		setProximo(proximo);
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public Casa getAnterior() {
		return anterior;
	}

	public void setAnterior(Casa anterior) {
		this.anterior = anterior;
	}

	public Casa getProximo() {
		return proximo;
	}

	public void setProximo(Casa proximo) {
		this.proximo = proximo;
	}
	
	
}