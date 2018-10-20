package projeto;

public class Pizza {

	private int quantia;
	private Ingredientes inicio;

	public Pizza() {	

	}
	
	// Metodo para adicionar novo objeto
	public void add(String sabor) {
		
		Ingredientes objeto = new Ingredientes(sabor);
		
		// Caso inicio ja usado e proximo nulo
		if(listaVazia()) {
			inicio = objeto;
		}else {
			objeto.setProximo(inicio);
			inicio = objeto;
		}
		
	}
	
	// Metodo para remove
	public void rem(String sabor) {
		
		Ingredientes atual = inicio;
		Ingredientes list = new Ingredientes();
		Ingredientes novo = new Ingredientes();
		
		// Procura por sabor na lista
		while(atual != null) {
			
			// Caso sabor for igual o passado pelo parametro
			if(!atual.getSabor().equalsIgnoreCase(sabor)) {
				novo = new Ingredientes(atual.getSabor());
				novo.setProximo(list); // Aqui coloco o objeto que possui  alista anterior
				list = novo;
			}
			
			// Pega o proximo Objeto
			atual = atual.getProximo();
		}
		
		inicio = list;
	
	}
	
	
	// Mostrar lista
	public void listar() {
		Ingredientes atual = inicio;
		String retorno = "";
		
		while(atual != null) {
			retorno += (atual.getSabor() == null) ? "" : atual.getSabor()+" ";
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
