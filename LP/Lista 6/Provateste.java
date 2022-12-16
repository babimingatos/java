package lista06_fatec;

import java.util.Scanner;

public class Provateste {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o exercício: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {
		case 1:
			System.out.print("Digite o valor da conta: ");
			double valor = sc.nextInt();

			System.out.print("Digite a quantidade de pessoas: ");
			int qtd = sc.nextInt();

			System.out.print("Gorgeta de 10%? 1-Sim 2-Não: ");
			double gorjeta = sc.nextInt();

			if (gorjeta == 1) {
				gorjeta = (valor * 0.10) + valor;
				valor = gorjeta;
			} else if (gorjeta == 2) {
				gorjeta = valor;
			}

			double divisao = valor / qtd;

			System.out.print("Valor da conta: " + valor + "\nQuantidade de pessoas: " + qtd
					+ "\nQuantidade a ser paga: " + gorjeta + "\nValor por pessoa: " + divisao);
			break;
		case 2:
			System.out.print("Digite a quantidade de termos: ");
			int termos = sc.nextInt();
			int num1 = 1;
			int num2 = 0;
			for (int i = termos; i >= 1; i--) {
				System.out.print(num2 + " ");
				System.out.print(num1 + " ");

				for (int j = 2; j < termos; j++) {
					num1 = num1 + num2;
					num2 = num1 - num2;
					System.out.print(num1 + " ");
				}

			}

		case 3:

			boolean primo = true;
			int cont = 0;
			int num = 0;

			do {

				System.out.print("\nType: ");
				num = sc.nextInt();
				int a = num;
				if (a < 0) {
					System.out.print("Invalid");
				}

				int[] numPri = new int[num];

				for (int i = 2; cont < num; i++) {
					for (int j = 2; j < i; j++) {
						if (i % j == 0) {
							primo = false;
						}
					}
					if (primo == true) {
						numPri[cont] = i;
						cont++;
					}
					primo = true;
				}
				for (int i = numPri.length - 1; i >= 0; i--) {
					System.out.print(" " + numPri[i]);
				}
				cont = 0;
			} while (num != 0 || num < 0);
			System.out.print("End");
			break;
		case 4:
			System.out.print("Digite a sua idade (H): ");
			int ih1 = sc.nextInt();

			System.out.print("Digite a sua idade (H): ");
			int ih2 = sc.nextInt();

			System.out.print("Digite a sua idade (M): ");
			int im1 = sc.nextInt();

			System.out.print("Digite a sua idade (M): ");
			int im2 = sc.nextInt();

			int mNova = 0;
			int mVelha = 0;
			int hNovo = 0;
			int hVelho = 0;
			// Mulher
			if (im2 > im1) {
				mVelha = im2;
				mNova = im1;
			} else if (im1 > im2) {
				mVelha = im1;
				mNova = im2;
			} else if (im2 == im1) {
				System.out.print("Mulheres de idade iguais. ");
			}

			// Homem
			if (ih1 > ih2) {
				hVelho = ih1;
				hNovo = ih2;
			} else if (ih2 > ih1) {
				hVelho = ih2;
				hNovo = ih1;
			} else if (ih2 == ih1) {
				System.out.print("Homens de idade iguais. ");
			}

			int soma = hVelho + mNova;
			int produto = hNovo * mVelha;

			System.out.print("Soma: " + soma + "\nProduto: " + produto);

			break;

		case 5:
			System.out.print("Digite o valor do combustivel: ");
			double valor1 = sc.nextDouble();

			System.out.print("Digite a quantidade em litros: ");
			double litros = sc.nextDouble();

			System.out.print("Digite o tipo de combustivel" + "\n1- Álcool" + "\n2- Gasolina" + "\n3-Diesel ");
			int escolha = sc.nextInt();
			double desconto = 0;

			switch (escolha) {
			case 1:
				if (litros >= 10 && litros <= 39.9) {
					desconto = (valor1 * 0.1);
					valor1 = valor1 - desconto;
					System.out.print(valor1);
				} else if (litros >= 40) {
					desconto = (valor1 * 0.187);
					valor1 = valor1 - desconto;
					System.out.print(valor1);
				} else {
					desconto = valor1;
					System.out.print(desconto);
				}
				break;
			case 2:
				if (litros >= 20) {
					desconto = (valor1 * 0.08) + valor1;
					System.out.print(desconto);
				} else if (valor1 >= 100) {
					desconto = (valor1 * 0.15) + valor1;
					System.out.print(desconto);
				} else {
					desconto = valor1;
					System.out.print(desconto);
				}
				break;
			case 3:
				if (litros >= 30) {
					desconto = (valor1 * 0.09) + valor1;
					System.out.print(desconto);
				} else if (valor1 >= 75) {
					desconto = (valor1 * 0.142) + valor1;
					System.out.print(desconto);
				} else {
					desconto = valor1;
					System.out.print(desconto);
				}
				break;
			case 4:

				int numeroAtual = 1;
				int numeroAnterior = 0;
				int quantTermos = 0;

				do {
					numeroAtual = 1;
					numeroAnterior = 0;
					quantTermos = 0;

					do {
						System.out.print("Digite a quantidade de termos: ");
						quantTermos = sc.nextInt();
					} while (quantTermos < 0);

					int[] numeros = new int[quantTermos];

					if (quantTermos == 1) {
						System.out.print("0");
					} else {
						int aux = 0;
						for (int i = 0; i < quantTermos; i++) {
							if (i == 0) {
								numeros[i] = 0;
							} else {
								numeros[i] = numeroAnterior + numeroAtual;
								aux = numeroAtual;
								numeroAtual = numeroAnterior + numeroAtual;
								numeroAtual = aux;
							}
						}
						for (int i = quantTermos - 1; i >= 0; i--) {
							System.out.print(numeros[i] + " ");
						}
						System.out.print("\n");
					}

				} while (quantTermos != 0);
				

			}
		}
	}

}