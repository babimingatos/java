package lista06_fatec;

public class SequenciaSeis30 {

	public static void main(String args[]) {
		/*Escreva um programa em Java que imprima sequência 6:
			1, 1
			2, 2 4
			3, 1 3 5
			4, 2 4 6 8
			5, 1 3 5 7 9
			6, 2 4 6 8 10 12
			7, 1 3 5 7 9 11 13
			8, 2 4 6 8 10 12 14 16
			9, 1 3 5 7 9 11 13 15 17
			10, 2 4 6 8 10 12 14 16 18 20*/
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");

			if (i % 2 == 0) {
				for (int a = 2; a <= i*2; a+=2) {
					
					System.out.print(a+" ");
				}
			}
			
			if (i % 2 != 0) {
				for (int b = 1; b <= i*2; b+=2) {
					
					System.out.print(b+" ");
				}
			}
			
			System.out.println(" ");

		}

		/* Barbara Mingatos */
	}
}
