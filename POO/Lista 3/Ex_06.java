package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_06 {
	// Barbara Mingatos

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		int[] primos = encontrarPrimos(num1, num2);
	
		for (int primo : primos) {
			System.out.print(primo + " ");
		}
	}

	static int[] encontrarPrimos(int num1, int num2) {
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		ArrayList<Integer> primos = new ArrayList<Integer>();
		
		for (int i = num1; i <= num2; i++) {
			if (primo(i)) {
				primos.add(i);
			}
		}

		int[] resultado = new int[primos.size()];
		for (int i = 0; i < primos.size(); i++) {
			resultado[i] = primos.get(i);
		}
		return resultado;
	}

	static boolean primo(int num) {
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