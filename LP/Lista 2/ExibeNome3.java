package lista2;

import java.util.Scanner;

public class ExibeNome3 {
	public static void main(String args[]) {
		/*
		 * Crie um arquivo chamado ExibeNome.java. Implemente um programa em Java que
		 * declare uma vari�vel do tipo String chamada nome. Essa vari�vel deve ser
		 * associada o seu nome. Ele deve ser escrito entre aspas. Por fim, exiba o
		 * valor associado a essa vari�vel na sa�da padr�o
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");

		String nome = sc.next();
		System.out.println("Ol�, " + nome);
		// Barbara dos Santos Mingatos
	}
}
