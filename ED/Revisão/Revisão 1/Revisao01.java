import java.util.Scanner;

public class Revisao01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			//new: nova instancia de
		int [] vetor = new int [10];	
		
		Object teste=new Object ();
		System.out.print(teste);
		
			//objeto.atributo
			//vetor.length
		
		for (int i = 1; i < vetor.length; i++){
			System.out.println( vetor[i] );
		}
		
		System.out.print("\n");
		
		//for each
		//precisa de uma variavel de mesmo tipo ou que caiba
		//elemento passa por cada uma das partes do vetor
		// iteração do vetor todo, não manipula posição
		
		for ( double elemento : vetor ){
			//elemento++;
			System.out.println( elemento );
		}
		
		Oi[]veto=new Oi[10];
		
		for (int i = 0; i < veto.length; i++){
			System.out.println( veto[i] );
		}
		
		for ( Oi elemento : veto){
			elemento.texto=elemento.texto.toUpperCase();
			System.out.println( "\n\n"+elemento );
		}
	}
}



public class Oi {
	
	public String texto;
	
	public Oi(){ //construtor
		texto="a";
	}
	@Override
	public String toString(){
		return texto;
	}


