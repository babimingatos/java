package lista04_fatec;

import java.util.Random;

public class ADivisivelPorBRandom5 {

	public static void main(String[] args) {

		/*
		 * Crie um arquivo chamado ADivisivelPorBRandom.ja va. Implemente um programa em
		 * Java que guarde dois valores num�ricos inteiros: a e b, gerados
		 * aleatoriamente, sendo a de 0 at� 1000 (inclusos) e b de 0 a 20 (inclusos).
		 * Exiba na sa�da padr�o a mensagem � divis�vel quando a for divis�vel por b ou
		 * a mensagem N�o � divis�vel, caso contr�rio
		 */

		Random ra = new Random();

		int a = ra.nextInt(1000);
		int b = ra.nextInt(20);

		
		if (a % b == 0) {
			System.out.println("� divis�vel " + a % b);
		} else {
			System.out.println("N�o divis�vel " + a % b);
		}
		System.out.print("");

		/* Barbara Mingatos */

	}

}
