package lista0;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_28 {

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
			for (int j = 0; j < coluna - 1; j++) {
				for (int k = j + 1; k < coluna; k++) {
					if (matriz[i][k] > matriz[i][j]) {
						int temp = matriz[i][j];
						matriz[i][j] = matriz[i][k];
						matriz[i][k] = temp;
					}
				}
			}
		}

		System.out.println("Linha decrescente: :");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				System.out.print(" " + matriz[i][j]);
			}
		}
	}
}
