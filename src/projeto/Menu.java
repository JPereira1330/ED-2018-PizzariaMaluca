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
		case 2:
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
		
		for(int i = 0; i < quantia; i++) {
		
			// Pritando as pizzas
			System.out.println(" NOME DA PIZZA  | INGREDIENTES NECESSARIOS");
			System.out.println(" Calabresa		[ Azeitona, Calabresa, Ervilha,   Brocolis,  Ovo 		]");
			System.out.println(" Marguerita		[ Queijo,   Milho,     Tomate,    Calabresa, Brocolis 	]");
			System.out.println(" Romana			[ Queijo,   Milho,     Cebola,    Presunto,  Ervilha 	] ");
			System.out.println(" Toscana		[ Presunto, Tomate,    Calabresa, Cebola,    Azeitona	]");
			System.out.println(" Portuguesa 	[ Queijo,   Milho,     Ovo,       Azeitona,  Presunto	]");
			System.out.println(" Vegetariana	[ Ovo, 	    Tomate,    Cebola,    Brocolis,  Ervilha 	]");
			System.out.print  ("\n [ Jogador "+i+" ] -> ");
			
			String sabor = scan.nextLine();
			sabor = sabor.toLowerCase();
			
			if(sabor.equals("calabresa") || sabor.equals("Marguerita") || sabor.equals("Romana") || sabor.equals("Toscana") || sabor.equals("Portuguesa") || sabor.equals("Vegetariana")){
				//Jogador jogador = new Jogador();
				//jogador.
			}else {
				i--;
				System.out.println(" [ ERRO ] SABOR INEXISTENTE");
			}
		}
		
		
	}
	
	// Metodo para limpar a tela
	private static void clear(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
	}
	
}
