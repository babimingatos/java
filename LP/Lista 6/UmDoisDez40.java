package lista06_fatec;

import java.util.Scanner;

public class UmDoisDez40 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa que solicite ao usuário a quantidade de te rmos,
		 * validando a entrada, sendo o valor negativo, solicitar nova entrada, sendo o
		 * valor ZERO, finalizar o programa, caso seja positivo imprimir a sequência de
		 * termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1 . Exemplo com entrada de 20 termos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor < 0) {
			System.out.print("Valor maior que zero: ");
			valor = sc.nextInt();
		}

		for (int i = 1; i <= valor/2; i++) {

			System.out.print(i + ", ");
		}
		
		for (int i = valor/2; i >= 1;  i--) {

			System.out.print(i + ", ");
		}
		/* Barbara Mingatos */
	}
}
