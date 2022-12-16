package lista06_fatec;

import java.util.Scanner;

public class MaiorEntreCem20 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java que leia 100 valores e no final, escreva o maior
		 * e o menor valor lido
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite um número de posição " + i + ": ");
			num = sc.nextInt();

			if (num > maior) {
				maior = num;
			}

			if (num < menor) {
				menor = num;
			}

		}
		System.out.print("Maior: " + maior + "\nMenor: " + menor);
		/* Barbara Mingatos */
	}
}
