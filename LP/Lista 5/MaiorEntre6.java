package lista05_fatec;

import java.util.Scanner;

public class MaiorEntre6 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler dois valores (considere que n�o ser�o
		 * lidos valores iguais) e escrever o maior deles.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();

		System.out.println("Digite um outro valor: ");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Os n�meros n�o podem ser iguais! ");
		} else if (num1 > num2) {
			System.out.println("O numero 1 � maior!");
		} else {
			System.out.println("O n�mero 2 � maior!");
		}
		/* Barbara Mingatos */
	}

}
