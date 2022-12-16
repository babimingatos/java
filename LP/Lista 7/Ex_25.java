package lista07_fatec;

import java.util.Scanner;

public class Ex_25 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		boolean ok = false;
		do {
			System.out.print("Digite: ");
			String senha = sc.nextLine();
			
			int contMa = 0;
			int contLetras = 0;
			int cont = 0;
			int contSimb = 0;
			String simb = "!@#$%&*()+";
			
			for (int i = 0; i < senha.length(); i++) {
				if (senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
					contLetras++;
				}
				if (senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z') {
					contMa++;
					contLetras++;
				}
				if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
					cont++;
				}
				for (int j = 0; j < simb.length(); j++) {
					if (senha.charAt(i) == simb.charAt(j)) {
						contSimb++;
					}
				}
			}
			if (senha.length() >= 10) {
				if (contMa >= 3 && contLetras >= 3 && cont >= 3 && contSimb >= 2) {
					System.out.println("Ok");
					ok = true;
				} else {
					System.out.println("Senha fraca");
				}
			} else {
				System.out.println("Mais de 10 caracteres! ");
			}
		} while (!ok);
		
	}

}
