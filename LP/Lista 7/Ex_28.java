package lista07_fatec;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		// Barbara Mingatos
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		int com = 0;
		int fim = frase.length() - 1;
		String dobre = "";

		while (com < fim) {
			dobre += frase.charAt(com);
			com++;
			if (com <= fim) {
				dobre += frase.charAt(fim);
				fim--;
			}
		}
		System.out.println(dobre);
	}

}
