package lista2;

public class TestaTiposPrimitivos9 {
	public static void main(String args[]) {

		/*
		 * Crie um arquivo chamado TestaTiposPrimitivos.java . Implemente um programa em
		 * Java que declare uma variável de cada um dos tipos primitivos da linguagem
		 * Java. Essas variáveis devem ser inicializadas com valores adequados. Por fim,
		 * exiba os valores dessas variáveis na saída padrão.
		 */

		byte um = 127; // -128 até 127
		short dois = 32767;// -32768 até 32767
		int tres = 2147483647; // -2147483648 até 2147483647
		long quatro = 432l; // -9223372036854775808 até 9223372036854775807
		float cinco = 54.32f; // 1.4E-45 até 3.4028235E38
		double seis = 32.5; // 4.9E-324 até 1.7976931348623157E308
		char sete = 'a'; // até 65535 ou 'b'
		boolean oito= true;//true ou false
		
		System.out.println(um+"\n"+dois+"\n"+tres+"\n"+quatro+"\n"+cinco+"\n"+seis+"\n"+sete+"\n"+oito);
		// Barbara dos Santos Mingatos
	}
}
