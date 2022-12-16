package lista06_fatec;

import java.util.Scanner;

public class TabuadaN7 {

	public static void main(String args[]) {
		/*
		 * Esc reva um programa em Java para ler um valor inteiro (aceitar somente
		 * valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a tabuada que você deseja: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int tab = num * i;
			System.out.println(tab);
		}

		/* Barbara Mingatos */
	}

}
