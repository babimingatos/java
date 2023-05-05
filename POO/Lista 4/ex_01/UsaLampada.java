package ex_01;

import java.util.Scanner;

public class UsaLampada {

	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Lampada lam = new Lampada();

		System.out.print("Digite o modelo: ");
		lam.setModelo(sc.next());

		System.out.print("Digite o tipo: ");
		lam.setTipo(sc.next());

		System.out.print("Digite o Preço: ");
		lam.setPreco(sc.nextInt());

		System.out.println("Modelo: " + lam.getModelo());
		System.out.println("Tipo: " + lam.getTipo());
		System.out.println("Preço: " + lam.getPreco());
		System.out.println("Acesa ou não: " + lam.getAcesa());

	}
}
