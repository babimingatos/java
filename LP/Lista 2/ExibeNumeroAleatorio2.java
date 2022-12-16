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
