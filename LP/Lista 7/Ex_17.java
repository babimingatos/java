package lista07_fatec;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase1 = sc.nextLine();

		System.out.print("Digite outra: ");
		String frase2 = sc.nextLine();
		boolean t = true;
		for (int fraseU = 0; fraseU < frase1.length(); fraseU++) {
			for (int fraseD = 0; fraseD < frase2.length(); fraseD++) {
				if (frase1.charAt(fraseU) == frase2.charAt(fraseD)) {
					t = true;
				} else {
					t = false;
				}
			}
		}
		if (t == true) {
			System.out.print("Frase igual");
		} else {
			System.out.print("Diferente");
		}
	}

}
