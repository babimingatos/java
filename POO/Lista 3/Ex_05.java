package lista3;

import java.util.Scanner;

public class Ex_05 {

	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = sc.nextInt();

		System.out.print(primo(num));

	}

	static boolean primo(int num) {
		boolean prim = true;
		if (num <= 1) {
			prim = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					prim = false;
					break;
				}
			}
		}
		return prim;
	}

}
