package lista2;

import java.util.Random;

public class ExibeNumeroAleatorio2 {
	public static void main(String args[]) {
		/*
		 * Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em
		 * Java que gere um n�mero real aleat�rio entre 0 e 100. Esse n�mero deve ser
		 * armazenado em uma vari�vel do tipo double chamada numeroAleatorio. Por fim,
		 * exiba o valor dessa vari�vel na sa�da padr�o.
		 */

		/* Double */
		Random random = new Random();
		double numeroAleatorio = random.nextDouble();
		System.out.println(numeroAleatorio);

		
		/* Estrutura For */
		for (int i = 0; i < 1; i++) {
			System.out.println(random.nextDouble()*100);
		}
		System.out.println("Barbara dos Santos Mingatos ");
		
		// Barbara dos Santos Mingatos
	}
}
