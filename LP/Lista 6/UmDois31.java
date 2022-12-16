package lista06_fatec;

import java.util.Scanner;

public class UmDois31 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, f inalizar o programa, caso seja positivo imprimir a sequência de
		 * termos: 1, 2, 3, 4, ..
		 */

		Scanner sc = new Scanner(System.in);
		int termos = 0;
		System.out.print("Digite a quantidade de termos: ");
		termos = sc.nextInt();

		if (termos < 0) {
			System.out.print("Apenas termos maiores que 0: ");
			termos = sc.nextInt();
		}
		
		for (int i = 1; i <= termos; i++) {
			System.out.print(i + ", ");
		}
	}

	/* Barbara Mingatos */
}
