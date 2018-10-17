package Model;

public class Lista_Ingredientes {

	private Ingrediente inicio, fim;

	// Metodo para adicionar novo objeto
	public void add(String sabor) {
		
		Ingrediente objeto = new Ingrediente(sabor);
		
		// Caso inicio já usado e proximo nulo
		if(listaVazia()) {
			inicio = objeto;
			fim = objeto;
		}else {
			objeto.setProximo(inicio);
			inicio = objeto;
		}
		
	}
	
	// Mostrar lista
	public void listar() {
		Ingrediente atual = inicio;
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
	
	// Metodo que retortna tamanho da string
	public int tamanho(){
		int tamanho = 0;
		Ingrediente atual = inicio;
		while(atual != null){
			tamanho++;
			atual = atual.getProximo();
		}
		return tamanho;
	}
	
	// Get's e Set's
	public Object getInicio() {
		return inicio;
	}

	public void setInicio(Ingrediente inicio) {
		this.inicio = inicio;
	}

	public Object getFim() {
		return fim;
	}

	public void setFim(Ingrediente fim) {
		this.fim = fim;
	}
}