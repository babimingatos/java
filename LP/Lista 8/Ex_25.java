package lista08_fatec;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {

		// Barbara Mingatos
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		int[] termos = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite os termos: ");
			termos[i] = sc.nextInt();
		}

		int aux = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (termos[i] < termos[j] && termos[i] % 2 == 0 && termos[j] % 2 == 0) {
					aux = termos[j];
					termos[j] = termos[i];
					termos[i] = aux;
				}
			}
		}
		System.out.print("\nPares- Decrescente:");
		for (int i = qtd - 1; i >= 0; i--) {
			if (termos[i] % 2 == 0) {
				System.out.print(" " + termos[i]);
			}
		}

		System.out.print("\nImpares- Crescente:");
		for (int i = 0; i < qtd; i++) {
			if (termos[i] % 2 != 0) {
				System.out.print(" " + termos[i]);
			}
		}
	}

}
