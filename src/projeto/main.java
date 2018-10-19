package projeto;

public class main {

	public static void main(String[] args) {
		
		SorteAzar listaSorteAzar = Inicializador.gerarSorteAzar();
		listaSorteAzar.print(); // Lista para Testar
		
		Pizza pizza = Inicializador.montarPizza("Calabresa");
		pizza.listar();
		
	}

}
