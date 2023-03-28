
package lista1;

import java.util.Scanner;

public class Ex_01 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double num = sc.nextDouble();

		if (positivo(num)) {
			System.out.print(num + " é positivo");
		} else {
			System.out.print(num + " é negativo");
		}
	}

	static boolean positivo(double num) {
		if (num >= 0) {
			return true;
		}
		return false;

	}
}
