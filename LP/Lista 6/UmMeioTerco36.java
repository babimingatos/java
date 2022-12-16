package lista06_fatec;

import java.util.Scanner;

public class UmMeioTerco36 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, finalizar o progr ama, caso seja positivo imprimir a sequência de
		 * termos: 1, - 1, 2, - 2, 3, - 3,
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um termo: ");
		double termos = sc.nextDouble();

		if (termos < 0) {
			System.out.print("Termo maior que zero: ");
			termos = sc.nextDouble();
		}

		for (int i = 1; i <= termos; i++) {

			System.out.print("1/" + i + ", ");
		}

		System.out.println("\n_______________ ");

		double aux = 0.0;
		for (double i = 1; i <= termos; i++) {
			aux = (1 / i);

			System.out.print(aux + ", ");
		}
		/* Barbara Mingatos */
	}

}
