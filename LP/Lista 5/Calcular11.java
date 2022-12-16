package lista05_fatec;

import java.util.Scanner;

public class Calcular11 {

	public static void main(String args[]) {

		/*
		 * Desenvolva um programa em Java que receba dois valores numéricos e uma das
		 * opções que representam uma das operações aritméticas (ler em String): ‘ + ’ ,
		 * ‘ - ‘, ‘* ’ e ‘ / ’. Calcule e mostre a operação efetuada e o seu resultado.
		 */

		Scanner inteiro = new Scanner(System.in);
		

		System.out.print("Digite o primeiro valor: ");
		double v1 = inteiro.nextInt();

		System.out.print("Digite o segundo valor: ");
		double v2 = inteiro.nextInt();

		System.out.print("Digite o tipo de operação: \n1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão ");
		int op = inteiro.nextInt();

		switch (op) {
		case 1:
			System.out.print(v1 + v2);
			break;
		case 2:
			System.out.print(v1 - v2);
			break;
		case 3:
			System.out.print(v1 * v2);
			break;
		case 4:
			System.out.print(v1 / v2);
			break;

		}

		/* Barbara Mingatos */
	}

}
