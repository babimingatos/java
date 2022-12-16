package lista07_fatec;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		boolean mai = true;
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
				mai = false;
			}
		}
		if (mai == false) {
			System.out.print("Não maiúsculas");
		} else {
			System.out.print("Maiúsculas");
		}
	}

}
