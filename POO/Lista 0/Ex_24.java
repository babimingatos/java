package lista0;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linha da matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Digite a quantidade de colunas da matriz: ");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];
		int a = 0, b = 1;

		System.out.println("\nMatriz: ");
		for (int i = 0; i < linhas; i++) {
			System.out.println();
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = a;
				int c = a + b;
				a = b;
				b = c;
				System.out.print(" " + matriz[i][j]);
			}
		}
	}
}
