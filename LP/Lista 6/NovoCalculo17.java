package lista06_fatec;

import java.util.Scanner;

public class NovoCalculo17 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler as notas da 1a. e 2a. avaliações de um
		 * aluno, calcule e imprima a média (simples) desse aluno. Só devem ser aceitos
		 * valores válidos durante a leitura (0 a 10) para cada nota. Ao final da
		 * execução a mensagem 'NOVO CÁLCULO (S/N)?' deve ser apresentada. Se for
		 * respondido 'S' deve retornar e executar um novo cálculo, caso contrário
		 * deverá encerrar o programa
		 */

		Scanner sc = new Scanner(System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		double media = 0.0;
		double soma = 0.0;
		char snc;

		do {

			System.out.print("Digite a nota da avaliação 1: ");
			nota1 = sc.nextDouble();

			if (nota1 < 0 || nota1 > 10) {
				System.out.print("Digite entre 0-10: ");
				nota1 = sc.nextDouble();
			}

			System.out.print("Digite a nota da avaliação 2: ");
			nota2 = sc.nextDouble();

			if (nota2 < 0 || nota2 > 10) {
				System.out.print("Digite entre 0-10: ");
				nota2 = sc.nextDouble();
			}

			System.out.print("Mais notas? S ou N?: ");
			String sn = sc.next();
			snc = sn.charAt(0);
			soma = nota1 + nota2;
			media = soma / 2;
			
		} while (snc == 'S');

		System.out.print(media);
	}
	/* Barbara Mingatos */
}
