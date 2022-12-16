package lista08_fatec;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int n = 10;
		int m = 15;
		int[] p = new int[n];
		int[] q = new int[m];
		int[] r = new int[n + m];
		int aux = 0;

		do {
			System.out.print("Digite a quantidade de elementos do vetor P: ");
			n = sc.nextInt();
		} while (n < 10);

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o elemento " + (1 + i) + ": ");
			p[i] = sc.nextInt();
			r[aux] = p[i];
			aux++;
		}
		do {
			System.out.print("Digite a quantidade de elementos do vetor M: ");
			m = sc.nextInt();
		} while (n < 15);

		for (int i = 0; i < 15; i++) {
			System.out.print("Digite o elemento " + (1 + i) + ": ");
			q[i] = sc.nextInt();
			r[aux] = q[i];
			aux++;
		}
		System.out.print("Concatenado: ");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}

	}

}
