package lista07_fatec;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma sequência numérica: ");
		String num = sc.nextLine();
		
		boolean sim = false;
		
		for (int i = 0; i < num.length(); i++) {
			if (num.length() == 8) {
				if (num.charAt(i) != 1 && num.charAt(i) != 0) {
					sim = true;
				} else {
					sim = false;
				}
			} else {
				sim = false;
			}
		}
		if (sim == true) {
			System.out.print("É");
		} else {
			System.out.print("Não é 8 bits");
		}
	}

}
