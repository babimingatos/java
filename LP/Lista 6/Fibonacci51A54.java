package lista06_fatec;

import java.util.Scanner;

public class Fibonacci51A54 {

	public static void main(String args[]) {
		/*	//Barbara Mingatos
		 51)Solicite ao usuário a quantidade de termos da sequência de Fibonacci e imprima o resultado. 
		 52) Solicite um número inteiro ao usuário e informe se ele pertence a sequência de Fibonacci ou não. 
		 53) Imprima os números da sequência de Fibonacci que estão presentes na faixa de 1 até 250. 
		 54) Solicite ao usuário o termo inicial e o termo final da sequência de Fibonacci (intervalo fechado) e imprima o resultado.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número do exercício: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {
		case 51:

			System.out.print("Digite a quantidade de termos: ");
			int num = sc.nextInt();

			int num1 = 1, num2 = 0;

			System.out.println(num2);
			System.out.println(num1);

			for (int i = 2; i < num; i++) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				System.out.println(num1);
			}

			break;
		case 52:

			boolean esta = true;
			System.out.print("Digite um número: ");
			num = sc.nextInt();

			num1 = 1;
			num2 = 0;

			System.out.println(num2);
			System.out.println(num1);

			for (int i = 1; i <= num; i++) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				if (num == num1) {
					System.out.print(num);
				}
			}

			break;
		case 53:
			num1 = 1;
			num2 = 0;

			System.out.println(num2);
			System.out.println(num1);

			num = 250;
			for (int i = 2; i < 250; i++) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				System.out.println(num1);
			}

			break;

		case 54:
			System.out.print("Digite o termo inicial: ");
			int in = sc.nextInt();

			System.out.print("Digite o termo final: ");
			int fin = sc.nextInt();
			
			num1 = 1;
			num2 = 2;
			for (int i = in; i < fin; i++) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				System.out.println(num1);
			}

			break;
		}
		/* Barbara Mingatos */
	}

}
