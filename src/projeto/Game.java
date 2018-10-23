package projeto;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private static SorteAzar sortaAzar;
	
	public static void start(Jogador jogador01, Jogador jogador02, Jogador jogador03, Jogador jogador04, Jogador jogador05) {
		
		sortaAzar = Inicializador.gerarSorteAzar();
		boolean jogo = false;
		
		while(!jogo) {
			if(jogador01 != null) {
				jogo = hub(jogador01);
				if(jogo)
					break;
			}
			if(jogador02 != null) {
				jogo = hub(jogador02);
				if(jogo)
					break;
			}
			if(jogador03 != null) {
				jogo = hub(jogador03);
				if(jogo)
					break;
			}
			if(jogador04 != null) {
				jogo = hub(jogador04);
				if(jogo)
					break;
			}
			if(jogador05 != null) {
				jogo = hub(jogador05);
				if(jogo)
					break;
			}
		}
		
	}
	
	public static boolean hub(Jogador atual) {
	
		//Scanner scan = new Scanner(System.in);
		
		clear(4);
		
		// Joga numero aleatorio (Entre 1 a 6) e salva a movimentação
		int casas = rolarDado();
		atual.addMovimentos(casas);
		
		System.out.println("\t\t [ Iniciando turno do "+atual.getNome()+" ] ");
		System.out.println(" \n");
		System.out.println(" SABOR DA PIZZA: "+atual.getPizza().getSabor());
		System.out.println(" INGREDIENTES FALTANDO: "+atual.getPizza().retornaLista());
		System.out.println(" CASA ANTERIOR: "+atual.getCasaAtual().getCasa());
		
		atual.getTabuleiro().moveParaPosicao(atual.getMovimentos());
		atual.setCasaAtual(atual.getTabuleiro().getAtual());
		
		System.out.println("\n [ * ] Rolando dado... \n");
		
		System.out.println(" VALOR DO DADO: "+casas);
		System.out.println(" CASA ATUAL: "+atual.getCasaAtual().getCasa());
		
		// Realiza acao
		if(atual.getCasaAtual().getCasa().equalsIgnoreCase("Sote e Azar")) {
			
			// Remove ca
			Carta carta = sortaAzar.rem();
			boolean teste = aplicaSorteAzar(atual, carta);
			
			// Caso der rolagem novamente
			if(teste) {
				hub(atual);
			}
			
			System.out.println(" [SORTE OU AZAR] "+carta.getAcao());
		}else if(atual.getCasaAtual().getCasa().equalsIgnoreCase("Perde Tudo")){
			aplicaPerdeTudo(atual);
		}else {
			atual.getPizza().rem(atual.getCasaAtual().getCasa());
		}
		
		//System.out.println(" [ ! ] Insira qualquer valor para continuar");
		
		//scan.next().charAt(0);
		
		// Verifica se jogador ganhou
		if(atual.getPizza().retornaLista().length() <= 2) {
			System.out.println(atual.getNome()+" venceu!! ");
			return true;
		}
	
		return false;		
	}
	
	// Volta com todos os ingredientes
	public static void aplicaPerdeTudo(Jogador atual) {
		atual.getPizza().add();
		atual.getPizza().add();
		atual.getPizza().add();
		atual.getPizza().add();
		atual.getPizza().add();
	}
	
	// Realiza acao do sorte e azar
	public static boolean aplicaSorteAzar(Jogador atual, Carta carta) {
		
		switch(carta.getAcao()) {
		
			case "Você acertou o ponto da pizza. [ ganhou 1 ingrediente ]":
				atual.getPizza().rem();
				break;
				
			case "O supermercado esta em promoção. [ ganhou 1 Ingredientes ]":
				atual.getPizza().rem();
				break;
				
			case "Você queimou a pizza. [ perdeu 1 ingrediente ]":
				atual.getPizza().add();
				break;
				
			case "Você exagerou nos ingredientes. [ perdeu 1 Ingredientes ]":
				atual.getPizza().add();
				break;
				
			case "Você ganhou uma carona. [ Jogue o novamente dado ]":
				System.out.print(" ");
				return true;
		}
		
		return false;
		
	}
	
	// Metodo que simula o dado
	public static int rolarDado() {
		Random rand = new Random();
		return (int) rand.nextInt(5) + 1;
	}
	
	// Metodo para pular linhas
	public static void clear(int linhas) {
		for (int i = 0; i < linhas; i++) {
			System.out.println("");
		}
	}
	
}
