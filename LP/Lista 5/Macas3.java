package lista05_fatec;

import java.util.Scanner;

public class Macas3 {

	public static void main(String args[]) {

		/*
		 * As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00
		 * se forem compradas pelo menos 12. Escreva um programa em Java que leia o
		 * n�mero de ma��s compradas, calcule e escreva o custo total da compra
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de ma�as que comprou: ");
		int macas = sc.nextInt();

		if (macas >= 12) {
			System.out.println("R$1,00 Cada ma��, valor total: " + macas * 1.00);
		} else {
			System.out.println("R$1,30 Cada ma��, valor total: " + macas * 1.3);
		}

		/* Barbara Mingatos */

	}

}
