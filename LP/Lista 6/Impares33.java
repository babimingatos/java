package lista06_fatec;

import java.util.Scanner;

public class Impares33 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, finalizar o p rograma, caso seja positivo imprimir a sequência de
		 * termos: 1, 3, 5, 7, ..
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um termo: ");
		int termos = sc.nextInt();

		if(termos<0) {
			System.out.print("Digite um termo: ");
			termos = sc.nextInt();
		}
		
		for (int i = 1; i <= termos; i += 2) {
			System.out.print(i + ", ");
		}

		/* Barbara Mingatos */

	}

}
