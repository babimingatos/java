package lista08_fatec;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		//Barbara Mingatos
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite  números: ");
			num[i] = sc.nextInt();
		}
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

}
