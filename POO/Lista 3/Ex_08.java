package lista3;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de termos: ");
		int qtd = sc.nextInt();

		if (qtd == 0) {
			System.out.print("");
		} else if (qtd < 0) {
			System.out.print("ERRO! Valor inválido. ");
		} else {
			int[] nums = new int[qtd];

			for (int i = 0; i < qtd; i++) {
				System.out.print("Digite o número de posição " + (i + 1) + ": ");
				nums[i] = sc.nextInt();
			}

			int resultado = mdc(nums);

			System.out.println("MDC: " + resultado);
		}
	}

	static int mdc(int[] nums) {
		int mdc = 1;

		for (int i = 2; i <= nums[0]; i++) {
			boolean divComum = true;

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] % i != 0) {
					divComum = false;
					break;
				}
			}

			if (divComum) {
				mdc = i;
			}
		}

		return mdc;
	}
}
