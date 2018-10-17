package projeto;

/**
 * 
 * @author José C. Pereira
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
	
}
