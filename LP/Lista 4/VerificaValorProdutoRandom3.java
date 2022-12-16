package lista04_fatec;

import java.util.Random;

public class VerificaValorProdutoRandom3 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois n�meros
		 * aleat�rios entre 1 e 1000 (inclusos), atribuindo as vari�veis precoProduto1 e
		 * precoProduto2. O programa deve exibir a mensagem O produto 1 � o mais barato
		 * quand o o pre�o do primeiro produto for menor. Caso contr�rio, se o pre�o do
		 * segundo produto for menor, a mensagem O produto 2 � o mais barato deve ser
		 * exibida. Caso contr�rio, a mensagem Os pre�os dos dois produtos s�o iguais �
		 * que deve ser exibida.
		 */

		Random random = new Random();
		int precoProduto1 = random.nextInt(1000);
		int precoProduto2 = random.nextInt(1000);

		if (precoProduto1 > precoProduto2) {
			System.out.println("Produto 1: " + precoProduto1 + "\nProduto 2: " + precoProduto2 + "\n2 mais barato");
		} else if (precoProduto2 > precoProduto1) {
			System.out.println("Produto 1: " + precoProduto1 + "\nProduto 2: " + precoProduto2 + "\n1 mais barato");
		} else if (precoProduto1 == precoProduto2) {
			System.out.println("Produto 1: " + precoProduto1 + "\nProduto 2: " + precoProduto2 + "\nIguais");
		}
		 /*Barbara Mingatos */
	}
}
