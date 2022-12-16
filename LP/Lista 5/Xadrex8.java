package lista05_fatec;

import java.util.Scanner;

public class Xadrex8 {

	public static void main(String args[]) {
		/*
		 * Escreva um programa em Java para ler a hora de in�cio e a hora de fim de um
		 * jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a
		 * dura��o do jogo em horas, sabendo-se que o tempo m�ximo de dura��o do jogo �
		 * de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora in�cio: ");
		int inicio = sc.nextInt();

		System.out.print("Digite a hora final: ");
		int hfinal = sc.nextInt();

		int total = hfinal - inicio;

		if (total <= 0) {
			int dia = total + 24;
			System.out.println(dia + " horas de dura��o");
		} else {

			System.out.println(total + " horas de dura��o");
		}
		/* Barbara Mingatos */
	}
}
