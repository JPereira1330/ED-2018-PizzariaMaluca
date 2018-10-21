package projeto;

/**
 * 
 * Classe responsavel por adicionar valores padrões do jogo
 *
 */

public class Inicializador {

	// Metodo para adicionar as cartas de sorte e azar
	public static SorteAzar gerarSorteAzar() {
		
		// Mensagem das cartas
		String sorte_01 = "Você acertou o ponto da pizza. \n [ escolha 1 ingrediente ]";
		String sorte_02 = "O supermercado esta em promoção. \n [ escolha 1 Ingredientes ]";
		String azar_01 	= "Você queimou a pizza. \n [ perdeu 1 ingrediente ]";
		String azar_02 	= "Você exagerou nos ingredientes. \n [ perdeu 1 Ingredientes ]";
		String ambos    = "Você ganhou uma carona. \n [ Jogue o novamente dado ]";
		
		// Criando objeto da lista
		SorteAzar lista_sa = new SorteAzar();
		
		// variaveis de controle
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		
		// Adicionando as cartas
		for (int cont = 0; cont < 20; cont++)
			
			// Embaralhando lista
			switch((int) ( 1 + (Math.random() * 5))) {
			
				// Adiciona texto da variavel "sorte_01"
				case 1:
					if(a < 5) {
						lista_sa.add(new Carta(sorte_01, null));
						a++;
					}else
						cont--;
					break;
					
				// Adiciona texto da variavel "sorte_02" 
				case 2:
					if(b < 5) {
						lista_sa.add(new Carta(sorte_02, null));
						b++;
					}else
						cont--;
					break;
					
				// Adiciona texto da variavel "azar_01"
				case 3:
					if(c < 5) {
						lista_sa.add(new Carta(azar_01, null));
						c++;
					}else
						cont--;
					break;

				// Adiciona texto da variavel "azar_02"
				case 4:
					if(d < 5) {
						lista_sa.add(new Carta(azar_02, null));
						d++;
					}else
						cont--;
					break;
					
				// Adiciona texto da variavel "ambos"
				case 5:
					if(e < 5) {
						lista_sa.add(new Carta(ambos, null));
						e++;
					}else
						cont--;
					break;
			}
				
		return lista_sa;
	}

	// Metodo para adicionar as pizzas
	public static Pizza montarPizza(String sabor) {
		
		Pizza pizza = new Pizza();
		
		switch(sabor) {
		
			// 1. Calabresa		[ Azeitona, Calabresa, Ervilha,   Brocolis,  Ovo 		] 
			case "calabresa":
				pizza.setSabor("Calabresa");
				pizza.add("Azeitona");
				pizza.add("Calabresa");
				pizza.add("Ervilha");
				pizza.add("Brocolis");
				pizza.add("Ovo");
				break;
				
			// 2. Marguerita	[ Queijo,   Milho,     Tomate,    Calabresa, Brocolis 	]
			case "marguerita":
				pizza.setSabor("Marguerita");
				pizza.add("Quejo");
				pizza.add("Milho");
				pizza.add("Tomate");
				pizza.add("Calabresa");
				pizza.add("Brocolis");
				break;
				
			// 3. Romana		[ Queijo,   Milho,     Cebola,    Presunto,  Ervilha 	] 
			case "romana":
				pizza.setSabor("Romana");
				pizza.add("Queijo");
				pizza.add("Milho");
				pizza.add("Cebola");
				pizza.add("Presunto");
				pizza.add("Ervilha");
				break;
				
			// 4. Toscana		[ Presunto, Tomate,    Calabresa, Cebola,    Azeitona	]
			case "toscana":
				pizza.setSabor("Toscana");
				pizza.add("Presunto");
				pizza.add("Tomate");
				pizza.add("Calabresa");
				pizza.add("Cebola");
				pizza.add("Azeitona");
				break;
			
			// 5. Portuguesa	[ Queijo,   Milho,     Ovo,       Azeitona,  Presunto	]
			case "portuguesa":
				pizza.setSabor("Portuguesa");
				pizza.add("Queijo");
				pizza.add("Milho");
				pizza.add("Ovo");
				pizza.add("Azeitona");
				pizza.add("Presunto");
				break;
				
			// 6. Vegetariana	[ Ovo, 	    Tomate,    Cebola,    Brocolis,  Ervilha	]
			case "vegetariana":
				pizza.setSabor("Vegetariana");
				pizza.add("Ovo");
				pizza.add("Tomate");
				pizza.add("Cebola");
				pizza.add("Brocolis");
				pizza.add("Ervilha");
				break;
		}
		
		return pizza;
	}

	// Metodo para adicionar as casas do tabuleiro
	public static Tabuleiro montarTabuleiro() {
		
		// VARIAVEI CONSTANTES
		final String PERDE_TUDO 	= "Perde Tudo";
		final String SORTE_AZAR		= "Sote e Azar";
		final String CEBOLA 		= "Cebola";
		final String CALABRESA		= "Calabresa";
		final String QUEIJO			= "Queijo";
		final String TOMATE			= "Tomate";
		final String OVO			= "Ovo";
		final String AZEITONA		= "Azeitona";
		final String MILHO			= "Milho";
		final String PRESUNTO		= "Presunto";
		final String BROCOLIS		= "Brocolis";
		
		// Criando objeto tabuleiro
		Tabuleiro tabuleiro = new Tabuleiro();
		
		// PRIMEIRO COLUNA
		tabuleiro.insereUltimo(PERDE_TUDO);
		tabuleiro.insereUltimo(CEBOLA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(CALABRESA);
		tabuleiro.insereUltimo(QUEIJO);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(SORTE_AZAR);
		
		// SEGUNDA COLUNA
		tabuleiro.insereUltimo(TOMATE);
		tabuleiro.insereUltimo(OVO);
		tabuleiro.insereUltimo(AZEITONA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(MILHO);
		tabuleiro.insereUltimo(AZEITONA);
		
		// TERCEIRA COLUNA
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(PRESUNTO);
		tabuleiro.insereUltimo(TOMATE);
		tabuleiro.insereUltimo(MILHO);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(BROCOLIS);
		
		// QUARTA COLUNA
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(OVO);
		tabuleiro.insereUltimo(CEBOLA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(CALABRESA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(PRESUNTO);
		
		// QUINTA COLUNA
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(QUEIJO);
		tabuleiro.insereUltimo(AZEITONA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		tabuleiro.insereUltimo(BROCOLIS);
		tabuleiro.insereUltimo(AZEITONA);
		tabuleiro.insereUltimo(SORTE_AZAR);
		
		return tabuleiro;
	}
	
}
