package lista2;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n1 = sc.nextInt();

		System.out.print("Digite um n�mero: ");
		int n2 = sc.nextInt();

		System.out.print("Menor n�mero: " + menor(n1, n2));
	}

	static int menor(int n1, int n2) {
		return Math.min(n1, n2);
	}
}
