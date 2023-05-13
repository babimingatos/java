package ex_04;

import java.util.Scanner;

//Barbara Mingatos
public class UsaNumero {

	public static void main(String[] args) {
		Numero inverte = new Numero();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		inverte.setNumero(sc.nextInt());

		System.out.print(inverte.inverte());
	}

}
