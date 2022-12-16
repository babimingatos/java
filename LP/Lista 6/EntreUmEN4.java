package lista06_fatec;

import java.util.Scanner;

public class EntreUmEN4 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler um valor N e imprimir todos os valores
		 * inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre
		 * maior que ZERO.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		/* Barbara Mingatos */
	}

}
