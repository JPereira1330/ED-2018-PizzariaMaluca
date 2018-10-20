package projeto;

public class main {

	public static void main(String[] args) {
		
		//SorteAzar listaSorteAzar = Inicializador.gerarSorteAzar();
		
		Pizza pizza = Inicializador.montarPizza("Calabresa");
		System.out.println("1 - Listando a pizza montada");
		pizza.listar();
		System.out.println("\n");
		
		System.out.println("2 - Removendo OVO..");
		pizza.rem("Ovo");
		System.out.println("\n");
		
		System.out.println("3 - Listando alteracoes..");
		pizza.listar();
		System.out.println("\n");
		
		System.out.println("4 - Removendo CALABRESA");
		pizza.rem("Calabresa");
		System.out.println("\n");
		
		System.out.println("5 - Listando altercoes");
		pizza.listar();
		
	}

}
