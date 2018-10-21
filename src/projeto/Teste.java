package projeto;

public class Teste {

	/*
	 * CLASSE CRIADA PARA TESTAR O CODIGO
	 */
	
	public static void testar() {
		
		Pizza pizza = new Pizza();
		
		System.out.println("6 - Removendo ERVILHA");
		pizza.rem("Ervilha");
		System.out.println("\n");
		
		System.out.println("7 - Listando altercoes");
		pizza.listar();
		
	}
	
}
