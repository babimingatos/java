package lista3;

import java.util.Scanner;

public class Ex_13 {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		if (qtd <= 0) {
			System.out.print("Erro! Inválido. ");
		} else {
			int[] numeros = new int[qtd];
			for (int i = 0; i < qtd; i++) {
				System.out.print("Digite o número de posição " + (i + 1) + ": ");

				numeros[i] = sc.nextInt();
			}

			for (int num : numeros) {
				if (numPer(num)) {
					System.out.println(num + " ");
				}
			}
		}
	}

	static boolean numPer(int num) {
		int somaDiv = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				somaDiv += i;
			}
		}

		return num == somaDiv;
	}
}
