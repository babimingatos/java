package lista1;

import java.util.Scanner;

public class Ex_05 {
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

		if (delta < 0) {
			System.out.println("Sem raízes reais");
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("S= " + x1 + ", " + x2);
		}
	}

	static double conta(double a, double b, double c) {

		double delta = (b * b) - 4 * (a * c);

		if (a == 0) {
			System.out.println("Erro: A=0");
		}
		return delta;
	}
}
