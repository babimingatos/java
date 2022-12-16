package lista08_fatec;

import java.util.Scanner;
import java.util.Arrays;

public class Ex_31 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sci= new Scanner(System.in);
		Scanner scs = new Scanner(System.in);

		int n = 0;

		while (n < 1 || n > 10) {

			System.out.println("Digite a quantidade ");
			n = sci.nextInt();
		}

		String[] am = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite: ");
			am[i] = scs.nextLine();
		}
	
		System.out.print("\nOrdenado: ");
		
		Arrays.sort(am);
		
		for (int i = 0; i < n; i++) {
			System.out.print(" " + am[i]);
		}
	}
}
