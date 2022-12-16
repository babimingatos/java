package lista04_fatec;

import java.util.Scanner;

public class Saudacao7 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado Saudacao.java. Implemen te um programa em Java que
		 * declare uma variável chamada hora. Essa variável deve armazenar a hora do
		 * dia. Esse programa deve exibir a mensagem Zzzzz se a hora estiver no
		 * intervalo [0, 6 ], Bom dia se a hora estiver no intervalo [7, 11], Boa tarde
		 * se a hora estiver no intervalo [12, 17] o u Boa noite se a hora estiver no
		 * intervalo [18, 23] . Dê a opção do usuário informar a hora manualmente o u
		 * gerar a hora aleatoriamente, sempre fazendo todas as validações necessárias.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora: ");
		int hora = sc.nextInt();

		if (hora >= 18 && hora <= 23) {
			System.out.println("Boa noite! ");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("Boa tarde! ");
		} else if (hora >= 7 && hora <= 11) {
			System.out.println("Bom dia! ");
		} else if (hora >= 23) {
			System.out.println("Hora errada! ");
		} else {
			System.out.println("Zzzzzzz ");
		}

		/* Barbara Mingatos */

	}
}
