package lista0;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];
		int par = 0;
		int impar = 0;

		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 8);
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		System.out.print("\nPar: " + par + "\nImpar: " + impar);

	}

}
