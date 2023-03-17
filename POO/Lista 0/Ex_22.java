package lista0;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linha das matrizes: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas da matriz A: ");
		int cola = sc.nextInt();

		System.out.print("Digite a quantidade de colunas da matriz B: ");
		int colb = sc.nextInt();

		int[][] matrizA = new int[linha][cola];
		int[][] matrizB = new int[linha][colb];
		int[][] matrizC = new int[linha][cola + colb];
		int k = 0;

		System.out.print("\nMatriz A: ");
		for (int i = 0; i < matrizA.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizA.length; j++) {
				matrizA[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matrizA[i][j]);
			}
		}
		System.out.print("\n\nMatriz B: ");
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println();
			for (int j = 0; j < matrizB.length; j++) {
				matrizB[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matrizB[i][j]);
			}
		}
		System.out.print("\n\nMatriz C: \n");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < cola; j++) {
				matrizC[i][k++] = matrizA[i][j];
				matrizC[i][k++] = matrizB[i][j];
			}
			for (int j = cola; j < colb; j++) {
				matrizC[i][k++] = matrizB[i][j];
			}
		}

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < cola + colb; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
	}
}
