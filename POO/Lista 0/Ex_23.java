package lista0;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linha da matriz: ");
		int linhas = sc.nextInt();

		System.out.print("Digite a quantidade de colunas da matriz: ");
		int colunas = sc.nextInt();

		int[][] matriz = new int[linhas][colunas];

		int num = 2;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				while (!primo(num)) {
					num++;
				}
				matriz[i][j] = num;
				num++;
			}
		}

		System.out.println("\nMatriz: ");
		for (int i = 0; i < linhas; i++) {
			System.out.println();
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + " ");
			}

		}
	}

	public static boolean primo(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
