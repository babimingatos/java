package lista03_fatec;

public class Casting2 {

	public static void main(String[] args) {
		/*
		 * Crie um arquivo chamado Casting.java . Crie uma vari�vel chamada numero1 do
		 * tipo long e inicialize-a com o valor 2147483648L. Depois, crie uma vari�vel
		 * chamada numero2 do tipo int e copie o valor da vari�vel numero1 para a
		 * vari�vel numero2 . Por fim, exiba, na sa�da padr�o, os valores dessas duas
		 * vari�veis.
		 */
		long numero1 = 2147483648l;
		int numero2 = (int) numero1;
		System.out.println("um " + numero1 + "\ndois " + numero2);
		/*Barbara Mingatos*/
	}

}
