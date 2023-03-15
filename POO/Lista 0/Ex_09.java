package lista0;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensao de linhas da matriz: ");
		int dim = sc.nextInt();

		int[][] matriz = new int[dim][dim];

		System.out.print("Matriz: ");
		for (int i = 0; i < dim; i++) {
			System.out.println();
			for (int j = 0; j < dim; j++) {
				matriz[i][j] = (int) (Math.random() * 8);
				System.out.print(" " + matriz[i][j]);
			}
		}

		System.out.print("\n\nDiagonal principal: ");
		for (int i = 0; i < dim; i++) {
			System.out.print(matriz[i][i] + " ");
		}
	}
}
