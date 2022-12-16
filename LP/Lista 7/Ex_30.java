package lista07_fatec;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String args[]) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		String saida = "";

		int escolha = 0;
		do {
			System.out.print("1- Criptografar \n2- Descriptografar \n3- Sair \n");
			escolha = sc.nextInt();

			if (escolha == 3) {
				System.out.print("Fim");
			} else {
				System.out.print("Digite uma frase: ");
				String frase = scStr.nextLine().toLowerCase();

				switch (escolha) {
				case 1:
					for (int i = 0; i < frase.length(); i++) {
						if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'm') {
							saida += (char) (frase.charAt(i) + 13);
						} else {
							if (frase.charAt(i) >= 'n' && frase.charAt(i) <= 'z') {
								saida += (char) (frase.charAt(i) - 13);
							} else {
								saida += frase.charAt(i);
							}
						}
					}
					System.out.println("Saida: " + saida);
					break;

				case 2:
					for (int i = 0; i < frase.length(); i++) {
						if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'm') {
							saida += (char) (frase.charAt(i) + 13);
						} else {
							if (frase.charAt(i) >= 'n' && frase.charAt(i) <= 'z') {
								saida += (char) (frase.charAt(i) - 13);
							} else {

								saida += frase.charAt(i);
							}
						}
					}

					System.out.println(saida);
					break;

				case 3:
					break;
				}
			}
		} while (escolha != 3);

	}

}
