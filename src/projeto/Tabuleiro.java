package projeto;

/**
 * 
 * Lista circular duplamente encadeada
 *
 */

public class Tabuleiro {
	
	private Casa atual, ultimo, primeiro;
	
	public Tabuleiro() {
		Casa atual = null;
		Casa ultimo = null;
		Casa primeiro = null;
	}
	
	// Retonar o elemento de tal posição
	public Casa retornaCasa(int posicao) {
		Casa casa = primeiro;
		
		for(int i = 0; i < posicao; i++) {
			casa = casa.getProximo();
		}
		
		return casa;
	}
	
	// Retorna se a lista esta vazia
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	// Retorna comprimento da lista
	public int comprimento() {
		int comp =0;
		atual = primeiro;
		do {
			comp++;
			atual = atual.getProximo();
		}while(atual != ultimo.getProximo());
		
		return comp;
	}
	
	// Metodo que lista
	public String lista() {
		String retorno = "";
		
		atual = primeiro;
		do {
			retorno += atual.getCasa()+" ";
			atual = atual.getProximo();
		}while(atual != ultimo.getProximo());
		
		return retorno;
	}
	
	// Checar se precisa de parametro pra criar Tabela, caso precise alterar metodo inserePrimeiro() abaixo
	public void inserePrimeiro(String acao) {
		Casa novo = new Casa(acao);
		
		if(estaVazia()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		}else {
			novo.setProximo(primeiro);
			novo.setAnterior(ultimo);
			primeiro.setAnterior(novo);
			primeiro = novo;
			ultimo.setProximo(primeiro);
		}
	}
	
	//mesma coisa do metodo inserePrimeiro(), checar se precisa de parametro pra criar tabela
	public void insereUltimo(String acao) {
		Casa novo = new Casa(acao);
		
		if(estaVazia()) {
			novo.setProximo(novo);
			novo.setAnterior(novo);
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		}else {
			ultimo.setProximo(novo);
			novo.setAnterior(ultimo);
			novo.setProximo(primeiro);
			primeiro.setAnterior(novo);
			ultimo = novo;
		}
	}
	
	
	//MOVE PARA A POSI��O INDICADA
	public void moveParaPosicao(int pos) {
		atual = primeiro;
		for (int i = 0; i < pos; i++) {
			atual = atual.getProximo();
		}
	}
	
	/* INSERE UM NOVO OBJETO NA POSICAO INDICADA,
	 * mesma coisa dos metodos inserePrimeiro() e insereUltimo(), verificar se � necessario
	 * passar algum parametro para criar Tabela...
	 * */
	public void insereNaPosicao(int pos, String acao) {
		Casa novo = new Casa(acao);
		moveParaPosicao(pos);
		novo.setProximo(atual.getProximo());
		novo.setAnterior(atual);
		atual.setProximo(novo);
	}
	
	//Retorna o elemento na posi��o indicada
	public Casa elementoNaPosicao(int pos) {
		moveParaPosicao(pos);
		return atual;
	}
	
	//Retorna a posicao de um elemento na lista, se n�o existir retorna um numero negativo(palavras do luciano)
	public int buscaElemento(String acao) {		
		int cont =0;
		atual = primeiro;
		
		while(atual != null && atual.getCasa().equalsIgnoreCase(acao)) {
			atual = atual.getProximo();
			cont++;
		}
		if(atual != null) {
			return cont;
		}
		return -1;
	}
	
	//Remove primeira posicao
	public void removePrimeiro() {
		if(estaVazia() == false) {
			primeiro = primeiro.getProximo();
			primeiro.setAnterior(ultimo);
			ultimo.setProximo(primeiro);
		}else {
			System.out.println("Ta vazio, nao ha nada pra remover");
		}
	}
	
	//Remove ultima posicao
	public void removeUltimo() {
		if(estaVazia() == false) {
			int pos;
			pos=comprimento()-1;
			moveParaPosicao(pos);
			atual.setProximo(primeiro);
			primeiro.setAnterior(atual);
			ultimo = atual;
		}else {
			System.out.println("Ta vazio, nao ha nada pra remover");
		}
	}
	
}

