package lista0;

import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int linha = sc.nextInt();

		System.out.print("Digite a quantidade de colunas: ");
		int coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];
		int maior = matriz[0][0];
		int menor = Integer.MAX_VALUE;
		int posMaiorl = 0;
		int posMenorl = 0;
		int posMaiorc = 0;
		int posMenorc = 0;

		for (int i = 0; i < linha; i++) {
			System.out.println();
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = (int) (Math.random() * 30);

				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					posMaiorl = i;
					posMaiorc = j;
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					posMenorl = i;
					posMenorc = j;
				}
				System.out.print(" " + matriz[i][j]);
			}
		}
		System.out.println("\nMaior: " + maior + " Posição [" + (posMaiorl + 1) + ", " + (posMaiorc + 1) + "]");
		System.out.println("Menor:: " + menor + " Posição: [" + (posMenorl + 1) + ", " + (posMenorc + 1) + "]");

	}

}
