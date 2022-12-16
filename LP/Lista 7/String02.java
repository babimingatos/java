package lista07_fatec;

import java.util.Scanner;

public class String02 {

	public static void main(String args[]) {
// Reposição de aula

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o exercício: ");
		System.out.println("1- Imprimir de A até Z- ASCII");
		System.out.println("2- Imprimir A até Z- Sem saber a tabela");
		
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 1:
			// Imprimir de A até Z- ASCII
			for (int i = 65; i <= 90; i++) {
				System.out.println(i + " - " + (char) i);

			}
			break;
			
		case 2:
			// Imprimir A até Z- Sem saber a tabela
			for (int i = 'A'; i <= 'Z'; i++) {
				System.out.println(i + " - " + (char) i);

			}
			break;
		}
	}

}
