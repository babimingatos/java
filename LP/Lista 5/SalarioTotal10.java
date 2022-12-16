package lista05_fatec;

import java.util.Scanner;

public class SalarioTotal10 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler o sal�rio fixo e o valor das vendas
		 * efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
		 * comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 mais 5% sobre o que
		 * ultrapassar este valor, calcular e escrever o seu sal�rio total.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o sal�rio fixo: ");
		double fixo = sc.nextDouble();

		System.out.print("Digite o valor da vendas: ");
		double vendas = sc.nextInt();

		double menos = vendas * 0.03;
		double mais = vendas * 0.05;

		if (vendas >= 1500) {
			System.out.print("Sal�rio: " + (mais + fixo));
		} else if (vendas < 1499.99) {
			System.out.print("Sal�rio: " + (menos + fixo));
		}

		/* Barbara Mingatos */
	}

}
