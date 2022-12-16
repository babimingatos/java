package lista07_fatec;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner scs = new Scanner(System.in);

		System.out.print("Digite: ");
		String frase = scs.nextLine().toUpperCase();

		String aux = new String();

		String[] an = frase.split(" ");


		for (int i = 0; i < an.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((int) an[j].charAt(0) > (int) an[i].charAt(0)) {
					aux = an[j];
					an[j] = an[i];
					an[i] = aux;
				}
			}
		}
		System.out.print("\nOrdenado: ");
		for (int i = 0; i < an.length; i++) {
			System.out.print(" " + an[i] + " ");
			if (i == an.length - 1) {
				System.out.print("");
			} else {
				System.out.print("-");
			}
		}
		System.out.print("\nQuantidade: " + an.length);
	}

}
