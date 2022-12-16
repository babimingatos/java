package lista08_fatec;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão: ");
		int tam = sc.nextInt();

		int maior = 0;
		int menor = 0;

		int[] um = new int[tam];

		if (tam > 0 && tam < 15) {
			for (int i = 0; i < tam; i++) {
				System.out.print("Digite os termos: ");
				um[i] = sc.nextInt();
			}

			for (int i = 0; i < tam; i++) {
				for (int j = 0; j < tam; j++) {
					if (um[i] > um[j]) {
						maior = um[i];
						System.out.print("\nMaior valor em: " + maior);
					}
					if (um[i] < um[j]) {
						menor = um[i];
						System.out.print("\nMenor valor em: " + menor);
					}
				}
			}

		} else {
			System.out.print("Digite novamente a dimensão: ");
			tam = sc.nextInt();
			um = new int[tam];
		}

	}

}
