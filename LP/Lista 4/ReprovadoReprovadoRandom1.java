package lista04_fatec;

import java.util.Random;

public class ReprovadoReprovadoRandom1 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número
		 * aleatório com valores entre 0 e 10 (inclusos) e atribua a variável nota. O
		 * programa deve exibir a mensagem REPROVADO quando a nota do aluno for menor do
		 * que 6 ou APROVADO caso contrário
		 */

		Random random = new Random();
		int nota = random.nextInt(10);
		System.out.println(nota);

		if (nota >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		/* Barbara Mingatos */
	}
}
