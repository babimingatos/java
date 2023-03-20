package lista0;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma quantidade: ");
		int qtd = sc.nextInt();

		int[] v = new int[qtd];
		int[][] m = new int[qtd][];

		for (int i = 0; i < qtd; i++) {
			v[i] = (int) (Math.random() * 8) + 1;
		}

		for (int i = 0; i < qtd; i++) {
			m[i] = new int[v[i] + 1];
			m[i][0] = v[i];
			for (int j = 1, k = 2; j < m[i].length; j++) {
				while (true) {
					boolean primo = true;
					for (int l = 2; l <= Math.sqrt(k); l++) {
						if (k % l == 0) {
							primo = false;
							break;
						}
					}
					if (primo) {
						m[i][j] = k;
						k++;
						break;
					}
					k++;
				}
			}
		}

		System.out.println("Matriz:");
		for (int i = 0; i < qtd; i++) {
			System.out.println();
			System.out.print(m[i][0] + "->");
			for (int j = 1; j < m[i].length; j++) {
				System.out.print(" " + m[i][j]);
			}
		}
	}
}
