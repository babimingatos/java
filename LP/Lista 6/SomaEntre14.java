package lista06_fatec;

import java.util.Scanner;

public class SomaEntre14 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler 2 valores, calcular e escrever a soma
		 * dos inteiros existentes entre os 2 valores lidos (incluindo os valores lidos
		 * na soma). Considere que o segundo valor lido será sempre maior que o primeiro
		 * valor lido
		 */

		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.print("Digite um número: ");
		double num1 = sc.nextDouble();

		System.out.print("Digite outro número: ");
		double num2 = sc.nextDouble();

		for (double i = num1; i <= num2; i++) {
			soma += i;
		}

		System.out.print(soma);
		/* Barbara Mingatos */
	}

}
