package lista2;

import java.util.Scanner;

public class Ex_05 {
// Barbara Mingatos
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.print("Digite um número: ");
		int n2 = sc.nextInt();

		System.out.print("Digite um número: ");
		int n3 = sc.nextInt();

		System.out.print("Maior número: " + maior(n1, n2, n3));
	}

	static int maior(int n1, int n2) {
		if (n1 < n2) {
			return n2;
		} else {
			return n1;
		}

	}

	static int maior(int n1, int n2, int n3) {
		if (n1 >= n2 && n1 >= n3) {
			return n1;
		} else if (n2 >= n1 && n2 >= n3) {
			return n2;
		} else {
			return n3;
		}
	}

}
