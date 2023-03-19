package lista0;

import java.util.Scanner;
import java.util.Arrays;

public class Ex_25 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas da matriz: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas da matriz: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		System.out.println("Original:");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 8) + 1;
				System.out.print(" " + matriz[i][j]);
			}
		}

		Arrays.sort(matriz, (a, b) -> Arrays.compare(a, b));

		System.out.println("\n\nCrescente:");
		for (int i = 0; i < linha; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
}
