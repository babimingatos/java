package lista08_fatec;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão: ");
		int tam = sc.nextInt();
		int[] um = new int[tam];
		int[] dois = new int[tam];

		if (tam > 0 && tam <= 15) {
			for (int i = 0; i < tam; i++) {
				System.out.print("Digite um valor de posição " + (i + 1) + ": ");
				um[i] = sc.nextInt();
			}
			for (int i = 0; i < tam; i++) {
				System.out.print("Digite um valor de posição " + (i + 1) + ": ");
				dois[i] = sc.nextInt();
			}
			for (int i = 0; i < tam; i++) {
				for (int l = 0; l < tam; l++) {
					if (um[i] == dois[l]) {
						System.out.print("\nIguais em: " + um[i] + " e " + dois[l]);
					}
				}
			}

		} else {
			System.out.print("Digite uma nova dimensão: ");
			tam = sc.nextInt();
		}
	}

}
