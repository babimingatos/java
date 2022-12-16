package lista06_fatec;

import java.util.Scanner;

public class MaiorMedia22 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		double maior = Integer.MIN_VALUE;
		double valor = 0.0;
		double media = 0.0;
		double soma=0.0;
		for (int i = 1; i <= 2; i++) {
			System.out.print("Digite o pre�o dos produtos: ");
			valor = sc.nextInt();
			soma+=valor;
			media = soma / 2;

			if (valor > maior) {
				maior = valor;
			}
		}
		System.out.print("Maior: " + maior + "\nM�dia: " + media);
	}
	//Barbara Mingatos

}
