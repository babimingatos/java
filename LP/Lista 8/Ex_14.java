package lista08_fatec;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int[] s = new int[2];
		int[] t = new int[3];
		int[] u = new int[5];
		int aux = 0;

		System.out.print("\nVetor S: \n");
		for (int i = 0; i < s.length; i++) {
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			s[i] = sc.nextInt();

		}

		System.out.print("\nVetor T: \n");
		for (int i = 0; i < t.length; i++) {
			System.out.print("Digite o elemento " + (i + 1) + ": ");
			t[i] = sc.nextInt();

		}
		int j = 0;
		int k = 0;
		int m = 0;

		while (j < s.length && k < t.length) {
			u[m++] = s[j++];
			u[m++] = t[k++];
		}
		while (j < s.length) {
			u[m++] = s[j++];
		}
		while (k < t.length) {
			u[m++] = t[k++];
		}

		System.out.print("\nIntercalado: ");
		for (int i = 0; i < u.length; i++) {
			System.out.print(u[i] + " ");
		}
	}

}
