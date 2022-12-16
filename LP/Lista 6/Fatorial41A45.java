package lista06_fatec;

import java.util.Scanner;

public class Fatorial41A45 {

	public static void main(String args[]) {
/*
41) Solicite ao usu�rio um n�mero e mostre o fatorial do n�mero informado.
42) Construa um programa para mostrar o fatorial dos n�meros inteiros na faixa de 1 a 10.
43) Solicite ao usu�rio 7 n�meros inteiros e para cada leitura informar o fatorial desse n�mero.
44) Solicite ao usu�rio a quantidade de termos da sequ�ncia de fatoriais e imprima o resultado.
45) Solicite ao usu�rio a quantidade de termos da sequ�ncia de fatoriais e imprima a sequ�ncia do final para o in�cio.
*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um exercicio: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 41:
			System.out.print("Digite um n�mero: ");
			int num = sc.nextInt();
			int temp = num;

			while (num > 1) {
				temp = temp * (num - 1);
				num--;
			}

			System.out.print(temp);
			break;
		case 42:
			for (int i = 1; i <= 10; i++) {
				int h = i;
				temp = h;
				while (h > 1) {
					temp = temp * (h - 1);
					h--;
				}
				System.out.println(i + ": " + temp);
			}

			break;
		case 43:
			for (int i = 1; i <= 7; i++) {
				System.out.print("Digite um n�mero inteiro: ");
				num = sc.nextInt();
				temp = num;

				while (num > 1) {
					temp = temp * (num - 1);
					num--;
				}
				System.out.println(temp);
			}

			break;
		case 44:
			System.out.print("Digite a quantidade de termos: ");
			num = sc.nextInt();

			temp = num;
			while (num > 1) {
				temp = temp * (num - 1);
				num--;
			}
			System.out.print(temp);

			break;
		case 45:
			System.out.print("Digite a quantidade de termos: ");
			num = sc.nextInt();
			int a = num;
			temp = a;

			while (num > 1) {
				temp = temp * (num - 1);
				num--;
			}

			System.out.println("Resultado do fatorial: " + temp);
			System.out.print("Sequencia de n�meros: ");
			for (int i = a; i >= 1; i--) {
				// Sequencia de n�meros
				System.out.print(a-- + " ");
			}

			break;
		
		}
		/* Barbara Mingatos */
	}

}
