package projeto;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;


public class Game {

	public static void start(Jogador jogador01, Jogador jogador02, Jogador jogador03, Jogador jogador04, Jogador jogador05) {
		
		while(true) {
			if(jogador01 != null) {
				hub(jogador01);
			}
			if(jogador02 != null) {
				hub(jogador02);
			}
			if(jogador03 != null) {
				hub(jogador03);
			}
			if(jogador04 != null) {
				hub(jogador04);
			}
			if(jogador05 != null) {
				hub(jogador05);
			}
		}
		
	}
	
	public static void hub(Jogador atual) {
	
		Scanner scan = new Scanner(System.in);
		
		clear(4);
		
		int casas = rolarDado();
		
		System.out.println("\t\t [ Iniciando turno do "+atual.getNome()+" ] ");
		System.out.println(" \n");
		System.out.println(" SABOR DA PIZZA: "+atual.getPizza().getSabor());
		System.out.println(" INGREDIENTES FALTANDO: "+atual.getPizza().retornaLista());
		System.out.println(" CASA ATUAL: "+atual.getCasaAtual().getCasa());
		System.out.println(" CASA PROXIMA: ");
		scan.next().charAt(0);
		
	}
	
	// Metodo que simula o dado
	public static int rolarDado() {
		Random rand = new Random();
		return (int) rand.nextInt(4) + 1;
	}
	
	// Metodo para pular linhas
	public static void clear(int linhas) {
		for (int i = 0; i < linhas; i++) {
			System.out.println("");
		}
	}
	
}
