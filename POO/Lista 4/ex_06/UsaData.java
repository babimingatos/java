package ex_06;

import java.util.Scanner;

public class UsaData {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		Data data = new Data();

		System.out.print("\nData 1: ");

		System.out.print("\nDia: ");
		data.setDia1(sc.nextInt());

		System.out.print("Mês: ");
		data.setMes1(sc.nextInt());

		System.out.print("Ano: ");
		data.setAno1(sc.nextInt());

		System.out.print("\nData 2: ");

		System.out.print("\nDia: ");
		data.setDia2(sc.nextInt());

		System.out.print("Mês: ");
		data.setMes2(sc.nextInt());

		System.out.print("Ano: ");
		data.setAno2(sc.nextInt());

		System.out.print("\nData 1: " + data.getDia1() + "/" + data.getMes1() + "/" + data.getAno1());
		System.out.print("\nData 2: " + data.getDia2() + "/" + data.getMes2() + "/" + data.getAno2());

		if (data.iguais()) {
			System.out.print("\nIgual! ");
		} else {
			System.out.print("\nDiferença entre datas: " + data.dif());
		}
	}

}
