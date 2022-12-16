package lista06_fatec;

import java.util.Scanner;

public class UmTresSeis34 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, finalizar o program a, caso seja positivo imprimir a sequência de
		 * termos: 0, 1, 3, 6, 10, 15,
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor < 0) {
			System.out.print("Valor maior que zero: ");
			valor = sc.nextInt();
		}

		for (int i = 0; i <= valor; i++) {
			int s = (i + (i * i)) / 2;
			System.out.print(s + " ");
		}
		/* Barbara Mingatos */
	}

}
