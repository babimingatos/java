package lista06_fatec;

import java.util.Scanner;

public class MaiorOuMenorAnterior15 {

	public static void main(String args[]) {

		/*
		 * O mesmo exerc�cio anterior, mas agora, considere que o segundo valor lido
		 * poder� ser maior ou menor que o primeiro valor lido, ou seja, deve - se
		 * test�- los
		 */

		Scanner sc = new Scanner(System.in);

		double soma = 0;
		System.out.print("Digite um n�mero: ");
		double num1 = sc.nextDouble();

		System.out.print("Digite outro n�mero: ");
		double num2 = sc.nextDouble();

		if (num2 > num1) {
			for (double i = num1; i <= num2; i++) {
				soma += i;
			}
		}

		if (num1 > num2) {
			for (double i = num2; i <= num1; i++) {
				soma += i;
			}
		}

		System.out.print(soma);

		/* Barbara Mingatos */
	}

}
