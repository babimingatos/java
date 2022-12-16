package lista07_fatec;

import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int cont = 0;

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toUpperCase();

		for (char letras = 'A'; letras < 'Z'; letras++) {
			cont = 0;
			for (int lfrase = 0; lfrase < frase.length(); lfrase++) {
				if (frase.charAt(lfrase) == letras) {
					cont++;
				}
			}
			if (cont >= 1) {
				System.out.println(letras + " - " + cont);
			}

		}

	}

}
