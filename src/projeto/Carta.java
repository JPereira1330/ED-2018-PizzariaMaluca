package projeto;

public class Carta {

	String acao;
	Carta proxima;
	
	public final String getAcao() {
		return acao;
	}
	public final void setAcao(String acao) {
		this.acao = acao;
	}
	public final Carta getProxima() {
		return proxima;
	}
	public final void setProxima(Carta proxima) {
		this.proxima = proxima;
	}
	
}
