package lista08_fatec;

import java.util.Scanner;

public class Ex_18 {

	public static void imprimirVetor(int[] vet) {
		// Barbara Mingatos
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int termos = 0;
		do {
			System.out.print("Termos da sequência: ");
			termos = sc.nextInt();
		} while (termos > 15);

		int[] y = new int[termos];

		int num = 0;
		int fat = 0;
		int aux = 0;

		for (int i = 1; i <= termos; i++) {
			num = i;
			fat = 1;
			for (int j = num; j >= 1; j--) {
				fat *= j;
			}
			y[aux++] = fat;
		}
		System.out.print("Sequencia: ");
		imprimirVetor(y);
		System.out.println();
	}

}
