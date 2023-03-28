package lista1;

import java.util.Scanner;

public class Ex_02 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num = sc.nextDouble();

		if (zero(num)) {
			System.out.print(num + " é zero");
		} else {
			System.out.print(num + " não é zero");
		}
	}

	static boolean zero(double num) {
		if (num == 0) {
			return true;
		}
		return false;
	}

}
