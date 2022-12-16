package lista05_fatec;

import java.util.Scanner;

public class SalarioTotal10 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler o salário fixo e o valor das vendas
		 * efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma
		 * comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
		 * ultrapassar este valor, calcular e escrever o seu salário total.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salário fixo: ");
		double fixo = sc.nextDouble();

		System.out.print("Digite o valor da vendas: ");
		double vendas = sc.nextInt();

		double menos = vendas * 0.03;
		double mais = vendas * 0.05;

		if (vendas >= 1500) {
			System.out.print("Salário: " + (mais + fixo));
		} else if (vendas < 1499.99) {
			System.out.print("Salário: " + (menos + fixo));
		}

		/* Barbara Mingatos */
	}

}
