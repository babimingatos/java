package ex_02;

//Barbara Mingatos

import java.util.Scanner;

public class UsaConta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Conta conta = new Conta();

		System.out.print("Digite a quantidade de pessoas: ");
		conta.setQtd(sc.nextInt());

		System.out.print("Digite o valor: ");
		conta.setValor(sc.nextDouble());

		System.out.print("Deseja pagar o garçom? S ou N: ");
		String resposta = sc.next().toUpperCase();

		conta.setGarcom(resposta.charAt(0) == 'S');

		System.out.println("Valor total: " + conta.getValorTotal());
	}
}
