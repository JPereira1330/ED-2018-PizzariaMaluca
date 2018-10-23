package projeto;

public class SorteAzar {

	private Carta topo;		// Carta do topo
	private int quantia;	// No maximo 20 cartas
	
	// Remove
	public Carta rem() {
		Carta retirado = topo;
		if(topo.getAnterior() != null)
			topo = topo.getAnterior();
		return retirado;
	}
	
	// Empilhar
	public void add(Carta carta) {
		
		// Verifica se topo esta vazio
		if(topo == null)
			topo = carta;
		else {
			Carta atual = carta;
			atual.setAnterior(topo);
			topo = atual;
		}	
		
	}
	
	// Printar na tela
	public void print() {
		int cont = 0;
		Carta atual = topo;
		while(atual != null) {
			System.out.println(atual.getAcao());
			atual = atual.getAnterior();
			cont++;
		}
	}
	
	// Verifica se topo esta vazio
	public boolean vazio() {
		return getTopo() == null;
	}
	
	/*
	 * GETTER'S
	 */
	public final void setTopo(Carta topo) {
		this.topo = topo;
	}
	public final void setQuantia(int quantia) {
		this.quantia = quantia;
	}
	
	/*
	 * SETTER'S
	 */
	public final Carta getTopo() {
		return topo;
	}
	public final int getQuantia() {
		return quantia;
	}
}
