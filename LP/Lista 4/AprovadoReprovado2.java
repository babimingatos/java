package lista04_fatec;

import java.util.Scanner;

public class AprovadoReprovado2 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado AprovadoReprovado.java. Solicite ao usu�rio que
		 * digite o valor para a vari�vel nota. O programa deve testar o valor digitado
		 * pelo usu�rio e caso n�o esteja na faixa de 0 at� 10 (inclusos), exibir a
		 * mensagem VALOR INVALIDO e finalizer o programa. Caso o valor digitado seja
		 * v�lido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6
		 * ou APROVADO caso contr�rio
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma nota");
		int nota = sc.nextInt();
		
		if (nota >= 6 && nota <=10) {
			System.out.println("Aprovado");
		} else if (nota <= 5) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Digite outra nota");
		}
		/* Barbara Mingatos */
	}
}
