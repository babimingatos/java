package lista06_fatec;

import java.util.Scanner;

public class SomaMenorQuarenta13 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler 10 números. Todos os números lidos com
		 * valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada
		 */

		Scanner sc = new Scanner(System.in);

		int soma = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.print("Digite um número: ");
			double num = sc.nextDouble();

			if (num <= 40) {
				soma += num;
			}

		}
		System.out.print(soma);
		/* Barbara Mingatos */
	}

}
