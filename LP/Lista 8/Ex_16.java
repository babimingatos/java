package lista08_fatec;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int termos = 0;
		int anterior = 0;
		int proximo = 1;
		int fib = 0;
		do {
			System.out.print("Digite a quantidade de termos: ");
			termos = sc.nextInt();
		} while (termos < 10);

		int[] v = new int[termos];

		for (int i = 1; i < v.length; i++) {
			v[i] = anterior;
			fib = anterior + proximo;
			anterior = proximo;
			proximo = fib;
		}
		for (int i = 1; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

}
