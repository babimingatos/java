package lista2;

import java.util.Scanner;

public class TesteVariavelPeso8 {
	public static void main(String args[]) {
		/*
		 * 8 - Crie um arquivo chamado TestaVariavelPeso.java . Implemente um programa
		 * em Java que declare uma vari�vel do tipo double chamada peso . Essa vari�vel
		 * deve ser inicializada com o valor do seu peso. No final, exiba o valor dessa
		 * vari�vel na sa�da padr�o usando o println() e o printf() .
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite seu peso: ");
		double peso= sc.nextInt();
		
		System.out.printf("Printf: %f", peso);
		
		System.out.println("\nprintln: "+peso);
		// Barbara dos Santos Mingatos
	}
}