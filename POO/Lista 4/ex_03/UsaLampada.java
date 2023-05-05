package ex_03;

import java.util.Scanner;
	//Barbara Mingatos
public class UsaLampada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Lampada lam = new Lampada();

		System.out.println("1 - Acesa\n2 - Apagada\n3 - Meia-luz:");
		int resp = sc.nextInt();

		switch (resp) {
		
		case 1:
			lam.acesa();
			break;
		
		case 2:
			lam.apagada();
			break;
		
		case 3:
			lam.meiaLuz();
			break;
		}

		System.out.println("Estado: " + lam.getEstado());
	}
}
