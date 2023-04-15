package lista3;

import java.util.Scanner;

public class Ex_01 {
	// Barbara Mingatos
	static int f = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a temperatura em Celsius: ");
		int c = sc.nextInt();

		System.out.print("Fahrenheit: " + calculo(c));

	}

	static int calculo(int c) {
		f = (((9 * c) / 5) + 32);
		return f;

	}

}
