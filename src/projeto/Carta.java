package projeto;

public class Carta {

	private String acao;
	private Carta anterior=null;
	
	// Construtor vazio
	public Carta() {}
	
	/**
	 * CONSTRUTOR
	 * @param Acao [String] Texto da acao que esta carta trara ao jogo
	 * @param Anterior [Carta] Carta anterior a fila
	 */
	public Carta(String acao, Carta anterior) {
		
		setAcao(acao);
		setAnterior(anterior);
		
	}
	
	/*
	 * GETTER'S
	 */
	public final String getAcao() {
		return acao;
	}
	public final Carta getAnterior() {
		return anterior;
	}
	
	/*
	 * SETTER'S
	 */
	public final void setAnterior(Carta anterior) {
		this.anterior = anterior;
	}
	public final void setAcao(String acao) {
		this.acao = acao;
	}	
}
