package lista2;

import java.util.Scanner;

public class ExibeIdade1 {
	public static void main(String args[]) {
		/*
		 * Crie um arquivo chamado ExibeIdade.java. Implemente um programa em Java que
		 * declare uma variável do tipo int chamada idade. Essa variável deve ser
		 * inicializada com o valor da sua idade. Por fim, exiba o valor dessa variável
		 * na saída padrão.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.println(idade);
		// Barbara dos Santos Mingatos
	}
}