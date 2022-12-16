package lista08_fatec;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int m = 0;
		int aux = 0;

		do {
			System.out.print("Digite a quantidade de elementos do vetor S: ");
			n = sc.nextInt();
		} while (n > 10);

		int[] s = new int[n];

		for (int i = 0; i < s.length; i++) {
			System.out.print("Digite o elemento " + (1 + i) + ": ");
			s[i] = sc.nextInt();
		}

		do {
			System.out.print("Digite a quantidade de elementos do vetor T: ");
			m = sc.nextInt();
		} while (m > 15);

		int[] t = new int[m];

		for (int i = 0; i < t.length; i++) {
			System.out.print("Digite o elemento " + (1 + i) + ": ");
			t[i] = sc.nextInt();
		}

		int[] u = new int[n + m];
		int j = 0;
		int k = 0;
		int m1 = 0;

		while (j < s.length && k < t.length) {
			u[m1++] = s[j++];
			u[m1++] = t[k++];
		}
		while (j < s.length) {
			u[m1++] = s[j++];
		}
		while (k < t.length) {
			u[m1++] = t[k++];
		}
		System.out.print("Intercalado: ");
		for (int i = 0; i < u.length; i++) {
			System.out.print(u[i] + " ");
		}
	}

}
