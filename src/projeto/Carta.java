package projeto;

public class Carta {

	private String acao;
	private Carta anterior;
	
	// Construtor vazio
	public Carta() {}
	
	/**
	 * CONSTRUTOR
	 * @param acao
	 * @param anterior
	 */
	public Carta(String acao, Carta anterior) {
		
		setAcao(acao);
		setAnterior(anterior);
		
	}
	
	public final String getAcao() {
		return acao;
	}
	public final void setAcao(String acao) {
		this.acao = acao;
	}
	public final Carta getAnterior() {
		return anterior;
	}
	public final void setAnterior(Carta anterior) {
		this.anterior = anterior;
	}
	
}
