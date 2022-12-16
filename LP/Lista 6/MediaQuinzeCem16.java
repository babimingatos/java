package lista06_fatec;

public class MediaQuinzeCem16 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java que calcule e escreva a média aritmética dos
		 * números inteiros entr e 15 (inclusive) e 100 (inclusive).
		 */
		double soma = 0;
		double media = 0;
		double qtd = 0;

		for (double i = 15; i <= 100; i++) {
			soma += i;
			qtd++;
		}

		media = soma / qtd;

		System.out.print(media);
		/* Barbara Mingatos */
	}

}
