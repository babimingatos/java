package lista07_fatec;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toUpperCase();

		int contL = 0;
		int contN = 0;
		for (int var = 0; var < frase.length(); var++) {

			for (char l = 'A'; l < 'Z'; l++) {
				if (frase.charAt(var) == l) {
					contL++;
				}

			}
			for (char n = 48; n < 57; n++) {
				if (frase.charAt(var) == n) {
					contN++;
				}
			}
		}
		System.out.print("\nNúmeros: " + contN + "\nLetras: " + contL);
	}

}
