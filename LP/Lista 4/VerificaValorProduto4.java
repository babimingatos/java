package lista04_fatec;

import java.util.Scanner;

public class VerificaValorProduto4 {
	public static void main(String args[]) {

		/*
		  Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usu�rio que
		  digite os valores para as vari�veis precoProduto1 e precoProduto2. O programa
		  deve testar o valor digitado pelo usu�rio, para as duas vari�veis e caso n�o
		  estejam na faixa de 1 at� 1000 (inclusos), exibir a mensagem VALOR INVALIDO e
		  finalizer o programa. Caso os valores digitados sejam v�lidos, exibir a
		  mensagem O produto 1 � o mais barato quand o o pre�o do primeiro produto for
		  menor. Caso contr�rio, se o pre�o do segundo produto for m enor, a mensagem O
		  produto 2 � o mais barato deve ser exibida. Caso contr�rio, a mensagem Os
		  pre�os dos dois produtos s�o iguais � que deve ser exibida
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int precoProduto1 = sc.nextInt();

		System.out.print("Digite o valor 2: ");
		int precoProduto2 = sc.nextInt();

		if (precoProduto1>=1 && precoProduto1<=1000) {
			if(precoProduto1>precoProduto2) {
				System.out.println("O produto 2 � mais barato R$"+precoProduto2);
			}else if (precoProduto1<precoProduto2) {
				System.out.println("O produto 1 � mais barato R$"+precoProduto1);
			} else {
				System.out.println("Mesmo valor R$"+precoProduto1);
			}
		}else {
			System.out.println("Inv�lido");
		}
		
		
		/* Barbara Mingatos */
	}
}
