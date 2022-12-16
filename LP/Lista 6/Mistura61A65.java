package lista06_fatec;

import java.util.Scanner;

public class Mistura61A65 {

	public static void main(String args[]) {

		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o exercício: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 61:

			System.out.print("Digite a quantidade: ");
			int qtd = sc.nextInt();

			int cima = 2;
			int baixo = 1;
			double soma = 0;
			for (int i = 1; i <= qtd; i++) {
				System.out.print(cima + "/" + baixo);
				System.out.print(" ");
				soma += (double) cima / baixo;
				cima += 2;
				baixo += 2;
			}
			System.out.print("\nSoma: " + soma);
			break;

		case 62:
			System.out.print("Digite a quantidade: ");
			qtd = sc.nextInt();
			cima = 2;
			baixo = 1;
			soma = 0;
			for (int i = 1; i <= qtd; i++) {
				if (i % 2 != 0) {
					soma += (double) cima / baixo;
					System.out.print(cima + "/" + baixo);
					System.out.print(" ");
				} else {
					soma -= (double) cima / baixo;
					System.out.print("- " + cima + "/" + baixo);
					System.out.print(" ");
				}
				cima += 2;
				baixo += 2;
			}
			System.out.print("\nSoma: " + soma);

			break;

		case 63:
			System.out.print("Digite a quantidade:");
			qtd = sc.nextInt();
			int num1 = 1;
			int num0 = 0;
			int primo = 1;
			boolean boolpr = false;
			int temp = 0;
			soma = 0.5;

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

			break;

		case 64:
			System.out.print("Quantidade de termos: ");
			qtd = sc.nextInt();
			cima = 0;
			baixo = 0;
			soma = 0;
			int num2 = 0;
			num1 = 1;
			int fib;
			int num = 0;
			int div = 0;
			int aux = 2;
			boolean valor = false;

			for (int i = 1; i <= qtd; i++) {
				cima = num2;
				fib = num2 + num1;
				num2 = num1;
				num1 = fib;
				valor = false;
				for (int j = aux; !valor; j++) {
					num = j;
					div = 0;
					for (int k = 1; k <= num; k++) {
						if (num % k == 0) {
							div++;
							aux = j + 1;
						}
					}
					if (div == 2) {
						baixo = num;
						valor = true;
					}
				}
				if (i % 2 != 0) {
					soma += (double) cima / baixo;
				} else {
					soma -= (double) cima / baixo;
				}
			}
			System.out.printf("\nSoma: " + soma);
			break;

		case 65:
			System.out.print("Digite a quantidade: ");
			qtd = sc.nextInt();
			cima = 0;
			baixo = 0;
			soma = 0;
			int fato = 1;
			int cont = 1;
			num = 0;
			div = 0;
			aux = 2;
			valor = false;
			for (int i = 1; i <= qtd; i++) {
				while (cont <= i) {
					fato *= i;
					cont++;
				}
				cima = fato;
				valor = false;
				for (int j = aux; !valor; j++) {
					num = j;
					div = 0;
					for (int k = 1; k <= num; k++) {
						if (num % k == 0) {
							div++;
							aux = j + 1;
						}
					}
					if (div == 2) {
						baixo = num;
						valor = true;
					}
				}
				if (i % 2 != 0) {
					soma += (double) cima / baixo;
				} else {
					soma -= (double) cima / baixo;
				}
			}
			System.out.print("Soma: " + soma);

			break;
		}
	}
}
