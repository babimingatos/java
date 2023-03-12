package lista0;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas: ");
		int coluna = sc.nextInt();

		System.out.print("Digite o valor máximo dos valores: ");
		int valor = sc.nextInt();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) (Math.random() * valor);
				System.out.print(matriz[i][j] + " ");
			}
		}
	}

}
