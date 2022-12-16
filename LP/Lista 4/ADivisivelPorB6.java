package lista04_fatec;

import java.util.Scanner;

public class ADivisivelPorB6 {

	public static void main(String[] args) {

		/*
		 * Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java
		 * que guarde dois valores num�ricos inteiros: a e b, informados pelo usu�rio,
		 * sendo a de 0 at� 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores
		 * digitados p elo usu�rio, informando caso n�o sejam validos. Valide, tamb�m,
		 * se o valor de 1 � maior ou igual ao valor de b, caso n�o seja, informe ao
		 * usu�rio. Exiba na sa�da padr�o a mensagem � divis�vel quando a for divis�vel
		 * por b ou a mensagem N�o � divis�vel, caso contr�rio
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor at� 1000: ");
		int a = sc.nextInt();

		System.out.println("Digite um valor at� 20: ");
		int b = sc.nextInt();

		if (a > b || a==b) {
			if (a % b == 0) {
				System.out.println("� divisivel. " + a% b);
			}
		}
		if (a < 1 || b < 1) {
			System.out.println("Digite outro n�mero. ");
		}

		/* Barbara Mingatos */
	}

}
