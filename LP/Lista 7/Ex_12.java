package lista07_fatec;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toUpperCase();

		int contA = 0;
		int contE = 0;
		int contI = 0;
		int contO = 0;
		int contU = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == 'A') {
				contA++;
			}
			if (frase.charAt(i) == 'E') {
				contE++;
			}
			if (frase.charAt(i) == 'I') {
				contI++;
			}
			if (frase.charAt(i) == 'O') {
				contO++;
			}
			if (frase.charAt(i) == 'U') {
				contU++;
			}
		}
		System.out.print("A: "+contA+
						"\nE: "+contE+
						"\nI: "+contI+
						"\nO: "+contO+
						"\nU: "+contU);
	}

}
