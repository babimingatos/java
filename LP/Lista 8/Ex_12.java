package lista08_fatec;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int[] p = new int[2];
		int[] q = new int[5];
		int[] r = new int[10];
		int aux = 0;
		System.out.println("Vetor P: ");
		for (int i = 0; i < 2; i++) {
			System.out.print("Digite o elemento: " + (1 + i) + ": ");
			p[i] = sc.nextInt();
			r[aux] += p[i];
			aux++;
		}

		System.out.println("\nVetor Q: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o elemento: " + (1 + i) + ": ");
			q[i] = sc.nextInt();

			r[aux] += q[i];
			aux++;
		}

		System.out.println("Concatenado: ");
		for (int i = 0; i < 7; i++) {
			System.out.print(r[i] + " ");
		}
	}

}
