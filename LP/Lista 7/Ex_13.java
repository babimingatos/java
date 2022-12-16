package lista07_fatec;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toUpperCase();
		int contC = 0;
		for (int letras = 0; letras < frase.length(); letras++) {

			if (frase.charAt(letras) == 'A' || frase.charAt(letras) == 'E' || frase.charAt(letras) == 'I'
					|| frase.charAt(letras) == 'O' || frase.charAt(letras) == 'U') {
			} else {
				contC++;
			}
		}
		System.out.print(contC);
	}

}
