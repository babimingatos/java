package lista06_fatec;

import java.util.Scanner;

public class ZeroUm38 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, fina lizar o programa, caso seja positivo imprimir a sequência de
		 * termos: 0 (0/1), 1/2, 2/3, 3/4, 4/5
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		double valor = sc.nextInt();

		if (valor < 0) {
			System.out.print("Valor maior que zero: ");
			valor = sc.nextInt();
		}

		for (int i = 0; i <= valor; i++) {

			if (i == 0) {
				System.out.print("0, ");
			}

			System.out.print(i + "/" + (i + 1) + ", ");
		}

		/* Barbara Mingatos */
	}

}
