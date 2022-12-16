package lista08_fatec;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int qtd = 0;

		do {
			System.out.print("Digite a quantidade de posições: ");
			qtd = sc.nextInt();
		} while (qtd > 10);

		int[] n = new int[qtd];

		System.out.print("Digite o valor máximo: ");
		int max = sc.nextInt();

		int termos = 20;

		int[] num = new int[termos];
		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite os termos: ");
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < n.length; i++) {
			if (num[i] > max) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
