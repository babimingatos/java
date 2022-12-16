package lista07_fatec;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();

		boolean sim = true;

		String fraseN = "";
		char a = 0;

		for (int i = 0; i < palavra.length(); i++) {
			a = palavra.charAt(i);
			fraseN = a + fraseN;

			if (fraseN.charAt(i) == palavra.charAt(i)) {
				sim = true;
			} else {
				sim = false;
			}
		}
		if (sim == true) {
			System.out.print("Sim");
		} else {
			System.out.print("Não");
		}
	}

}
