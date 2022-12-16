package lista06_fatec;

import java.util.Scanner;

public class CinquentaTermos39 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();

		if (valor < 0) {
			System.out.print("Valor maior que zero: ");
			valor = sc.nextInt();
		}

		for (int i = 1; i <= valor; i++) {

			if (i == 1) {
				System.out.print("0 ");
			}

			System.out.print(i + "/" + (valor + 1 - i) + " +");

		}
		/* Barbara Mingatos */
	}

}
