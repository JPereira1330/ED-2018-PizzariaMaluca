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
	
		Scanner scan = new Scanner(System.in);
		
		// Limpando a tela
		clear(4);
		
		// Menu de seleção
		while(true) {
			System.out.println(" [ * ] Insira a quantia de jogadores [ 2 ~ 5 ] ~> ");
			try { int quantia = scan.nextInt(); } 
			catch (Exception e) { System.out.println(); }
		}
		
	}
	
	// Metodo para limpar a tela
	private static void clear(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println();
		}
	}
	
}
