package lista07_fatec;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine();
		String sobrenome = "";

		for (int i = nome.length() - 1; nome.charAt(i) != ' '; i--) {
			sobrenome += nome.charAt(i);
		}
		for (int i = sobrenome.length() - 1; i >= 0; i--) {
			System.out.print(sobrenome.charAt(i));
		}

	}

}
