package lista0;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a qtd de LINHAS da matriz: ");
		int linha = sc.nextInt();

		System.out.print("Digite a qtd de COLUNAS da matriz: ");
		int coluna = sc.nextInt();

		int[][] matrizUm = new int[linha][coluna];
		int[][] matrizDois = new int[linha][coluna];
		int[][] matrizResul = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Digite o valor da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrizUm[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print("Digite o valor da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
				matrizDois[i][j] = sc.nextInt();
			}
		}

		System.out.print("\n------Matriz um------");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				System.out.print(matrizUm[i][j] + " ");
			}
		}

		System.out.print("\n------Matriz dois------");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				System.out.print(matrizDois[i][j] + " ");
			}
		}

		System.out.print("\n------Soma------");
		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matrizResul[i][j] = matrizUm[i][j] + matrizDois[i][j];
				System.out.print(matrizResul[i][j] + " ");
			}
		}

	}

}
