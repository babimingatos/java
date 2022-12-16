package lista07_fatec;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {
		//Barbara Mingatos
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		int cont = 0;

		String[] var = frase.split(" ");

		for (int i = 0; i <= var.length; i++) {
			cont++;
		}

		System.out.println(cont - 1);
	}

}
