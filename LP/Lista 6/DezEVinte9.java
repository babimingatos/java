package lista06_fatec;

import java.util.Scanner;

public class DezEVinte9 {

	public static void main(String args[]) {
		/*
		 * Escreva u m programa em Java para ler 10 valores e escrever quantos desses
		 * valores lidos est�o no intervalo [10,20] (incluindo os valores 10 e 20 no
		 * intervalo) e quantos deles est�o fora deste intervalo
		 */

		Scanner sc = new Scanner(System.in);

		int cont = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite alguns n�meros: ");
			int num = sc.nextInt();

			if (num >= 10 && num <= 20) {
				cont++;
			}
		}
		System.out.println(cont);
		/* Barbara Mingatos */
	}

}
