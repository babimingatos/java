package lista3;

import java.util.Scanner;

public class Ex_02 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sci = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		System.out.print("A temperatura você quer descobrir: Celsius ou Fahrenheit?: ");
		String escolha = sci.nextLine().toUpperCase();

		if (escolha.charAt(0) == 'F') {
			System.out.print("Digite o valor em celsius: ");
			int c = sc.nextInt();
			System.out.print("Fahrenheit: " + fahrenheit(c));

		} else if (escolha.charAt(0) == 'C') {
			System.out.print("Digite o valor em fahrenheit: ");
			int f = sc.nextInt();
			System.out.print("Celsius: " + celsius(f));

		} else {
			System.out.print("C para celsius e F para fahrenheit");
		}
	}

	static int fahrenheit(int c) {
		int f = 0;
		f = (9 * c / 5) + 32;
		return f;
	}

	static int celsius(int f) {
		int c = 0;
		c = 5 * (f - 32) / 9;
		return c;
	}

}
