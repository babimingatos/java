package lista0;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão da matriz: ");
		int dim = sc.nextInt();

		int[][] matriz = new int[dim][dim];

		for (int i = 0; i < dim; i++) {
			System.out.println();
			for (int j = 0; j < dim; j++) {
				matriz[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matriz[i][j]);
			}
		}
		System.out.print("\n\nAcima da diagonal: ");
		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				if (i + j >= dim - 1) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	}
}
