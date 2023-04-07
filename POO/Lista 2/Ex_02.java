package lista2;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();

		System.out.print("Digite um número: ");
		int n2 = sc.nextInt();

		System.out.print("O menor número é: " + menor(n1, n2));
	}

	static int menor(int n1, int n2) {
		if (n1 > n2) {
			return n2;
		} else {
			return n1;
		}
	}

}
