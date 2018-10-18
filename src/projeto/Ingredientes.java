package projeto;

public class Ingredientes {
	private String sabor;
	private Ingredientes proximo;
	
	public Ingredientes() {
		
	}
	
	/**
	 * CONSTRUTOR
	 * @param Sabor 	[String] Ingrediente
	 * @param Proximo 	[Ingredientes] Proximo ingrediente
	 */
	public Ingredientes(String sabor) {
		this.sabor = sabor;
		this.proximo = null;
	}

	/*
	 * GETTER'S
	 */
	public String getSabor() {
		return sabor;
	}
	public Ingredientes getProximo() {
		return proximo;
	}

	/*
	 * SETTER'S
	 */
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public void setProximo(Ingredientes proximo) {
		this.proximo = proximo;
	}
}
