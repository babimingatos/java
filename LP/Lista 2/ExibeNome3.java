package lista2;

import java.util.Scanner;

public class ExibeNome3 {
	public static void main(String args[]) {
		/*
		 * Crie um arquivo chamado ExibeNome.java. Implemente um programa em Java que
		 * declare uma variável do tipo String chamada nome. Essa variável deve ser
		 * associada o seu nome. Ele deve ser escrito entre aspas. Por fim, exiba o
		 * valor associado a essa variável na saída padrão
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");

		String nome = sc.next();
		System.out.println("Olá, " + nome);
		// Barbara dos Santos Mingatos
	}
}
