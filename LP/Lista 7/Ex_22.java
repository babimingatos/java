package lista07_fatec;

import java.util.Scanner;

public class Ex_22 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toLowerCase();

		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine().toLowerCase();

		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {

			if (palavra.charAt(0) == frase.charAt(i)) {
				int j = 1;
				do {
					j++;

					if (j == palavra.length()) {
						cont++;
					}
				} while (((i + j) < frase.length()) && (j < palavra.length())
						&& (frase.charAt(i + j)) == palavra.charAt(j));

			}

		}
		System.out.print(cont);
	}
}
