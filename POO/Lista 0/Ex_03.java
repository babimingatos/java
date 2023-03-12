package lista0;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a dimensão da matriz: ");
		int dim = sc.nextInt();

		int[][] array = new int[dim][dim];

		for (int i = 0; i < array.length; i++) {
			System.out.println();

			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) (Math.random() * 99);
				System.out.print(array[i][j] + " ");
			}
		}

	}

}
