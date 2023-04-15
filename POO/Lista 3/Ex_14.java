package lista3;

import java.util.Scanner;

public class Ex_14 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		System.out.println(inverte(num));
	}

	static int inverte(int num) {
		int numInvertido = 0;

		while (num != 0) {
			numInvertido = numInvertido * 10 + num % 10;
			num /= 10;
		}

		return numInvertido;
	}
}
