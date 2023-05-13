package ex_01;

import java.util.Scanner;

public class UsaPessoa {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();

		System.out.print("Digite seu nome: ");
		pessoa.setNome(sc.next());

		System.out.print("Digite sua idade: ");
		pessoa.setIdade(sc.nextInt());

		System.out.print("Digite sua altura: ");
		pessoa.setAltura(sc.nextDouble());

		System.out.print(
				"Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nAltura: " + pessoa.getAltura());

		pessoa.fazAniver(true);
		System.out.print("\nIdade após aniver: " + pessoa.getIdade());
	}

}
