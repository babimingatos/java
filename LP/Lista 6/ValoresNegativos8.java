package lista06_fatec;

import java.util.Scanner;

public class ValoresNegativos8 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler 10 valores e escrever quantos desses
		 * valores lidos são NEGATIVOS
		 */
//		

		int cont = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um numero inteiro: ");
			int num = sc.nextInt();

			if (num < 0) {
				cont++;
			}
		}

		System.out.print("Números negativos é: " + cont);
	}
	/* Barbara Mingatos */
}
