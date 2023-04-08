package lista3;

import java.util.Scanner;

public class Ex_04 {

	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a 1 nota: ");
		double um = sc.nextInt();

		System.out.print("Digite a 2 nota: ");
		double dois = sc.nextInt();

		System.out.print("Digite a 3 nota: ");
		double tres = sc.nextInt();

		if (um < 0 || um > 10) {
			um = 0;
		} else if (dois < 0 || dois > 10) {
			dois = 0;
		} else if (tres < 0 || tres > 10) {
			tres = 0;
		}
		double maior = Math.max(Math.max(um, dois), tres);
		double menor = Math.min(Math.min(um, dois), tres);
		double aritmetica = (um + dois + tres) / 3;

		System.out.print("\nMédia maiores: " + notas(um, dois, tres) + "\nMédia aritmética: " + aritmetica
				+ "\nMaior nota: " + maior + "\nMenor nota: " + menor);
	}

	static double notas(double um, double dois, double tres) {
		double maior = 0, meio = 0, menor = 0;

		if (um > dois && um > tres) {
			maior = um;
			if (dois > tres) {
				meio = dois;
				menor = tres;
			} else {
				meio = tres;
				menor = dois;
			}
		} else if (dois > um && dois > tres) {
			maior = dois;
			if (um > tres) {
				meio = um;
				menor = tres;
			} else {
				meio = tres;
				menor = um;
			}
		} else {
			maior = tres;
			if (um > dois) {
				meio = um;
				menor = dois;
			} else {
				meio = dois;
				menor = um;
			}

		}
		return (maior + meio) / 2;
	}
}
