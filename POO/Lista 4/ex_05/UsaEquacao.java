package ex_05;
import java.util.Scanner;

	// Barbara Mingatos

public class UsaEquacao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Equacao eq = new Equacao();

		System.out.print("a: ");
		eq.setA(sc.nextDouble());

		System.out.print("b: ");
		eq.setB(sc.nextDouble());

		System.out.print("c: ");
		eq.setC(sc.nextDouble());

		if (eq.raizes()) {
			System.out.println("A equação tem duas raízes reais:");
			System.out.println("x1 = " + eq.getX1());
			System.out.println("x2 = " + eq.getX2());
		} else {
			System.out.println("A equação não tem raízes reais.");
		}
	}
}
