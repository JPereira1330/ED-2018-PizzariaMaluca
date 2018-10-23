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
		String sorte_01 = "Voce acertou o ponto da pizza. [ ganhou 1 ingrediente ]";
		String sorte_02 = "O supermercado esta em promocao. [ ganhou 1 Ingredientes ]";
		String azar_01 	= "Voce queimou a pizza. [ perdeu 1 ingrediente ]";
		String azar_02 	= "Voce exagerou nos ingredientes. [ perdeu 1 Ingredientes ]";
		String ambos    = "Voce ganhou uma carona. [ Jogue o novamente dado ]";
		
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
		
		final String CEBOLA 		= "Cebola";
		final String CALABRESA		= "Calabresa";
		final String QUEIJO			= "Queijo";
		final String TOMATE			= "Tomate";
		final String OVO			= "Ovo";
		final String AZEITONA		= "Azeitona";
		final String MILHO			= "Milho";
		final String PRESUNTO		= "Presunto";
		final String BROCOLIS		= "Brocolis";
		final String ERVILHA		= "Ervilha";
		
		final String pTOSCANA		= "Toscana";
		final String pMARGUERITA 	= "Marguerita";
		final String pVEGETARIANA	= "Vegetariana";
		final String pCALABRESA		= "Calabresa";
		final String pROMANA		= "Romana";
		final String pPortuguesa	= "Portuguesa";
		
		switch(sabor) {
		
			// 1. Calabresa		[ Azeitona, Calabresa, Ervilha,   Brocolis,  Ovo 		] 
			case pCALABRESA:
				pizza.setSabor(pCALABRESA);
				pizza.add(AZEITONA);
				pizza.add(CALABRESA);
				pizza.add(ERVILHA);
				pizza.add(BROCOLIS);
				pizza.add(OVO);
				break;
				
			// 2. Marguerita	[ Queijo,   Milho,     Tomate,    Calabresa, Brocolis 	]
			case pMARGUERITA:
				pizza.setSabor(pMARGUERITA);
				pizza.add(QUEIJO);
				pizza.add(MILHO);
				pizza.add(TOMATE);
				pizza.add(CALABRESA);
				pizza.add(BROCOLIS);
				break;
				
			// 3. Romana		[ Queijo,   Milho,     Cebola,    Presunto,  Ervilha 	] 
			case pROMANA:
				pizza.setSabor(pROMANA);
				pizza.add(QUEIJO);
				pizza.add(MILHO);
				pizza.add(CEBOLA);
				pizza.add(PRESUNTO);
				pizza.add(ERVILHA);
				break;
				
			// 4. Toscana		[ Presunto, Tomate,    Calabresa, Cebola,    Azeitona	]
			case pTOSCANA:
				pizza.setSabor(pTOSCANA);
				pizza.add(PRESUNTO);
				pizza.add(TOMATE);
				pizza.add(CALABRESA);
				pizza.add(CEBOLA);
				pizza.add(AZEITONA);
				break;
			
			// 5. Portuguesa	[ Queijo,   Milho,     Ovo,       Azeitona,  Presunto	]
			case pPortuguesa:
				pizza.setSabor(pPortuguesa);
				pizza.add(QUEIJO);
				pizza.add(MILHO);
				pizza.add(OVO);
				pizza.add(AZEITONA);
				pizza.add(PRESUNTO);
				break;
				
			// 6. Vegetariana	[ Ovo, 	    Tomate,    Cebola,    Brocolis,  Ervilha	]
			case pVEGETARIANA:
				pizza.setSabor(pVEGETARIANA);
				pizza.add(OVO);
				pizza.add(TOMATE);
				pizza.add(CEBOLA);
				pizza.add(BROCOLIS);
				pizza.add(ERVILHA);
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
		final String ERVILHA		= "Ervilha";
		
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
		tabuleiro.insereUltimo(ERVILHA);
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
		tabuleiro.insereUltimo(ERVILHA);
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
