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
				String frase = scStr.nextLine();

				switch (escolha) {
				case 1:
					for (int f = 0; f < frase.length(); f++) {

						if (frase.toLowerCase().charAt(f) >= 'a' && frase.toLowerCase().charAt(f) <= 'm') {

							saida += (char) (frase.charAt(f) + 13);

						} else {

							if (frase.toLowerCase().charAt(f) >= 'n' && frase.toLowerCase().charAt(f) <= 'z') {

								saida += (char) (frase.charAt(f) - 13);

							} else {

								saida += frase.charAt(f);
							}
						}
					}

					System.out.println("Saida: " + saida);
					break;

				case 2:
					for (int f = 0; f < frase.length(); f++) {

						if (frase.toLowerCase().charAt(f) >= 'a' && frase.toLowerCase().charAt(f) <= 'm') {

							saida += (char) (frase.charAt(f) + 13);

						} else {

							if (frase.toLowerCase().charAt(f) >= 'n' && frase.toLowerCase().charAt(f) <= 'z') {

								saida += (char) (frase.charAt(f) - 13);

							} else {

								saida += frase.charAt(f);
							}
						}
					}

					System.out.println("Saida: " + saida);
					break;

				case 3:
					break;
				}
			}
		} while (escolha != 3);

	}

}
