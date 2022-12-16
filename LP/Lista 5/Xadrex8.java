package lista05_fatec;

import java.util.Scanner;

public class Xadrex8 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler a hora de início e a hora de fim de um
		 * jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a
		 * duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
		 * de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora início: ");
		int inicio = sc.nextInt();

		System.out.print("Digite a hora final: ");
		int hfinal = sc.nextInt();

		int total = hfinal - inicio;

		if (total <= 0) {
			int dia = total + 24;
			System.out.println(dia + " horas de duração");
		} else {

			System.out.println(total + " horas de duração");
		}
		/* Barbara Mingatos */
	}
}
