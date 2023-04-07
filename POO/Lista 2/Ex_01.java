package lista2;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int n1 = sc.nextInt();

		System.out.print("Digite um valor: ");
		int n2 = sc.nextInt();

		System.out.print("O maior número é: " + maior(n1, n2));
	}

	static int maior(int n1, int n2) {

		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}
}
