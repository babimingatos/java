package lista07_fatec;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
//Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();

		System.out.print("Digite uma letra: ");
		String letra = sc.nextLine();

		frase = frase.replace(letra.charAt(0), '*');

		System.out.print(frase);
	}

}
