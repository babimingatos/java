package lista3;

import java.util.Scanner;

public class Ex_12 {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.print("Erro! Inválido.");
		} else {

			for (int i = 1; i <= num; i++) {
				if (numPer(i)) {
					System.out.print(i + " ");
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
		return somaDiv == num;
	}
}
