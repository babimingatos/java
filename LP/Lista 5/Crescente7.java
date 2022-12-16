package lista05_fatec;

import java.util.Scanner;

public class Crescente7 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler dois valores (considere que não serão
		 * lidos valores iguais) e escrevê-los em ordem crescente
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();

		System.out.print("Digite um outro valor: ");
		int valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.print(valor1 + ", " + valor2);
		} else {
			System.out.print(valor2 + ", " + valor1);
		}
		/* Barbara Mingatos */
	}

}
