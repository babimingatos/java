package lista06_fatec;

public class SequenciaCinco29 {

	public static void main(String args[]) {
		/*Escreva um programa em Java que imprima sequência 5:
			1, 1 3 5 7 9
			2, 2 4 6 8 10
			3, 1 3 5 7 9
			4, 2 4 6 8 10
			5, 1 3 5 7 9
			6, 2 4 6 8 10
			7, 1 3 5 7 9
			8, 2 4 6 8 10
			9, 1 3 5 7 9
			10, 2 4 6 8 10*/
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");

			if (i % 2 == 0) {
				System.out.print("2 4 6 8 10");
			}
			if (i % 2 != 0) {
				System.out.print("1 3 5 7 9");
			}

			System.out.println(" ");
		}
		//Barbara Mingatos
	}

}
