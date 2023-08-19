import java.util.Scanner;
import java.util.Arrays;

public class Revisao01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		//new: nova instancia de
		Object teste = new Object();
		
		Oi[] vetor = new Oi[10];
		
		System.out.println ( teste + "\n\n" );
		
			//objeto.atributo
			//vetor.length
		
		for ( int i = 0 ; i < vetor.length ; i++ ) {
			
			vetor[i] = new Oi();
			
			System.out.print ( vetor[i] + " " );
		}
		System.out.println("\n");
		
		// for each precisa de uma variavel de mesmo tipo ou que caiba
		// elemento passa por cada uma das partes do vetor
		// iteração do vetor todo, não manipula posição
		
		for ( Oi elemento : vetor ) {
			elemento.texto = elemento.texto.toUpperCase();
			System.out.print ( elemento + " " );
		}
		
		System.out.println("\n");
		
		for ( int i = 0 ; i < vetor.length ; i++ ) {
			System.out.print ( vetor[i] + " " );
		}
		System.out.println("\n");
		
		int i = 0;
		
		while ( i < vetor.length ) {
			System.out.print ( vetor[i] + " " );
			i++;
		}
		System.out.println("\n");

		i = 0;
		
		while ( i < vetor.length ) {
			System.out.print ( vetor[i++] + " " );
		}
		System.out.println("\n");
		
		i = 0;
		
		do {
			System.out.print ( vetor[i++] + " " );
		} while ( i < vetor.length );
		
		System.out.println("\n");
		System.out.println ("Zezen".toUpperCase());
		String nome = "Zezen";
		String nome2 = new String();
		int[] numeros = { 2, 5, 7, 2, 4, 5 };
		Oi[] oies = { new Oi(), new Oi("Zezen"),new Oi("Outra coisa")};
		System.out.println ( Arrays.toString ( oies ) );
	}
}

class Oi {
	public String texto;
	
	public Oi () { //construtor
		texto = "a";
	}
	
	public Oi ( String texto ) {
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return texto;
	}
}
