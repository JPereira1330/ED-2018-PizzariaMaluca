package projeto;

public class main {

	public static void main(String[] args) {
		
		//SorteAzar listaSorteAzar = Inicializador.gerarSorteAzar();
		
		Pizza pizza = Inicializador.montarPizza("Calabresa");
		System.out.println("1 - Listando a pizza montada");
		pizza.listar();
		System.out.println("2 - Removendo calabresa..");
		pizza.rem("Calabresa");
		System.out.println("3 - Listando alterações..");
		pizza.listar();
		
	}

}
