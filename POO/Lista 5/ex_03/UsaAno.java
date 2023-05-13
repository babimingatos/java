package ex_03;

import java.util.Scanner;

public class UsaAno {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ano bissexto = new Ano();

		System.out.print("Digite um ano: ");
		bissexto.setAno(sc.nextInt());
		
		System.out.print(bissexto.bissexto());
	}

}
