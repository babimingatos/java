package lista07_fatec;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma cadeia numérica: ");
		String num = sc.nextLine();

		int maior = 0;
		int cont = 0;
		int tam = num.length();
		
		for (int i = 0; i < num.length(); i++) {
			cont = 0;

			while ((i < tam) && (num.charAt(i) == '1')) {
				cont++;
				i++;
			}

			if (cont > maior) {
				maior = cont;
			}
		}
		
		System.out.print(maior);
	}

}
