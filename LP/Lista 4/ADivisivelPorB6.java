package lista04_fatec;

import java.util.Scanner;

public class ADivisivelPorB6 {

	public static void main(String[] args) {

		/*
		 * Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java
		 * que guarde dois valores numéricos inteiros: a e b, informados pelo usuário,
		 * sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos). Valide os valores
		 * digitados p elo usuário, informando caso não sejam validos. Valide, também,
		 * se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao
		 * usuário. Exiba na saída padrão a mensagem É divisível quando a for divisível
		 * por b ou a mensagem Não é divisível, caso contrário
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor até 1000: ");
		int a = sc.nextInt();

		System.out.println("Digite um valor até 20: ");
		int b = sc.nextInt();

		if (a > b || a==b) {
			if (a % b == 0) {
				System.out.println("É divisivel. " + a% b);
			}
		}
		if (a < 1 || b < 1) {
			System.out.println("Digite outro número. ");
		}

		/* Barbara Mingatos */
	}

}
