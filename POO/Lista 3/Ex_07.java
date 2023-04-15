package lista3;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite outro número: ");
		int num2 = sc.nextInt();

		int resultado = mdc(num1, num2);
		
		System.out.println("MDC: " + resultado);
	}

	static int mdc(int num1, int num2) {
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int mdc = 1;
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				mdc = i;
			}
		}

		return mdc;
	}
}
