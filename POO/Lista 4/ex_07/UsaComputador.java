package ex_07;

import java.util.Scanner;

public class UsaComputador {
	// Barbara Mingatos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Computador pc = new Computador();

		System.out.print("Placa mãe: R$800");
		pc.setPlacamae(800);

		System.out.print("\n\nProcessadores: \n1) 1600Mhz: R$700 \n2) 1800Mhz: R$830 \n3) 1900Mhz: R$910");
		int pro = sc.nextInt();

		switch (pro) {
		case 1:
			pc.setProc(700);
			break;
		case 2:
			pc.setProc(830);
			break;
		case 3:
			pc.setProc(910);
			break;
		}

		System.out.print(
				"\n\nMemórias: \n1) 1GB: R$350 \n2) 2GB: R$700 \n3) 4GB: R$1400 \n4) 6GB: R$2100 \n5) 8GB: R$2800");
		int mem = sc.nextInt();

		switch (mem) {
		case 1:
			pc.setMemoria(350);
			break;
		case 2:
			pc.setMemoria(700);
			break;
		case 3:
			pc.setMemoria(1400);
			break;
		case 4:
			pc.setMemoria(2100);
			break;
		case 5:
			pc.setMemoria(2800);
			break;
		}

		System.out.print("\n\nDisco rigido: \n1) 500GB: R$300 \n2) 1TB: R$420 \n3) 2TB: R$500 ");
		int dis = sc.nextInt();

		switch (dis) {
		case 1:
			pc.setDisco(300);
			break;
		case 2:
			pc.setDisco(420);
			break;
		case 3:
			pc.setDisco(500);
			break;

		}

		System.out.print("\n\nMonitor: \n1) 15 polegadas: R$320 \n2) 17 polegadas: R$520 ");
		int mon = sc.nextInt();

		switch (mon) {
		case 1:
			pc.setMonitor(320);
			break;
		case 2:
			pc.setMonitor(520);
			break;
		}

		System.out.print("Total: " + pc.soma());
	}

}
