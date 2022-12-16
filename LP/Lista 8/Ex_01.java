package lista08_fatec;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		// Barbara Mingatos
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite 15 posições: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
