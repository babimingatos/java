package lista0;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma quantidade: ");
		int qtd = sc.nextInt();

		int[][] matriz = new int[qtd][];
		int zero = 0;
		int um = 0;
		int aux = 0;

		for (int i = 0; i < qtd; i++) {
			int mat = (int) (Math.random() * 8) + 1;
			matriz[i] = new int[mat + 1];
			matriz[i][0] = mat;
			zero = 0;
			um = 1;
			for (int j = 1; j < matriz[i].length; j++) {
				matriz[i][j] = um;
				aux = zero + um;
				zero = um;
				um = aux;
			}
		}
		System.out.println("Matriz: ");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					System.out.print("" + matriz[i][j] + "->");
				} else {
					System.out.print(" " + matriz[i][j]);
				}
			}
		}
	}
}
