package lista08_fatec;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {
		// Barbara Mingatos
		
		int[] ab = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o termo " + (i + 1) + ": ");
			ab[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (ab[i] % 2 != 0) {
				ab[i] *= 2;
				System.out.print(ab[i] + " ");
			}
		}
	}
}
