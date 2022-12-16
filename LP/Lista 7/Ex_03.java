package lista07_fatec;

public class Ex_03 {

	public static void main(String[] args) {
		// Barbara Mingatos

		String minuscula = "";
		for (int i = 97; i <= 122; i++) {
			minuscula += (char) i;
		}
		System.out.println(minuscula);

		System.out.println("----------------------");
		
		String minusculaa = "";
		for (char i = 97; i <= 122; i++) {
			minusculaa += i;
		}
		System.out.println(minusculaa);

		System.out.println("----------------------");
		
		String minusculaaa = "";
		for (char i = 'a'; i <= 'z'; i++) {
			minusculaaa += i;
		}
		System.out.print(minusculaaa);
	}

}
