package lista04_fatec;

import java.util.Random;

public class VerificaValorProdutoRandom3 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números
		 * aleatórios entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e
		 * precoProduto2. O programa deve exibir a mensagem O produto 1 é o mais barato
		 * quand o o preço do primeiro produto for menor. Caso contrário, se o preço do
		 * segundo produto for menor, a mensagem O produto 2 é o mais barato deve ser
		 * exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é
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
