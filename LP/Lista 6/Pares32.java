package lista06_fatec;

import java.util.Scanner;

public class Pares32 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, finaliz ar o programa, caso seja positivo imprimir a sequência de
		 * termos: 0, 2, 4, 6, ..
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int termos = sc.nextInt();

		if (termos < 0) {
			System.out.print("Maior que zero: ");
			termos = sc.nextInt();
		}

		for (int i = 0; i <= termos; i += 2) {
			if (termos % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		/* Barbara Mingatos */

	}

}
