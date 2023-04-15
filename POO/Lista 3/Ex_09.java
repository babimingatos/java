package lista3;

import java.util.Scanner;

public class Ex_09 {
	// Barbara Mingatos
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		int resultado = mmc(num1, num2);

		System.out.println("MMC: " + resultado);
	}

	static int mmc(int num1, int num2) {
		int mmc = 0;

		for (int i = 1; i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				mmc = i;
				break;
			}
		}

		return mmc;
	}
}
