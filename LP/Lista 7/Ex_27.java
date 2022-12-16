package lista07_fatec;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String prim = sc.nextLine();
		System.out.print("Digite outra: ");
		String seg = sc.nextLine();

		boolean msm = false;
		for (int i = 0; i < prim.length(); i++) {
			if (prim.length() != seg.length()) {
				msm = false;
			} else {
				msm = true;

			}
		}
		char primc = 0;
		char segc = 0;

		if (msm == false) {
			System.out.print("Tamanho diferente");
		} else {
			for (char a = 0; a < prim.length(); a++) {
				primc = (char) prim.charAt(a);
				segc = (char) seg.charAt(a);
				System.out.printf("%c%c", primc, segc);
			}

		}

	}

}
