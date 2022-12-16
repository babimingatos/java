package lista06_fatec;

import java.util.Scanner;

public class SemMercadoria19 {

	public static void main(String args[]) {

		/*
		 * O mesmo exerc�cio anterior, mas agora n�o ser� informado o n�mero de
		 * mercadorias em estoque. Ent�o o funcionamento dever� ser da seguinte forma:
		 * ler o valor da mercadoria e perguntar �MAIS MERCADORIAS (S/N)?�. Ao final,
		 * imprimir o valor total em estoque e a m�dia de valo r das mercadorias em
		 * estoque.
		 */

		Scanner sc = new Scanner(System.in);

		double valor = 0;
		int qtd = 0;
		char snc;
		String sn;
		double media = 0;

		do {
			System.out.print("Informe o valor da mercadoria: ");
			valor += sc.nextDouble();
			qtd++;

			System.out.print("Mais alguma mercadoria? S ou N");
			sn = sc.next();
			snc = sn.charAt(0);

			if (snc == 'S' || snc == 'N') {
				media = valor / qtd;
			} else {
				System.out.print("Somente S ou N: ");
				sn = sc.next();
				snc = sn.charAt(0);
			}

		} while (snc == 'S');

		System.out.println("M�dia: " + media);
		/* Barbara Mingatos */
	}

}
