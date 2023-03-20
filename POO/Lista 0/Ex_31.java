package lista0;

import java.util.Scanner;
import java.util.Random;

public class Ex_31 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de coluna: ");
		int coluna = sc.nextInt();

		int inicio = 0;
		int fim = 0;

		for (int i = 0; i < 1; i++) {
			System.out.print("Inicio e fim: ");
			inicio = sc.nextInt();
			fim = sc.nextInt();
		}

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = rd.nextInt(fim - inicio + 1) + inicio;
				System.out.print(" " + matriz[i][j]);
			}
		}
	}
}
