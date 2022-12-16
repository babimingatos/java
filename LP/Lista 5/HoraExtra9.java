package lista05_fatec;

import java.util.Scanner;

public class HoraExtra9 {

	public static void main(String args[]) {

		/*
		 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
		 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
		 * hora regular com um acréscimo de 50%. Escreva um programa em Java que leia o
		 * número de horas trabalhadas em um mês, o salário por hora e escreva o salário
		 * total do funcionário, que deverá ser acrescido das horas extras, caso tenham
		 * sido trabalhadas (considere que o mês possua 4 semanas exatas)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite as horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("Digite o salário por hora do funcionario: ");
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
