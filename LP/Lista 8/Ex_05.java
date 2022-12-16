package lista08_fatec;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão do vetor: ");
		int tam = sc.nextInt();
		int[] vetor = new int[tam];
		int[] a = new int[tam];
		int[] b = new int[tam];

		int soma = 0;
		if (tam > 0 && tam <= 15) {

			for (int i = 0; i < tam; i++) {

				System.out.print("Digite um valor: ");
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < tam; i++) {
				System.out.print("Digite um valor: ");
				b[i] = sc.nextInt();
			}

			for (int i = 0; i < tam; i++) {
				vetor[i] = a[i] + b[i];
				System.out.print("\nValores: " + vetor[i]);
				soma += vetor[i];
			}
			for (int i = 0; i < 1; i++) {

				System.out.print("\nSoma: " + soma);
			}
		} else {

			System.out.print("Digite uma nova dimensão: ");
			tam = sc.nextInt();
		}
	}

}
