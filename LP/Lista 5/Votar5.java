package lista05_fatec;

import java.util.Scanner;

public class Votar5 {

	public static void main(String args[]) {

		/*
		 * Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma
		 * pessoa. Escrever uma mensagem que diga se ela poder� ou n�o votar este ano
		 * (n�o � necess�rio considerar o m�s em que a pessoa nasceu)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o ano atual: ");
		int ano = sc.nextInt();

		System.out.print("Digite o seu ano de nascimento: ");
		int nasc = sc.nextInt();

		int idade = ano - nasc;
		if (idade >= 16) {
			System.out.println("Pode votar! \nIdade: " + idade);
		} else if (idade <= 15) {
			System.out.println("N�o pode votar! \nIdade: " + idade);
		}
		/* Barbara Mingatos */
	}
}
