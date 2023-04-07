package lista2;

import java.util.Scanner;

public class Ex_08 {
// Barbara Mingatos

	static int[] cont = new int[6];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dig;
		boolean r;
		dado();

		do {
			System.out.println("1: " + cont[0] + "\n2: " + cont[1] + "\n3: " + cont[2] + "\n4: " + cont[3] + "\n5: "
					+ cont[4] + "\n6: " + cont[5]);
			System.out.println(" " + porcento(cont));

			System.out.print("\nJogar o dado novamente (S/N)? ");
			dig = sc.next();
			r = dig.equalsIgnoreCase("s");
		} while (r);
	}

	static void dado() {
		for (int i = 0; i < 1000000; i++) {
			int num = (int) (Math.random() * 6);
			cont[num]++;
		}
	}

	static String porcento(int[] cont) {
		String r = "";
		for (int i = 0; i < cont.length; i++) {
			int porcentagem = (cont[i] * 100) / 1000000;
			r += (i + 1) + ": " + porcentagem + "%  ";
		}
		return r;
	}
}