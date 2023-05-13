package ex_02;

import java.util.Scanner;

public class UsaCalculadora {

	public static void main(String[] args) {
		// Barbara Mingatos

		Scanner sc = new Scanner(System.in);
		Scanner scs = new Scanner(System.in);
		Calculadora cal = new Calculadora();

		System.out.print("Digite o primeiro valor: ");
		cal.setNum1(sc.nextInt());

		System.out.print("Digite o segundo valor:");
		cal.setNum2(sc.nextInt());

		System.out.print("Digite a operação desejada (-, +, / ou *): ");
		char esc = scs.next().charAt(0);

		if (esc == '+') {
			System.out.print(cal.somar());
		} else if (esc == '/') {
			System.out.print(cal.dividir());
		} else if (esc == '*') {
			System.out.print(cal.multiplicar());
		} else if (esc == '-') {
			System.out.print(cal.subtrair());
		}

	}

}
