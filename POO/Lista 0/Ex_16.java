package lista0;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão: ");
		int dim = sc.nextInt();

		int[][] matriz = new int[dim][dim];

		for (int i = 0; i < dim; i++) {
			System.out.println();
			for (int j = 0; j < dim; j++) {
				matriz[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matriz[i][j]);
			}
		}

		System.out.print("\n\nDiagonal: ");

		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				if (j <= i && j + i <= dim - 1) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	}

}
