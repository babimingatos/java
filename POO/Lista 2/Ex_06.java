package lista2;

import java.util.Scanner;

public class Ex_06 {
// Barbara Mingatos

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String dig;
		
		boolean r;
		int num = 0;
		int menor = Integer.MAX_VALUE;

		do {
			System.out.print("Entre com o n�mero: ");
			num = sc.nextInt();
			menor = menor(num, menor);

			System.out.print("Deseja digitar outro n�mero S/N?: ");
			dig = sc.next();

			r = dig.equalsIgnoreCase("s");
		} while (r);

		System.out.println("Menor n�mero: " + menor);
	}

	static int menor(int num, int menorr) {
		if (num < menorr) {
			return num;
		}

		return menorr;
	}
}
