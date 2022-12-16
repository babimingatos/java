package lista08_fatec;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		int[] aj = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			aj[i] = (int) (1 + Math.random() * 100);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print("\nTente: ");
			int tente = sc.nextInt();

			if (aj[i] == tente) {
				System.out.print("\nCerto!");
			}
		}
	}

}
