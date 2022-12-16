package lista08_fatec;

import java.util.Scanner;

public class Ex_26 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		boolean primo = false;
		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		int[] termos = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite os termo " + (i + 1) + ": ");
			termos[i] = sc.nextInt();
		}

		int aux = 0;
		for (int i = 0; i < qtd; i++) {
			for (int j = 0; j < qtd; j++) {
				if (termos[i] < termos[j] && termos[i] % 2 == 0 && termos[j] % 2 == 0) {
					aux = termos[j];
					termos[j] = termos[i];
					termos[i] = aux;
				}
			}
		}

		for (int i = 1; cont < qtd; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo == true) {
				System.out.print(i + " ");
				cont++;
			}
			primo = true;
		}

	}

}
