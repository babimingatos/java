package lista08_fatec;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");
		int elementos = sc.nextInt();
		int[] vetor = new int[elementos];

		if (elementos <= 20 && elementos > 1) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.print("Digite os números: ");
				vetor[i] = sc.nextInt();

			}
			for (int i = 0; i < vetor.length; i++) {
				System.out.print(vetor[i] + " ");
			}

		} else {
			System.out.print("Digite uma outra quantidade de elementos: ");
			elementos = sc.nextInt();
		}
	}

}
