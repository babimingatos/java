package lista07_fatec;

import java.util.Scanner;

public class Ex_15 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		int cont = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == '0' || frase.charAt(i) == '1' || frase.charAt(i) == '2' || frase.charAt(i) == '3'
					|| frase.charAt(i) == '4' || frase.charAt(i) == '5' || frase.charAt(i) == '6'
					|| frase.charAt(i) == '7' || frase.charAt(i) == '8' || frase.charAt(i) == '9') {
				cont++;
			}
		}
		System.out.print(cont);
	}

}
