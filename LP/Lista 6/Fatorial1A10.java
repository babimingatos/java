package lista06_fatec;

public class Fatorial1A10 {

	public static void main(String args[]) {
		
		for (int i = 0; i <= 10; i++) {
			if (i >= 1) {
				int num = i;
				int temp = i;
				temp = temp * (num - 1);
				num--;

				System.out.println("Tabela " + i + ": " + temp);
			}
		}

	}
}