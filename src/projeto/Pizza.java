package projeto;

public class Pizza {

	private String sabor;
<<<<<<< HEAD
	
	
=======
	private Lista_Ingredientes listaIngredienteNecessario;
	
	public Pizza() {	

	}
	
	public void montarPizza(String sabor) {
		
		listaIngredienteNecessario = new Lista_Ingredientes();
		
		switch(sabor) {
		
			// 1. Calabresa		[ Azeitona, Calabresa, Ervilha,   Brocolis,  Ovo 		] 
			case "Calabresa":
				listaIngredienteNecessario.add("Azeitona");
				listaIngredienteNecessario.add("Calabresa");
				listaIngredienteNecessario.add("Ervilha");
				listaIngredienteNecessario.add("Brocolis");
				listaIngredienteNecessario.add("Ovo");
				break;
				
			// 2. Marguerita	[ Queijo,   Milho,     Tomate,    Calabresa, Brocolis 	]
			case "Marguerita":
				listaIngredienteNecessario.add("Quejo");
				listaIngredienteNecessario.add("Milho");
				listaIngredienteNecessario.add("Tomate");
				listaIngredienteNecessario.add("Calabresa");
				listaIngredienteNecessario.add("Brocolis");
				break;
				
			// 3. Romana		[ Queijo,   Milho,     Cebola,    Presunto,  Ervilha 	] 
			case "Romana":
				listaIngredienteNecessario.add("Queijo");
				listaIngredienteNecessario.add("Milho");
				listaIngredienteNecessario.add("Cebola");
				listaIngredienteNecessario.add("Presunto");
				listaIngredienteNecessario.add("Ervilha");
				break;
				
			// 4. Toscana		[ Presunto, Tomate,    Calabresa, Cebola,    Azeitona	]
			case "Toscana":
				listaIngredienteNecessario.add("Presunto");
				listaIngredienteNecessario.add("Tomate");
				listaIngredienteNecessario.add("Calabresa");
				listaIngredienteNecessario.add("Cebola");
				listaIngredienteNecessario.add("Azeitona");
				break;
			
			// 5. Portuguesa	[ Queijo,   Milho,     Ovo,       Azeitona,  Presunto	]
			case "Portuguesa":
				listaIngredienteNecessario.add("Queijo");
				listaIngredienteNecessario.add("Milho");
				listaIngredienteNecessario.add("Ovo");
				listaIngredienteNecessario.add("Azeitona");
				listaIngredienteNecessario.add("Presunto");
				break;
				
			// 6. Vegetariana	[ Ovo, 	    Tomate,    Cebola,    Brocolis,  Ervilha	]
			case "Vegetariana":
				listaIngredienteNecessario.add("Ovo");
				listaIngredienteNecessario.add("Tomate");
				listaIngredienteNecessario.add("Cebola");
				listaIngredienteNecessario.add("Brocolis");
				listaIngredienteNecessario.add("Ervilha");
				break;
				default:
					System.out.println("Deu ruim");
					break;
				
		}
	
		listaIngredienteNecessario.listar();
	}	
>>>>>>> 376c011fd43597a0d3e62e91cb73332842fc3c1f
}
