package lista05_fatec;

import java.util.Scanner;

public class MaiorQue1 {
	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler um valor e escrever a mensagem “ É MAIOR
		 * QUE 10! ” se o valor lido for maior que 10, caso contrário escrever “ NÃO É
		 * MAIOR QUE 10! ”
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		if (num > 10) {
			System.out.println("Maior que 10! " + num);
		} else if(num < 10) {
			System.out.println("Menor que 10! " + num);
		}else if (num == 10) {
			System.out.println("Igual a 10! ");
		}
		/* Barbara Mingatos */

	}

}
