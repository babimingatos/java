package lista1;

import java.util.Scanner;

public class Ex_04 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		double a = sc.nextDouble();

		System.out.print("Digite o valor de B: ");
		double b = sc.nextDouble();

		System.out.print("Digite o valor de C: ");
		double c = sc.nextDouble();

		double delta = conta(a, b, c);

		System.out.println("O valor de DELTA é: " + delta);
	}

	static double conta(double a, double b, double c) {
		double conta = 0;
		conta = (b * b) - 4 * (a * c);
		return conta;
	}
}
