package lista06_fatec;

import java.util.Scanner;

public class Perfeito55A57 {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		
				// Barbara Mingatos
				/*55- Solicite um numero inteiro ao usuario e informe se o numero e perfeito ou nao.
				 *56- Imprima os numeros perfeitos da faixa de 1 a 900.
				 *57- Solicite ao usuário a quantidade de termos da sequência de numeros perfeitos e imprima o resultado.
				 */
		
		System.out.print("Digite o exercicio: ");
		int exercicio = ler.nextInt();

		int cont = 0;
		int qtd = 0;
		int soma = 0;

		switch (exercicio) {
		case 55:

			System.out.print("Digite um numero: ");
			int num = ler.nextInt();
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					soma += i;
				}
			}
			if (num == soma) {
				System.out.print("É perfeito");
			} else {
				System.out.print("Não é perfeito.");
			}
			break;

		case 56:
			for (int i = 1; i <= 900; i++) {
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) {
						soma += j;
					}
				}
				if (i == soma) {
					System.out.print(i + " ");
				}
				soma = 0;
			}
			break;
			
		case 57:
			System.out.print("Digite a quantidade de termos: ");
			qtd = ler.nextInt();
			for (int i = 1; cont < qtd; i++) {
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) {
						soma += j;
					}
				}
				if (i == soma) {
					System.out.print(i + " ");
					cont++;
				}
				soma = 0;
			}
			break;

		}
	}

}
