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
			System.out.print("Digite a quantidade de termos: ");
			int qtd = sc.nextInt();
			double soma = 0;
			for (int i = 0; i < qtd; i += 2) {
				System.out.printf("%d/%d ", i + 2, i + 1);

				if (i < 2 * (qtd - 1)) {
					System.out.printf("+ ", i + 2, i + 1);
				}
				soma += (double) (i + 2) / (double) (i + 1);
			}
			System.out.print("\nSoma: " + soma);

			break;

		case 62:
			System.out.print("Digite a quantidade de termos: ");
			int qtd4 = sc.nextInt();
			double soma1 = 0;

			for (int i = 0; i < qtd4 * 2; i += 2) {
				System.out.printf("%d/%d ", i + 2, i + 1);
				if (i < 2 * (qtd4 - 1)) {
					if (i % 4 == 0) {
						// System.out.printf("- ", i + 2, i + 1);
						soma1 += (double) (i + 2) / (double) (i + 1);
					} else {
						System.out.printf("+ ", i + 2, i + 1);
						soma1 -= (double) (i + 2) / (double) (i + 1);
					}
				} else {
					if (i % 2 == 0) {
						soma1 += (double) (i + 2) / (double) (i + 1);
					} else {
						soma1 -= (double) (i + 2) / (double) (i + 1);
					}
				}
			}
			System.out.print("\nSoma" + soma1);

			break;

		case 63:

			Scanner ler = new Scanner(System.in);
			System.out.print("Digite a quantidade de termos impressos: ");
			int quantidadeTermos = ler.nextInt(), numeroAnterior = 1, numeroRetrasado = 0, auxiliar = 0,
					numeroPrimo = 1;
			boolean ePrimo = false;
			double somaa = 0.5;
			for (int i = 0; i < quantidadeTermos; i++) {
				if (i == 0) {
					System.out.print(numeroAnterior + "/" + 2 + " + ");
				} else {
					System.out.print(numeroAnterior + numeroRetrasado);
					auxiliar = numeroAnterior;
					numeroAnterior += numeroRetrasado;
					numeroRetrasado = auxiliar;
					for (int j = numeroPrimo + 1; true; j++) {
						for (int k = 2; k < j; k++) {
							if (j % k == 0) {
								ePrimo = false;
							}
						}
						if (ePrimo == true) {
							numeroPrimo = j;
							somaa += (double) (numeroAnterior) / (double) numeroPrimo;
							System.out.printf("/" + numeroPrimo + ((i < quantidadeTermos - 1) ? " + " : ""));
							break;
						} else {
							ePrimo = true;
						}
					}
				}
			}
			System.out.print("\nA soma dos termos impressos e " + somaa);

			break;

		case 64:
			System.out.print("Quantidade de termos da sequência: ");
			qtd = sc.nextInt();
			sc.close();
			int numerador = 0, denominador = 0;
			soma = 0;
			int num2 = 0, num1 = 1, fibonacci;
			int num = 0, div = 0, aux1 = 2;
			boolean valor = false;
			for (int i = 1; i <= qtd; i++) {
				numerador = num2;
				fibonacci = num2 + num1;
				num2 = num1;
				num1 = fibonacci;
				valor = false;
				for (int j = aux1; !valor; j++) {
					num = j;
					div = 0;
					for (int k = 1; k <= num; k++) {
						if (num % k == 0) {
							div++;
							aux1 = j + 1;
						}
					}
					if (div == 2) {
						denominador = num;
						valor = true;
					}
				}
				if (i % 2 != 0) {
					soma += (double) numerador / denominador;
					System.out.print(numerador + "/" + denominador + " ");
				} else {
					soma -= (double) numerador / denominador;
					System.out.print("-" + numerador + "/" + denominador + " ");
				}
			}
			System.out.printf("\nSoma:  %.3f\n", soma);
			break;

		case 65:
			System.out.print("Digite a quantidade de termos da sequência: ");
			qtd = sc.nextInt();
			sc.close();
			numerador = 0;
			denominador = 0;
			soma = 0;

			int fato = 1, cont = 1;

			num = 0;
			div = 0;
			int aux = 2;
			boolean evalor = false;
			for (int i = 1; i <= qtd; i++) {
				while (cont <= i) {
					fato *= i;
					cont++;
				}
				numerador = fato;
				evalor = false;
				for (int j = aux; !evalor; j++) {
					num = j;
					div = 0;
					for (int k = 1; k <= num; k++) {
						if (num % k == 0) {
							div++;
							auxiliar = j + 1;
						}
					}
					if (div == 2) {
						denominador = num;
						evalor = true;
					}
				}
				if (i % 2 != 0) {
					soma += (double) numerador / denominador;
					System.out.print(numerador + "/" + denominador + " ");
				} else {
					soma -= (double) numerador / denominador;
					System.out.print("-" + numerador + "/" + denominador + " ");
				}
			}
			System.out.printf("\nO valor final da sequência é %.3f\n", soma);

			break;
		}
	}
}
