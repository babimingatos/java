package lista06_fatec;

import java.util.Scanner;

public class MediaN10 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler 10 valores, calcular e escrever a média
		 * aritmética desses valores lidos
		 */
		
		double media = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite alguns números: ");
			double num = sc.nextDouble();
			media += num / 10;
		}
		
		System.out.print(media);
		/* Barbara Mingatos */
	}

}
