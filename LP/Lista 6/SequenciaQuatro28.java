package lista06_fatec;

public class SequenciaQuatro28 {

	public static void main(String args[]) {
		/*Escreva um programa em Java que imprima sequência 4:
				1, 2 3 4 5 6 7 8 9 10
				2, 3 4 5 6 7 8 9 10
				3, 4 5 6 7 8 9 10
				4, 5 6 7 8 9 10
				5, 6 7 8 9 10
				6, 7 8 9 10
				7, 8
				9 10
				8, 9 10
				9, 10
				10,
		 		*/
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");

			for (int o = i + 1; o <= 10; o++) {
				System.out.print(o + " ");
			}

			System.out.println(" ");

		}
		
		/* Barbara Mingatos */
	}
}
