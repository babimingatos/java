package lista04_fatec;

import java.util.Random;

public class ADivisivelPorBRandom5 {

	public static void main(String[] args) {

		/*
		 * Crie um arquivo chamado ADivisivelPorBRandom.ja va. Implemente um programa em
		 * Java que guarde dois valores numéricos inteiros: a e b, gerados
		 * aleatoriamente, sendo a de 0 até 1000 (inclusos) e b de 0 a 20 (inclusos).
		 * Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou
		 * a mensagem Não é divisível, caso contrário
		 */

		Random ra = new Random();

		int a = ra.nextInt(1000);
		int b = ra.nextInt(20);

		
		if (a % b == 0) {
			System.out.println("É divisível " + a % b);
		} else {
			System.out.println("Não divisível " + a % b);
		}
		System.out.print("");

		/* Barbara Mingatos */

	}

}
