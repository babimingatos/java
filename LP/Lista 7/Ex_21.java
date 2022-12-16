package lista07_fatec;

import java.util.Scanner;

public class Ex_21 {
	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		int cort = frase.split(" ").length;
		String imp[] = new String[cort];
		imp = frase.split(" ");
		for (int i = 0; i <= cort - 1; i++) {
			System.out.println(imp[i]);
		}

	}

}
