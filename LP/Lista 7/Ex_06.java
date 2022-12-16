package lista07_fatec;

import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int cont = 0;

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		System.out.print("Digite a letra: ");
		String letra = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)) {
				cont++;
			}
		}
		System.out.print(cont);
	}

}
