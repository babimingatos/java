package lista0;

import java.util.Random;
import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz: ");
		int linha = sc.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];
		int somaDiagonal = 0;
		int somaLinha = 0;
		int somaColuna = 0;

		System.out.print("Original: ");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matriz[i][j]);
			}
		}

		int[][] matrizfim = new int[linha + 1][coluna + 1];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matrizfim[i][j] = matriz[i][j];
			}
		}

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				somaLinha += matriz[i][j];
			}
			matrizfim[i][coluna] = somaLinha;
		}

		for (int j = 0; j < coluna; j++) {
			for (int i = 0; i < linha; i++) {
				somaColuna += matriz[i][j];
			}
			matrizfim[linha][j] = somaColuna;
		}

		for (int i = 0; i < linha; i++) {
			somaDiagonal += matriz[i][i];
		}

		matrizfim[linha][coluna] = somaDiagonal;

		System.out.println("\nMatriz:");
		for (int i = 0; i <= linha; i++) {
			System.out.println();
			for (int j = 0; j <= coluna; j++) {
				System.out.print(" " + matrizfim[i][j]);
			}
		}
	}

}
