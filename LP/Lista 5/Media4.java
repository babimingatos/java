package lista05_fatec;

import java.util.Scanner;

public class Media4 {
	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler as notas da primeira e segunda
		 * avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever uma
		 * mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual
		 * ou maior que 6 o aluno � aprovado). Escrever tamb�m a m�dia calculada.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota da primeira avalia��o: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a nota da primeira avalia��o: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Aluno aprovado!\n M�dia: " + media);
		} else if (media <= 5.9) {
			System.out.println("Aluno reprovado!\n M�dia: " + media);
		}

		/* Barbara Mingatos */
	}
}