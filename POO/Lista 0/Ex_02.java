package lista0;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		int[][] array = new int[6][3];

		System.out.print("Original");
		int i, j = 0;
		for (i = 0; i < 6; i++) {
			System.out.println();

			for (j = 0; j < 3; j++) {
				array[i][j] = (int) (Math.random() * 8);
				System.out.print(array[i][j] + " ");
			}
		}

		System.out.print("\n\nInvertida");
		for (int l = array.length - 1; l >= 0; l--) {
			System.out.println();
			for (int m = array[l].length - 1; m >= 0; m--) {
				System.out.print(" " + array[l][m]);
			}
		}
	}

}

