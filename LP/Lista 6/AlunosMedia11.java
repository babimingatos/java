package lista06_fatec;

import java.util.Scanner;

public class AlunosMedia11 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler o n�mero de alunos existentes em uma
		 * turma e, ap�s isto, ler as notas destes alunos, calcular e escrever a m�dia
		 * aritm�tica dessas notas lidas.
		 */

		Scanner sc = new Scanner(System.in);
		double media = 0;

		System.out.print("Digite a quantidade de alunos: ");
		int alunos = sc.nextInt();

		for (int i = 1; i <= alunos; i++) {
			System.out.print("Digite a nota do aluno: ");
			double notas = sc.nextDouble();

			media += notas / alunos;
		}
		System.out.print("M�dia: " + media);
		/* Barbara Mingatos */
	}

}
