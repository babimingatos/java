package lista3;

import java.util.Scanner;

public class Ex_11 {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.print("Erro! Valor inv�lido.");
		} else {

			boolean resultado = numPer(num);

			if (resultado) {
				System.out.println(num + " � perfeito!");
			} else {
				System.out.println(num + " n�o � perfeito.");
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

		if (somaDiv == num) {
			return true;
		} else {
			return false;
		}
	}
}
