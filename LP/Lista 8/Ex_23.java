package lista08_fatec;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner ler = new Scanner(System.in);

		int aux = 0;

		int[] ad = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o elemento " + i + ": ");
			ad[i] = ler.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (ad[i] < ad[j] && ad[i] % 2 == 0 && ad[j] % 2 == 0) {
					aux = ad[j];
					ad[j] = ad[i];
					ad[i] = aux;
				}
			}
		}

		System.out.print("Pares: ");

		for (int i = 0; i < 10; i++) {
			System.out.print(" " + ad[i]);
		}
	}
}
