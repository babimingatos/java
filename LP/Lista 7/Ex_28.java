package lista07_fatec;

import java.util.Scanner;

public class Ex_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		int com = 0, fim = frase.length() - 1;
		String dobrada = "";
		while (com < fim) {
			dobrada += frase.charAt(com);
			com++;
			if (com <= fim) {
				dobrada += frase.charAt(fim);
				fim--;
			}
		}
		System.out.println(dobrada);
	}

}
