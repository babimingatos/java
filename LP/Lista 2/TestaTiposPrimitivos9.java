package lista2;

public class TestaTiposPrimitivos9 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado TestaTiposPrimitivos.java . Implemente um programa em
		 * Java que declare uma vari�vel de cada um dos tipos primitivos da linguagem
		 * Java. Essas vari�veis devem ser inicializadas com valores adequados. Por fim,
		 * exiba os valores dessas vari�veis na sa�da padr�o.
		 */

		byte um = 127; // -128 at� 127
		short dois = 32767;// -32768 at� 32767
		int tres = 2147483647; // -2147483648 at� 2147483647
		long quatro = 432l; // -9223372036854775808 at� 9223372036854775807
		float cinco = 54.32f; // 1.4E-45 at� 3.4028235E38
		double seis = 32.5; // 4.9E-324 at� 1.7976931348623157E308
		char sete = 'a'; // at� 65535 ou 'b'
		boolean oito= true;//true ou false
		
		System.out.println(um+"\n"+dois+"\n"+tres+"\n"+quatro+"\n"+cinco+"\n"+seis+"\n"+sete+"\n"+oito);
		// Barbara dos Santos Mingatos
	}
}
