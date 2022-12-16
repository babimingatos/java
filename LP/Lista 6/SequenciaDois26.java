package lista06_fatec;

public class SequenciaDois26 {

	public static void main(String args[]) {
		/*Escreva um programa em Java que imprima sequência 2:
			1, 1
			2, 1 2
			3, 1 2 3
			4, 1 2 3 4
			5, 1 2 3 4 5
			6, 1 2 3 4 5 6
			7, 1 2 3 4 5 6 7
			8, 1 2 3 4 5 6 7 8
			9, 1 2 3 4 5 6 7 8 9
			10, 1 2 3 4 5 6 7 8 9 10*/
		
		for (int a = 1; a <= 10; a++) {
			System.out.print(a + ", ");

			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
				
				
			}

			System.out.println(" ");
		}
		/* Barbara Mingatos */
	}

}
