package projeto;

public class Pizza {

	private int quantia;
	private String sabor;
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
	
	// Metodo para remove um sabor especifico
	public void rem(String sabor) {
		
		Ingredientes atual = inicio;
		Ingredientes list = new Ingredientes();
		Ingredientes novo = new Ingredientes();
		
		atual = inicio;
		
		// Procura por sabor na lista
		for(int i=0; i< comprimento(); i++){
			
			try {
				if(atual.getSabor().equalsIgnoreCase(sabor) && atual.getSabor() != null) {
					atual = atual.getProximo();
				}
				
				if(atual.getSabor() != null) {
					novo = new Ingredientes(atual.getSabor());
					novo.setProximo(list);
					list = novo;
				}
				
				atual = atual.getProximo();
				
			}catch(Exception e) {

			}
		}
		
		inicio = list;
	}
		
	// Metodo para remover um valor
	public void rem() {
		this.inicio = inicio.getProximo();
	}
	
	// Metodo para retornar um ingrediente
	public boolean add() {
		
		final String CEBOLA 		= "Cebola";
		final String CALABRESA		= "Calabresa";
		final String QUEIJO			= "Queijo";
		final String TOMATE			= "Tomate";
		final String OVO			= "Ovo";
		final String AZEITONA		= "Azeitona";
		final String MILHO			= "Milho";
		final String PRESUNTO		= "Presunto";
		final String BROCOLIS		= "Brocolis";
		final String ERVILHA		= "Ervilha";
		
		final String pTOSCANA		= "Toscana";
		final String pMARGUERITA 	= "Marguerita";
		final String pVEGETARIANA	= "Vegetariana";
		final String pCALABRESA		= "Calabresa";
		final String pROMANA		= "Romana";
		final String pPortuguesa	= "Portuguesa";
		
		// Verifica se tem cebola
		if(getSabor().equalsIgnoreCase(pROMANA) || getSabor().equalsIgnoreCase(pVEGETARIANA) || getSabor().equalsIgnoreCase(pTOSCANA))
			if(!retornaLista().toLowerCase().contains(CEBOLA.toLowerCase())) {
				add(CEBOLA);
				return true;
			}
		
		// Verifica se tem calabresa
		if(getSabor().equalsIgnoreCase(pCALABRESA) || getSabor().equalsIgnoreCase(pMARGUERITA) || getSabor().equalsIgnoreCase(pTOSCANA))
			if(!retornaLista().toLowerCase().contains(CALABRESA.toLowerCase())) {
				add(CALABRESA);
				return true;
			}
		
		// Verifica se tem queijo
		if(getSabor().equalsIgnoreCase(pROMANA) || getSabor().equalsIgnoreCase(pMARGUERITA) || getSabor().equalsIgnoreCase(pPortuguesa))
			if(!retornaLista().toLowerCase().contains(QUEIJO.toLowerCase())) {
				add(QUEIJO);
				return true;
			}
		
		// Verifica se tem tomate
		if(getSabor().equalsIgnoreCase(pTOSCANA) || getSabor().equalsIgnoreCase(pMARGUERITA) || getSabor().equalsIgnoreCase(pVEGETARIANA))
			if(!retornaLista().toLowerCase().contains(TOMATE.toLowerCase())) {
				add(TOMATE);
				return true;
			}
		
		// Verifica se tem ovo
		if(getSabor().equalsIgnoreCase(pVEGETARIANA) || getSabor().equalsIgnoreCase(pPortuguesa) || getSabor().equalsIgnoreCase(pCALABRESA))
			if(!retornaLista().toLowerCase().contains(OVO.toLowerCase())) {
				add(OVO);
				return true;
			}

		// Verifica se tem presunto
		if(getSabor().equalsIgnoreCase(pTOSCANA) || getSabor().equalsIgnoreCase(pPortuguesa) || getSabor().equalsIgnoreCase(pROMANA))
			if(!retornaLista().toLowerCase().contains(PRESUNTO.toLowerCase())) {
				add(PRESUNTO);
				return true;
			}
		
		// Verifica se tem milho
		if(getSabor().equalsIgnoreCase(pMARGUERITA) || getSabor().equalsIgnoreCase(pPortuguesa) || getSabor().equalsIgnoreCase(pROMANA))
			if(!retornaLista().toLowerCase().contains(MILHO.toLowerCase())) {
				add(MILHO);
				return true;
			}
		
		// Verifica se tem azeitona
		if(getSabor().equalsIgnoreCase(pTOSCANA) || getSabor().equalsIgnoreCase(pPortuguesa) || getSabor().equalsIgnoreCase(pCALABRESA))
			if(!retornaLista().toLowerCase().contains(AZEITONA.toLowerCase())) {
				add(AZEITONA);
				return true;
			}
		
		// Verifica se tem brocolis
		if(getSabor().equalsIgnoreCase(pVEGETARIANA) || getSabor().equalsIgnoreCase(pMARGUERITA) || getSabor().equalsIgnoreCase(pCALABRESA))
			if(!retornaLista().toLowerCase().contains(BROCOLIS.toLowerCase())) {
				add(BROCOLIS);
				return true;
			}
		
		// Verifica se tem ervilha
		if(getSabor().equalsIgnoreCase(pVEGETARIANA) || getSabor().equalsIgnoreCase(pROMANA) || getSabor().equalsIgnoreCase(pCALABRESA))
			if(!retornaLista().toLowerCase().contains(ERVILHA.toLowerCase())) {
				add(ERVILHA);
				return true;
			}
		
		return false;
	}
	
	public int comprimento() {
		int comp =0;
		Ingredientes atual = inicio;
		while(atual != null) {
			comp++;
			atual = atual.getProximo();
		}
		return comp;
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
	
	// Retorna lista
	public String retornaLista() {
		Ingredientes atual = inicio;
		String retorno = "";
		
		while(atual != null) {
			retorno += (atual.getSabor() == null) ? "" : atual.getSabor()+" ";
			atual = atual.getProximo();
		}
		
		return retorno;
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
	public final String getSabor() {
		return sabor;
	}
	public final int getQuantia() {
		return quantia;
	}
	public final Ingredientes getInicio() {
		return inicio;
	}

	/*
	 * SETTER'S
	 */
	public final void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public final void setQuantia(int quantia) {
		this.quantia = quantia;
	}
	public final void setInicio(Ingredientes inicio) {
		this.inicio = inicio;
	}
	
}
