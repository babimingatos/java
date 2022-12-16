package lista07_fatec;

import java.util.Scanner;

public class Ex_29 {

	public static void main(String[] args) {
		//Barbara Mingatos
		Scanner scStr = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		String saida = "";
		String zenit = "zenitpolarZENITPOLAR";
		String polar = "polarzenitPOLARZENIT";
		boolean achei = false;
		int escolha = 0;

		do {
			System.out.print("1- Criptografar \n2- Descriptografar \n3- Sair \n");
			escolha = sc.nextInt();
			if (escolha == 3) {
				System.out.print("Fim");
			} else {
				System.out.print("Entre com uma frase: ");
				String frase = scStr.nextLine();

				switch (escolha) {
				case 1:

					for (int f = 0; f < frase.length(); f++) {

						achei = false;

						for (int z = 0; z < zenit.length(); z++) {

							if (frase.charAt(f) == zenit.charAt(z)) {

								saida += polar.charAt(z);
								achei = true;
							}
						}

						if (!achei) {

							saida += frase.charAt(f);
						}
					}

					System.out.println("Saida: " + saida);
					break;
				case 2:
					for (int f = 0; f < frase.length(); f++) {

						achei = false;

						for (int z = 0; z < zenit.length(); z++) {

							if (frase.charAt(f) == zenit.charAt(z)) {

								saida += polar.charAt(z);
								achei = true;
							}
						}

						if (!achei) {

							saida += frase.charAt(f);
						}
					}

					System.out.println("Saida: " + saida);

					break;
				}

			}
		} while (escolha != 3);

	}
}