package lista05_fatec;

import java.util.Scanner;

public class HoraExtra9 {

	public static void main(String args[]) {

		/*
		 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio
		 * que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
		 * hora regular com um acr�scimo de 50%. Escreva um programa em Java que leia o
		 * n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio
		 * total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham
		 * sido trabalhadas (considere que o m�s possua 4 semanas exatas)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite as horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("Digite o sal�rio por hora do funcionario: ");
		double salarioH = sc.nextDouble();

		double base = horas * salarioH;

		if (horas > 40) {
			double qtd = horas - 40;
			double vExtra = salarioH / 2;
			double extra = qtd * vExtra;
			double total = extra + base - qtd;
			System.out.print(total);
		} else {
			System.out.print(base);
		}

		/* Barbara Mingatos */
	}

}
