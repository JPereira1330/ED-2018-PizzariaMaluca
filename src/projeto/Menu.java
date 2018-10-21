package projeto;

import java.util.Scanner;

public class Menu {

	public static void exec() {
		
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		
		// Printando menu
		System.out.println("\t\t\t [ P I Z Z A R I A   M A L U C A ]");
		System.out.println(" [ 1 ] Iniciar jogo");
		System.out.println(" [ 9 ] Sair");
		System.out.print  (" -> ");
		
		// Verifica se o caracter inserido existe
		try {
			opcao = scan.nextInt();
		}catch(Exception e) {
			System.err.println("\n\n Inseriu uma opção invalida: \n -> "+e.getMessage());
			exec();
		}
		
		switch(opcao) {
		case 1:
			iniciarJogo();
			break;
		case 9:
			break;
			default:
				System.err.println("\n\n Inseriu uma opção invalida");
				exec();
		}
		
	}

	private static void iniciarJogo() {
	
		int quantia = 0;
		boolean concluido = false;
		Scanner scan = new Scanner(System.in);
		
		// Limpando a tela
		clear(4);
		
		// Menu de seleção
		while(!concluido) {
			System.out.println(" [ * ] Insira a quantia de jogadores [ 2 ~ 5 ] ~> ");

			try { quantia = scan.nextInt(); } 
			catch (Exception e) { System.out.println(); }
			
			if(quantia <= 5 && quantia >= 2)
				concluido = true;
		}
		
		
		
		// Resetando Scan
		scan = new Scanner(System.in);
		
		// Craindo objetos
		Jogador jogador01 = null;
		Jogador jogador02 = null;
		Jogador jogador03 = null;
		Jogador jogador04 = null;
		Jogador jogador05 = null;
		Pizza pizza;
		Tabuleiro tab;
		
		for(int i = 0; i < quantia; i++) {
		
			// Pritando as pizzas
			System.out.println(" NOME DA PIZZA \t\t | INGREDIENTES NECESSARIOS");
			System.out.println(" Calabresa \t\t [ Azeitona, Calabresa, Ervilha,   Brocolis,  Ovo	]");
			System.out.println(" Marguerita \t\t [ Queijo,   Milho,     Tomate,    Calabresa, Brocolis 	]");
			System.out.println(" Romana \t\t [ Queijo,   Milho,     Cebola,    Presunto,  Ervilha 	] ");
			System.out.println(" Toscana \t\t [ Presunto, Tomate,    Calabresa, Cebola,    Azeitona	]");
			System.out.println(" Portuguesa \t\t [ Queijo,   Milho,     Ovo,       Azeitona,  Presunto	]");
			System.out.println(" Vegetariana \t\t [ Ovo,	Tomate,    Cebola,    Brocolis,  Ervilha 	]");
			System.out.print  ("\n [ Jogador "+i+" ] -> ");
			
			String sabor = scan.nextLine();
			sabor = sabor.toLowerCase();
			
			if(sabor.equals("calabresa") || sabor.equals("marguerita") || sabor.equals("romana") || sabor.equals("toscana") || sabor.equals("portuguesa") || sabor.equals("Vegetariana")){

				switch(i) {
					case 0:
						pizza = Inicializador.montarPizza(sabor);
						tab = Inicializador.montarTabuleiro();
						jogador01 = new Jogador("Jogador 01", pizza, tab, tab.retornaCasa(0));
					break;
					case 1:
						pizza = Inicializador.montarPizza(sabor);
						tab = Inicializador.montarTabuleiro();
						jogador02 = new Jogador("Jogador 02", pizza, tab, tab.retornaCasa(0));
					break;
					case 2:
						pizza = Inicializador.montarPizza(sabor);
						tab = Inicializador.montarTabuleiro();
						jogador03 = new Jogador("Jogador 03", pizza, tab, tab.retornaCasa(0));
					break;
					case 3:
						pizza = Inicializador.montarPizza(sabor);
						tab = Inicializador.montarTabuleiro();
						jogador04 = new Jogador("Jogador 04", pizza, tab, tab.retornaCasa(0));
					break;
					case 4:
						pizza = Inicializador.montarPizza(sabor);
						tab = Inicializador.montarTabuleiro();
						jogador05 = new Jogador("Jogador 05", pizza, tab, tab.retornaCasa(0));
					break;
				}
				
			}else {
				System.out.println(" [ERRO] Sabor invalido");
				i--;
			}
				
		}
		
		Game.start(jogador01,jogador02,jogador03,jogador04,jogador05);
	}
	
	// Metodo para limpar a tela
	private static void clear(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
	}
	
}
