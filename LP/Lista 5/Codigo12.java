package lista05_fatec;

import java.util.Scanner;

public class Codigo12 {

	public static void main(String args[]) {
		/*
		 * Desenvolva um programa em Java que receba o pre�o de um produto e seu c�digo
		 * de origem e mostre o pre�o do produto junto de sua proced�ncia, o valor
		 * calculado do frete e o valor final a ser pago pelo produto, conforme tabela a
		 * seguir:
		 * 
		 * C�digo de Origem Regi�o de proced�ncia Frete 1 Norte 10% 2, 5, 9 Sul 3% 3, 10
		 * at� 15 Leste 1,2% 7 ou 20 Oeste 7,3% Qualquer outro Importado 22,2%
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o pre�o: ");
		double preco = sc.nextDouble();

		System.out.println("Digite o c�digo: \n" + "1- 1\n" + "2- 2, 5, 9 \n" + "3- 3, 10, 11, 12, 13, 14 e 15 \n"
				+ "4- 7, 20 \n" + "5- Qualquer outro");
		int codigo = sc.nextInt();

		switch (codigo) {
		case 1:
			double freteN = (preco * 0.1) + preco;
			System.out.print("Regi�o de proced�ncia: Norte. Frete: " + freteN);
			break;
			
		case 2:
			double freteS = (preco * 0.03) + preco;
			System.out.print("Regi�o de proced�ncia: Sul. Frete: " + freteS);
			break;
			
		case 3:
			double freteL = (0.012 * preco) + preco;
			System.out.print("Regi�o de proced�ncia: Leste. Frete: " + freteL);
			break;
			
		case 4:
			double freteO = (0.073 * preco) + preco;
			System.out.print("Regi�o de proced�ncia: Oeste. Frete: " + freteO);
			break;
			
		case 5:
			double freteI = (0.222 * preco) + preco;
			System.out.print("Regi�o de proced�ncia: Importado. Frete: " + freteI);
			break;
			
		default:
			System.out.print("Escolha outra op��o");
		}
		
		/* Barbara Mingatos */
	}

}
