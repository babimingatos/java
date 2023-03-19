package lista0;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_26 {

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

		int posicao = 0;
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				vetor[posicao] = matriz[i][j];
				posicao++;
			}
		}

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] > vetor[i]) {
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}

		posicao = 0;
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = vetor[posicao];
				posicao++;
			}
		}

		System.out.println("Decrescente:");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				System.out.print(" " + matriz[i][j]);
			}
		}
	}
}
