package lista08_fatec;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de elementos: ");
		int elementos = sc.nextInt();
		int[] vet = new int[elementos];

		if (elementos <= 20) {

			for (int i = 0; i < vet.length; i++) {

				System.out.print("Digite os números: ");
				vet[i] = sc.nextInt();
			}
			
			for (int i = 0; i < vet.length; i++) {
				System.out.print(vet[i] + " ");
			}
			
		} else {
			System.out.print("Digite outro número: ");
			elementos = sc.nextInt();
			vet = new int[elementos];
		}
	}

}
