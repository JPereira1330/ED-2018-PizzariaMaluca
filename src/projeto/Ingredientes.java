package projeto;

public class Ingredientes {
	private String sabor;
	private Ingredientes proximo;
	
	public Ingredientes() {
		
	}
	
	public Ingredientes(String sabor) {
		this.sabor = sabor;
		this.proximo = null;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Ingredientes getProximo() {
		return proximo;
	}

	public void setProximo(Ingredientes proximo) {
		this.proximo = proximo;
	}
}
