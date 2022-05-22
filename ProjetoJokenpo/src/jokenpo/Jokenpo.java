package jokenpo;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jokenpo");
		System.out.println("");
		System.out.println("1 Pedra?\n");
		System.out.println("2 Papel?\n");
		System.out.println("3 Tesoura?\n");
		System.out.println("Escolha sua opção:\n");
		// logica do Jogador
		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		}
		// logica do Computador
		computador = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}
		// logica para ver o vencedor
		System.out.println("");
		if (jogador == computador) {
			System.out.println("Empate!");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("Jogador Venceu!");
			} else {
				System.out.println("Computador Venceu!");

			}
		}
	
	}

}
