package lista07_fatec;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		// Barbara Mingatos
		Scanner scStr = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		String saida = "";
		String p = "polarzenitPOLARZENIT";
		String z = "zenitpolarZENITPOLAR";

		boolean aq = false;
		int escolha = 0;

		do {
			System.out.print("\n1- Criptografar \n2- Descriptografar \n3- Sair: ");
			escolha = sc.nextInt();
			if (escolha == 3) {
				System.out.print("Fim");
			} else {
				System.out.print("Entre com uma frase: ");
				String frase = scStr.nextLine();

				switch (escolha) {

				case 1:
					for (int i = 0; i < frase.length(); i++) {
						aq = false;
						for (int j = 0; j < z.length(); j++) {
							if (frase.charAt(i) == z.charAt(j)) {
								saida += p.charAt(j);
								aq = true;
							}
						}
						if (!aq) {
							saida += frase.charAt(i);
						}
					}
					System.out.println("Saida: " + saida);
					break;

				case 2:
					for (int i = 0; i < frase.length(); i++) {
						aq = false;
						for (int j = 0; j < z.length(); j++) {
							if (frase.charAt(i) == z.charAt(j)) {
								saida += p.charAt(j);
								aq = true;
							}
						}

						if (!aq) {
							saida += frase.charAt(i);
						}
					}
					System.out.println("Saida: " + saida);
					break;
				}
			}
		} while (escolha != 3);

	}
}