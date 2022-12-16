package lista08_fatec;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		boolean primo = false;
		int cont = 0;
		int termos = 0;

		do {
			System.out.print("Digite a quantidade de termos: ");
			termos = sc.nextInt();
		} while (termos <= 20);

		int[] prim = new int[termos];

		for (int i = 1; cont < prim.length; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo == true) {
				System.out.print(i + " ");
				cont++;
			}
			primo = true;
		}

	}

}
