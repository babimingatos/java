package lista08_fatec;

import java.util.Scanner;

public class Ex_30 {

	public static void main(String[] args) {
//Barbara Mingatos
		Scanner sc = new Scanner(System.in);

		int tamanho = 0;
		double aux;

		System.out.print("Elementos: ");
		tamanho = sc.nextInt();

		double ak[] = new double[tamanho];

		for (int i = 0; i < ak.length; i++) {

			System.out.print("Vetor AK[" + i + "]: ");
			ak[i] = sc.nextDouble();
		}

		for (int j = 0; j < ak.length - 1; j++) {
			for (int i = 0; i < ak.length - 1 - j; i++) {
				if (ak[i] > ak[i + 1]) {
					aux = ak[i];
					ak[i] = ak[i + 1];
					ak[i + 1] = aux;
				}
			}
		}

		System.out.print("\n\nOrdenado: ");
		for (int i = 0; i < ak.length; i++) {
			System.out.print(ak[i] + " ");
		}

		double[] al = new double[tamanho * 2 - 1];

		for (int i = 0, j = 0; i < al.length; i += 2, j++) {
			al[i] = ak[j];
			if (i > 0) {
				al[i - 1] = (al[i] + al[i - 2]) / 2;
			}
		}

		System.out.print("\n\nVetor com medias: ");
		for (int i = 0; i < al.length; i++) {
			System.out.print(al[i] + " ");
		}
	}
}
