package lista06_fatec;

import java.util.Scanner;

public class Ricci58A60 {

	public static void main(String args[]) {
		// Barbara Mingatos
		/*58) Solicite ao usu�rio os dois primeiros termos da sequ�ncia de Ricci e gere os 10 pr�ximos termos.
		  59) Solicite ao usu�rio os dois primeiros termos da sequ�ncia de Ricci e depois  solicite a quantidade de termos que ele deseja gerar. Imprimir o resultado.
		  60) Solicite ao usu�rio os dois primeiros termos da sequ�ncia de Ricci e depois solicite a n�mero e verifique se o n�mero informado pertence a sequ�ncia de Ricci ou n�o*/
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um exeercicio: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 58:
			System.out.print("Digite o primeiro termo: ");
			int num1 = sc.nextInt();

			System.out.print("Digite o segundo termo: ");
			int num2 = sc.nextInt();

			System.out.println(num2);
			System.out.println(num1);

			for (int i = 2; i < 10; i++) {
				num1 = num1 + num2;
				num2 = num1 - num2;
				System.out.println(num1);
			}
			break;

		case 59:
			System.out.print("Digite a quantidade de termos: ");
			int num = sc.nextInt();

			System.out.print("Digite o primeiro termo: ");
			int num11 = sc.nextInt();

			System.out.print("Digite o segundo termo: ");
			int num22 = sc.nextInt();

			System.out.println(num22);
			System.out.println(num11);

			for (int i = 2; i < num; i++) {
				num11 = num11 + num22;
				num22 = num11 - num22;
				System.out.println(num11);
			}

			break;

		case 60:
			boolean ricci = true;
			System.out.print("Digite o primeiro termo: ");
			int num111 = sc.nextInt();

			System.out.print("Digite o segundo termo: ");
			int num222 = sc.nextInt();

			System.out.print("Digite o segundo termo: ");
			int numero = sc.nextInt();

			System.out.println(num222);
			System.out.println(num111);

			for (int i = 2; i < 100; i++) {
				num111 = num111 + num222;
				num222 = num111 - num222;
				System.out.println(num111);
				ricci = true;
			}
			if (ricci == true) {
				System.out.print("Pertence a sequencia. ");
			}
			break;
		}

	}
}
