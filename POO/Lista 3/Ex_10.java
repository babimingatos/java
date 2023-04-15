package lista3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10 {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de números: ");
		int qtd = sc.nextInt();

		if (qtd <= 1) {
			System.out.print("Erro! Valor inválido. ");
		} else {
			int[] numeros = new int[qtd];
			for (int i = 0; i < qtd; i++) {
				System.out.print("Digite o número de posição " + (i + 1) + ": ");
				numeros[i] = sc.nextInt();
			}

			int resultado = mmc(numeros);

			System.out.println("MMC: " + resultado);
		}
	}

	static int mmc(int[] numeros) {
		int mmc = 1;

		int maximo = max(numeros);
		int[] multiplos = new int[maximo + 1];
		Arrays.fill(multiplos, 0);

		for (int i = 0; i < numeros.length; i++) {
			int num = numeros[i];
			int j = 2;
			while (j <= num) {
				int cont = 0;
				while (num % j == 0) {
					num /= j;
					cont++;
				}
				if (cont > multiplos[j]) {
					multiplos[j] = cont;
				}
				j++;
			}
		}

		for (int i = 2; i <= maximo; i++) {
			while (multiplos[i] > 0) {
				mmc *= i;
				multiplos[i]--;
			}
		}

		return mmc;
	}

	static int max(int[] nums) {
		int maximo = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > maximo) {
				maximo = nums[i];
			}
		}
		return maximo;
	}
}
