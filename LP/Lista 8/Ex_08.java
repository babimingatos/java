package lista08_fatec;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int[] f = new int[5];
		int soma = 0;
		boolean impar = false;
		boolean par = false;

		for (int i = 0; i < f.length; i++) {
			System.out.print("Digite 5 valores: ");
			f[i] = sc.nextInt();
		}
		for (int i = 0; i < f.length; i++) {
			if (f[i] % 2 != 0) {
				impar = true;
				soma += f[i];
			} else {
				par = true;
			}

		}
		if (impar == true) {
			System.out.print(soma + " ");
		} else {
			System.out.print("Nnehum ");
		}
	}

}
