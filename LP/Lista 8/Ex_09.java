package lista08_fatec;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		int[] g = new int[5];
		int[] h = new int[5];
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite 5 elementos: ");
			g[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (g[i] % 2 == 0) {
				h[i] = g[i];
				System.out.print(" " + h[i]);
				cont++;
			}

		}
		if (cont == 0) {
			System.out.print("Todos os números são ímpares:(");
		}

	}
}
