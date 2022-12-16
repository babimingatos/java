package lista04_fatec;

import java.util.Scanner;

public class VerificaValorProduto4 {
	public static void main(String args[]) {

		/*
		  Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que
		  digite os valores para as variáveis precoProduto1 e precoProduto2. O programa
		  deve testar o valor digitado pelo usuário, para as duas variáveis e caso não
		  estejam na faixa de 1 até 1000 (inclusos), exibir a mensagem VALOR INVALIDO e
		  finalizer o programa. Caso os valores digitados sejam válidos, exibir a
		  mensagem O produto 1 é o mais barato quand o o preço do primeiro produto for
		  menor. Caso contrário, se o preço do segundo produto for m enor, a mensagem O
		  produto 2 é o mais barato deve ser exibida. Caso contrário, a mensagem Os
		  preços dos dois produtos são iguais é que deve ser exibida
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int precoProduto1 = sc.nextInt();

		System.out.print("Digite o valor 2: ");
		int precoProduto2 = sc.nextInt();

		if (precoProduto1>=1 && precoProduto1<=1000) {
			if(precoProduto1>precoProduto2) {
				System.out.println("O produto 2 é mais barato R$"+precoProduto2);
			}else if (precoProduto1<precoProduto2) {
				System.out.println("O produto 1 é mais barato R$"+precoProduto1);
			} else {
				System.out.println("Mesmo valor R$"+precoProduto1);
			}
		}else {
			System.out.println("Inválido");
		}
		
		
		/* Barbara Mingatos */
	}
}
