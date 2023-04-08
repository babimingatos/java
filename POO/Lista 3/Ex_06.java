package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_06 {

	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int um = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int dois = sc.nextInt();

		int[] primos = encontrar(um, dois);

		System.out.println("Primos entre " + um + " e " + dois + ": ");

		for (int primo : primos) {
			System.out.print(primo + " ");
		}
	}

	static int[] encontrar(int um, int dois) {
		if (um > dois) {
			int temp = um;
			um = dois;
			dois = temp;
		}

		ArrayList<Integer> primos = new ArrayList<Integer>();
		for (int i = um; i <= dois; i++) {
			if (ePrimo(i)) {
				primos.add(i);
			}
		}

		int[] resultado = new int[primos.size()];
		for (int i = 0; i < primos.size(); i++) {
			resultado[i] = primos.get(i);
		}
		return resultado;
	}

	static boolean ePrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
