package lista06_fatec;

import java.util.Scanner;

public class MediaMercadorias18 {

	public static void main(String arg[]) {
		/*
		 * Uma loja está levantando o valor total de todas as mercadorias em estoq ue.
		 * Escreva um programa em Java que permita a entrada das seguintes informações:
		 * a) o número total de mercadorias no estoque; b) o valor de cada mercadoria.
		 * Ao final imprimir o valor total em estoque e a média de valor das mercadorias
		 */

		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		int soma = 0;
		int media = 0;
		
		System.out.print("Digite a mercadoria total do estoque: ");
		int estoque = sc.nextInt();

		for (int i = 1; i <= estoque; i++) {
			System.out.print("Digite o valor da mercadoria " + i + ": ");
			valor = sc.nextDouble();
			soma += valor;
			media = soma / estoque;
		}
		System.out.print(media);
		/* Barbara Mingatos */
	}

}
