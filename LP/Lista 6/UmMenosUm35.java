package lista06_fatec;

import java.util.Scanner;

public class UmMenosUm35 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa que solicite ao usuário a quantidade de termos, validando
		 * a entrada, sendo o valor negativo, solicitar nova entrada, sendo o valor
		 * ZERO, finalizar o progr ama, caso seja positivo imprimir a sequência de
		 * termos: 1, - 1, 2, - 2, 3, - 3,
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int termos = sc.nextInt();

		if (termos < 0) {
			System.out.print("Termo maior do que 0: ");
			termos = sc.nextInt();
		}
		int contM = 0;
		int cont = 0;

		for (int i = 1; i <= termos; i++) {
			contM = i * -i / i;
			cont = i * i / i;
			System.out.print(cont + ", " + contM + ", ");

		}
		/* Barbara Mingatos */
	}

}
