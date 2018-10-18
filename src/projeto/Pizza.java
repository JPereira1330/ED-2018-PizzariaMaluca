package projeto;

public class Pizza {

	private int quantia;
	private Ingredientes inicio;

	public Pizza() {	

	}
	
	// Metodo para adicionar novo objeto
	public void add(String sabor) {
		
		Ingredientes objeto = new Ingredientes(sabor);
		
		// Caso inicio j� usado e proximo nulo
		if(listaVazia()) {
			inicio = objeto;
		}else {
			objeto.setProximo(inicio);
			inicio = objeto;
		}
		
	}
	
	/*
	 * ARRUMAR METODO DE REMOVER
	 */
	// Metodo para remove
	public void rem(String sabor) {
		
		Ingredientes atual = inicio;
		Ingredientes ant = atual;
		
		while(atual != null) {
			if (atual.getSabor().equalsIgnoreCase(sabor)) {
				ant.setProximo(atual.getProximo());
			}
			ant = atual;
			atual = atual.getProximo();
		}
	}
	
	// Mostrar lista
	public void listar() {
		Ingredientes atual = inicio;
		String retorno = "";
		
		for (int cont = 0; cont <= 4; cont++) {
			retorno += atual.getSabor()+" ";
			atual = atual.getProximo();
		}
		
		System.out.println(retorno);
	}
	
	// Metodo para limpar a lista
	public void limparLista(){
		inicio = null;
	}
	
	// Metodo para retornar se lista esta vazia
	public boolean listaVazia() {
		return inicio == null;
	}
	
	// Metodo que retortna tamanho da lista
	public int tamanho(){
		int tamanho = 0;
		Ingredientes atual = inicio;
		while(atual != null){
			tamanho++;
			atual = atual.getProximo();
		}
		return tamanho;
	}

	/*
	 * GETTER'S
	 */
	public final int getQuantia() {
		return quantia;
	}
	public final Ingredientes getInicio() {
		return inicio;
	}

	/*
	 * SETTER'S
	 */
	public final void setQuantia(int quantia) {
		this.quantia = quantia;
	}
	public final void setInicio(Ingredientes inicio) {
		this.inicio = inicio;
	}
	
}
