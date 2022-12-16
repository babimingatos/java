package lista08_fatec;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int[] z = new int[10];
		int aux = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite os elementos: ");
			z[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (z[i] < z[j]) {
					aux = z[j];
					z[j] = z[i];
					z[i] = aux;
				}
			}
		}

		System.out.print("Ordenados:");
		for (int i = z.length - 1; i >= 0; i--) {
			System.out.print(" " + z[i]);
		}

	}

}
