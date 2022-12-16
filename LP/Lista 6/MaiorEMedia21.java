package lista06_fatec;

import java.util.Scanner;

public class MaiorEMedia21 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler uma quantidade e a seguir ler esta
		 * quantidade de n�meros. Depois de ler todos os n�meros o algoritmo deve
		 * apresentar na tela o maior dos n�meros lidos e a m�dia dos n�meros lidos
		 */

		Scanner sc = new Scanner(System.in);

		double valores = 0.0;
		double cont = 0.0;
		double media = 0.0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;

		System.out.print("Digite uma quantidade: ");
		int qtd = sc.nextInt();

		for (int i = 1; i <= qtd; i++) {
			System.out.print("Digite os valores: ");
			valores = sc.nextDouble();

			cont++;
			soma += valores;
			media = (soma / cont);

			if (valores > maior) {
				maior = (int) valores;
			}

		}
		System.out.print("M�dia: " + media + "\nMaior: " + maior);

		/* Barbara Mingatos */
	}
}
