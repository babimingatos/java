package lista06_fatec;

import java.util.Scanner;

public class Um61 {

	public static void main(String[] args) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade:");
		int qtd = sc.nextInt();
		int num1 = 1;
		int num0 = 0;
		int primo = 1;
		boolean boolpr = false;
		int temp = 0;
		Double soma = 0.5;
		
		for (int i = 0; i < qtd; i++) {
			if (i != 0) {
				temp = num1;
				num1 += num0;
				num0 = temp;
				for (int j = primo + 1; true; j++) {
					for (int k = 2; k < j; k++) {
						if (j % k == 0) {
							boolpr = false;
						}
					}
					if (boolpr == true) {
						primo = j;
						soma += (double) (num1) / (double) primo;
						break;
					} else {
						boolpr = true;
					}
				}
			}
		}
		System.out.print("\nSoma" + soma);

	}

}
