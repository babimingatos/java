package lista07_fatec;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String args[]) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toUpperCase();

		for (char j = 'A'; j < 'Z'; j++) {
			int cont = 0;
			for (int i = 0; i < frase.length(); i++) {

				if (frase.charAt(i) == j) {
					cont++;
				}
			}
			System.out.println(j + " - " + cont);
		}

	}

}
