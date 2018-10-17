package projeto;

public class Tabela extends Object{
	
	// Declaração dos atributos
	private String casa;
	private Tabela anterior;
	private Tabela proximo;
	
	// Construtor do objeto vazio
	public Tabela() {}
	
	// Construtor do objeto com parametro
	public Tabela(String casa, Tabela anterior, Tabela proximo) {
		setCasa(casa);
		setAnterior(anterior);
		setProximo(proximo);
	}

	public String getCasa() {
		return casa;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public Tabela getAnterior() {
		return anterior;
	}

	public void setAnterior(Tabela anterior) {
		this.anterior = anterior;
	}

	public Tabela getProximo() {
		return proximo;
	}

	public void setProximo(Tabela proximo) {
		this.proximo = proximo;
	}
	
	
}
