package lista07_fatec;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		char primc = 0;
		char segc = 0;
		StringBuilder frases = new StringBuilder();
		
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

		if (msm == false) {
			System.out.print("Tamanho diferente");
		} else {
			for (char a = 0; a < prim.length(); a++) {
				frases.append(prim.charAt(a));
				frases.append(seg.charAt(a));

			}
			System.out.println(frases);
		}

	}

}
