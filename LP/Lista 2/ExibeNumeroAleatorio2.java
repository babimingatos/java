package lista2;

import java.util.Random;

public class ExibeNumeroAleatorio2 {
	public static void main(String args[]) {
		/*
		 * Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em
		 * Java que gere um número real aleatório entre 0 e 100. Esse número deve ser
		 * armazenado em uma variável do tipo double chamada numeroAleatorio. Por fim,
		 * exiba o valor dessa variável na saída padrão.
		 */

		/* Double */
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100);
		System.out.println(numeroAleatorio);

		
		/* Estrutura For */
		for (int i = 0; i < 1; i++) {
			System.out.println(random.nextInt(100));
		}
		System.out.println("Barbara dos Santos Mingatos " + random);
		
		// Barbara dos Santos Mingatos
	}
}
