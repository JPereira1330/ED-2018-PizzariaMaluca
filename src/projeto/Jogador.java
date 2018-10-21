package projeto;

public class Jogador {

	private String nome;
	private Pizza pizza;
	private Tabuleiro tabuleiro;
	private Casa casaAtual;
	
	/**
	 * @param nome	<String>
	 * @param pizza	<Pizza>
	 * @param tab	<Tabuleiro>
	 * @param casa  <Casa>
	 */
	public Jogador(String nome, Pizza pizza, Tabuleiro tab, Casa casa) {
		setNome(nome);;
		setPizza(pizza);
		setTabuleiro(tab);
		setCasaAtual(casa);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	public Casa getCasaAtual() {
		return casaAtual;
	}
	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
	}
	
	
	
}
