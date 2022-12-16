package lista05_fatec;

import java.util.Scanner;

public class Media4 {
	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler as notas da primeira e segunda
		 * avaliações de um aluno. Calcular a média aritmética simples e escrever uma
		 * mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual
		 * ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota da primeira avaliação: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a nota da primeira avaliação: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Aluno aprovado!\n Média: " + media);
		} else if (media <= 5.9) {
			System.out.println("Aluno reprovado!\n Média: " + media);
		}

		/* Barbara Mingatos */
	}
}