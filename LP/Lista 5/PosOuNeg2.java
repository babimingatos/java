package lista05_fatec;

import java.util.Scanner;

public class PosOuNeg2 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler um valor e escrever se � positivo ou
		 * negativo (considere o valor zero como positivo )
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor positivo ou negativo: ");
		int num = sc.nextInt();

		if (num >= 0) {
			System.out.println("N�mero positivo");
		} else {
			System.out.println("N�mero negativo");
		}

		/* Barbara Mingatos */

	}

}
