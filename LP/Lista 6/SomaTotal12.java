package lista06_fatec;

import java.util.Scanner;

public class SomaTotal12 {

	public static void main(String args[]) {

		/*
		 * Escreva um p rograma em Java para ler 10 números e ao final da leitura
		 * escrever a soma total dos 10 números lidos
		 */

		Scanner sc = new Scanner(System.in);

		double soma = 0;
		for (int i = 1; i <= 10; i++) {

			System.out.print("Digite um número: ");
			double num = sc.nextDouble();

			soma += num;
		}
		
		System.out.print("Soma: " + soma);
		/* Barbara Mingatos */
	}

}
