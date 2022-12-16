package lista07_fatec;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		boolean ok = true;
		boolean minuscula = false;
		boolean maiuscula = false;

		do {
			System.out.print("Digite uma senha: ");
			String senha = sc.nextLine();

			int tam = senha.length(), qtdLetras = 0, qtdNumeros = 0, qtdSimbolos = 0;

			for (int varrendo = 0; varrendo < senha.length(); varrendo++) {

				for (int letras = 65; letras < 91; letras++) {

					if (senha.charAt(varrendo) == (char) letras) {
						qtdLetras++;
						maiuscula = true;

					} else if (senha.charAt(varrendo) == (char) (letras + 32)) {
						qtdLetras++;
						minuscula = true;

					} else if (letras < 75 && senha.charAt(varrendo) == (char) (letras - 17)) {
						qtdNumeros++;

					} else if ((letras < 76 && senha.charAt(varrendo) == (char) (letras - 32) && (letras - 32) != 34
							&& (letras - 32) != 39) || (senha.charAt(varrendo) == (char) 64 && letras == 65)) {
						qtdSimbolos++;
					}

				}
			}
			
//			System.out.print("Tamanho 10:\t" + tam + (tam < 10 ? " (x)" : " (ok)") + "\nLetras 3:\t" + qtdLetras
//					+ (qtdLetras < 3 ? " (x)" : " (ok)") + "\nNumeros 3:\t" + qtdNumeros
//					+ (qtdNumeros < 3 ? " (x)" : " (ok)") + "\nSimbolos 2:\t" + qtdSimbolos
//					+ (qtdSimbolos < 2 ? " (x)" : " (ok)") + "\n\n");
			if (qtdNumeros < 3 || qtdSimbolos < 2 || qtdLetras < 3 || senha.length() < 10 || !minuscula || !maiuscula) {
				ok = false;
			}
		} while (!ok);
		System.out.print("Ok! Senha ok!");
	}

}
