package lista07_fatec;

import java.util.Scanner;

public class Ex_32 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner scs = new Scanner(System.in);

		System.out.print("Digite: ");
		String frase = scs.nextLine();

		String aux = new String();

		String[] an = frase.split(" ");

		System.out.print("Quantidade: " + an.length + "\nOriginal: ");
		for (int i = 0; i < an.length; i++) {
			System.out.print(" " + an[i] + " " + ((i == an.length - 1) ? "" : ","));
		}
		for (int i = 0; i < an.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((int) an[j].toUpperCase().charAt(0) > (int) an[i].toUpperCase().charAt(0)) {
					aux = an[j];
					an[j] = an[i];
					an[i] = aux;
				}
			}
		}
		System.out.print("\nOrdenado: ");
		for (int i = 0; i < an.length; i++) {
			System.out.print(" " + an[i] + " " + ((i == an.length - 1) ? "" : ","));
		}
	}

}
