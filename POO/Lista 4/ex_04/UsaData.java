package ex_04;

import java.util.Scanner;

public class UsaData {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);

		Data data = new Data();

		System.out.print("Dia: ");
		data.setDia(sc.nextInt());

		System.out.print("M�s: ");
		data.setMes(sc.nextInt());

		System.out.print("Ano: ");
		data.setAno(sc.nextInt());

		data.setData(Integer.parseInt("" + (data.getDia()) + "" + (data.getMes()) + "" + (data.getAno())));

		System.out.print("getData: " + data.getData());
		System.out.print("\n" + data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		System.out.print("\n" + data.ok() + " (False: data inv�lida e True: Data v�lida)");
	}

}
