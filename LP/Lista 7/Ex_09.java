package lista07_fatec;

import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		int cont = 0;
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cont++;
			}
		}
		System.out.print(cont);
	}

}
