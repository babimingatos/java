package lista08_fatec;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		int[] ai = new int[qtd];
		int[] ah = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite o termo " + (1 + i) + " (AH): ");
			ah[i] = sc.nextInt();

		}
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o termo " + (1 + i) + " (AI): ");
			ai[i] = sc.nextInt();
		}
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (ah[i] != ai[j]) {
					System.out.print("\nNão!");
				} else {
					System.out.print("\nEstá contido! " + ah[0]);
				}
			}
		}

	}

}
