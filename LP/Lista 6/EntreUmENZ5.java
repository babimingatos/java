package lista06_fatec;

import java.util.Scanner;

public class EntreUmENZ5 {

	public static void main(String args[]) {
		/*
		 * Modi fique o exercício anterior para aceitar somente valores maiores que 0
		 * para N . Caso o valor informado (para N) não seja maior que 0, deverá ser
		 * lido um novo valor para N
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor ");
		int num = sc.nextInt();

		while (num <= 0) {
			System.out.print("Digite um número maior que zero: ");
			num = sc.nextInt();
		}

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}

		/* Barbara Mingatos */
	}

}
