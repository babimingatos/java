package lista0;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];
		int[] vetor = new int[linha * coluna];

		System.out.print("Original: ");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matriz[i][j]);
			}
		}

		for (int i = 0; i < linha; i++) {
			Arrays.sort(matriz[i]);
		}

		System.out.println("\nLinha decrescente:");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				System.out.print(" " + matriz[i][j]);
			}

		}

	}

}
