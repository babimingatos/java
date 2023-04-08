package lista3;

import java.util.Scanner;

public class Ex_03 {
	// Barbara Mingatos
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);

		System.out.print("Entrada em Celsius, Fahrenheit ou Kelvin? ");
		String esc = sci.nextLine().toUpperCase();

		if (esc.charAt(0) == 'C') {
			System.out.print("Digite o valor em celsius: ");
			int c = sc.nextInt();
			System.out.print("K: " + ck(c) + " F: " + cf(c));

		} else if (esc.charAt(0) == 'F') {
			System.out.print("Digite o valor em fahrenheit: ");
			int f = sc.nextInt();
			System.out.print("C: " + fc(f) + " K: " + fk(f));

		} else if (esc.charAt(0) == 'K') {
			System.out.print("Digite o valor em kelvin: ");
			int k = sc.nextInt();
			System.out.print("C: " + kc(k) + " F: " + kf(k));

		} else {
			System.out.print("K para kelvin, F para fahrenheit e C para celsius ");
		}
	}

	static int cf(int c) {
		int f = 0;
		f = (9 * c / 5) + 32;
		return f;
	}

	static int ck(int c) {
		int k = c + 273;
		return k;
	}

	static double fc(int f) {
		double c = 0;
		c = (f - 32) / 1.8000;
		return c;
	}

	static double fk(int f) {
		double k = ((f - 32) * 5 / 9 + 273.15);
		return k;
	}

	static double kc(int k) {
		double c = 0;
		c = k - 273;
		return c;
	}

	static double kf(int k) {
		double f = 0;
		f = (k - 273) * 1.8 + 32;
		return f;
	}
}
