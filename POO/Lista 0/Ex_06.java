package lista0;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de colunas: ");
		int coluna = sc.nextInt();

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		int matriz[][] = new int[linha][coluna];
		int cont = 0;

		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 5);
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] == valor) {
					cont++;
				}
			}
		}
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (matriz[i][j] == valor) {
					cont++;
					System.out.print("\nNa posição: [" + (i + 1) + "][" + (j + 1) + "]");
				}
			}
		}
		System.out.print("\nAparições de " + valor + ": " + cont / 2);
	}
}
