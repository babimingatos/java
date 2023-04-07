package lista2;

import java.util.Scanner;

public class Ex_07 {
// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String dig;
		boolean r;
		int num = 0;

		do {
			System.out.print("O número sorteado: " + dado(num));

			System.out.print("\nDigitar outro número S/N?: ");
			dig = sc.next();
			r = dig.equalsIgnoreCase("s");

		} while (r);

	}

	static int dado(int num) {
		for (int i = 0; i < 6; i++) {
			num = (int) (Math.random() * 6) + 1;
		}
		return num;
	}

}
