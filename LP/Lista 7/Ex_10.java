package lista07_fatec;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// Barbara Mingatos
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		int contma = 0;
		int contmi = 0;

		for (int i = 0; i < frase.length(); i++) {
		
			for (char ma = 'A'; ma < 'Z'; ma++) {
				if (frase.charAt(i) == ma)
					contma++;
			}
			for (char mi = 'a'; mi < 'z'; mi++) {
				if (frase.charAt(i) == mi)
					contmi++;
			}

		}
		System.out.print("Maiuscula: " + contma + "\nMinuscula: " + contmi);
	}

}
