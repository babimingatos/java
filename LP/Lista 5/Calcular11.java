package lista05_fatec;

import java.util.Scanner;

public class Calcular11 {

	public static void main(String args[]) {

		/*
		 * Desenvolva um programa em Java que receba dois valores num�ricos e uma das
		 * op��es que representam uma das opera��es aritm�ticas (ler em String): � + � ,
		 * � - �, �* � e � / �. Calcule e mostre a opera��o efetuada e o seu resultado.
		 */

		Scanner inteiro = new Scanner(System.in);
		

		System.out.print("Digite o primeiro valor: ");
		double v1 = inteiro.nextInt();

		System.out.print("Digite o segundo valor: ");
		double v2 = inteiro.nextInt();

		System.out.print("Digite o tipo de opera��o: \n1- Adi��o \n2- Subtra��o \n3- Multiplica��o \n4- Divis�o ");
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
