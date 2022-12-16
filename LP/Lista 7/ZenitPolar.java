package lista07_fatec;

import java.util.Scanner;

public class ZenitPolar {

	public static void main(String args[]) {

		Scanner scStr = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = scStr.nextLine();
		String saida = "";
		// Z E N I T
		// P O L A R

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'z') {

				saida += 'p';

			} else {

				if (frase.charAt(i) == 'e') {

					saida += 'o';

				} else {

					if (frase.charAt(i) == 'n') {

						saida += 'l';

					} else {

						if (frase.charAt(i) == 'i') {

							saida += 'a';

						} else {

							if (frase.charAt(i) == 't') {

								saida += 'r';

							} else {

								if (frase.charAt(i) == 'p') {

									saida += 'z';

								} else {

									if (frase.charAt(i) == 'o') {

										saida += 'e';

									} else {

										if (frase.charAt(i) == 'l') {

											saida += 'n';

										} else {

											if (frase.charAt(i) == 'a') {

												saida += 'i';

											} else {

												if (frase.charAt(i) == 'r') {

													saida += 't';

												} else {

													saida += frase.charAt(i);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println("Saida: " + saida);
	}
}
