package lista08_fatec;

import java.util.Arrays;

public class Ex_11 {

	public static void main(String[] args) {
		// Barbara Mingatos
		int[] qa = new int[5];
		int[] qb = new int[5];
		int[] qc = new int[10];
		int aux = 0;

		for (int i = 0; i < 5; i++) {
			qa[i] = (int) (1 + Math.random() * 10);
			qb[i] = (int) (1 + Math.random() * 10);

			qc[aux] = +qa[i];
			aux++;
			qc[aux] = +qb[i];
			aux++;
		}

		System.out.print("\nVetor QA: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(qa[i] + " ");
		}

		System.out.print("\nVetor QB: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(qb[i] + " ");
		}

		System.out.print("\nIntercalado: ");
		for (int i = 0; i < 10; i++) {

			System.out.print(qc[i] + " ");
		}
	}

}
