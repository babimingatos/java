package lista06_fatec;

import java.util.Scanner;

public class MediaMaiorPorcento23 {

	public static void main(String args[]) {
		/*
		 * A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes.
		 * Escreva um programa em Java para coletar dados sobre o salário e número de
		 * filhos de cada habitante e após as leituras, escrever: a) Média de salário da
		 * população; b ) Média do número de filhos; c) Maior salário dos habitantes; d)
		 * Percentual de pessoas com salário menor que R$ 150,00.
		 */

		Scanner sc = new Scanner(System.in);

		double salario = 0.0;
		double maiorSalario = Integer.MIN_VALUE;
		double somaSalario = 0.0;
		double mediaSalario = 0.0;
		double cont = 0.0;
		double contMenor = 0.0;

		int filhos = 0;
		int somaFilhos = 0;
		int mediaFilhos = 0;
		double menorCento = 0;

		for (int i = 0; salario >= 0; i++) {
			System.out.print("Digite o salário: ");
			salario = sc.nextDouble();

			if (salario >= 0) {
				cont++;
				somaSalario += salario;
				mediaSalario = somaSalario / cont;
			}

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}

			if (salario >= 0) {
				System.out.print("Digite o número de filhos: ");
				filhos = sc.nextInt();
				somaFilhos += filhos;
				mediaFilhos = (int) (somaFilhos / cont);
			}
			if (salario <= 150 && salario >= 0) {
				contMenor++;
			}

			menorCento = (contMenor / cont) * 100;
		}

		System.out.print("\nMedia salário: " + mediaSalario + "\nMédia do número de filhos: " + mediaFilhos
				+ "\nMaior Salário: " + maiorSalario + "\nMenor que R$150,00: " + menorCento + "%");
		/* Barbara Mingatos */
	}

}
