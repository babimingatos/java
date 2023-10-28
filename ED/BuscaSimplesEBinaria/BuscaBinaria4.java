import java.util.Arrays;

public class BuscaBinaria4 {
	
	static int contador;
	
	public static void main (String[] args) {
		
		// dados ordenados
		// sem elementos duplicados
		
		int tamanho=10;
		int[] exercito = new int [tamanho];
		
		for(int atual=0;atual<exercito.length;atual++){
			exercito[atual]= atual+1;
		}
		
		imprime ( exercito );
		
		int busca =-99999;
		
		contador = 0;
		
		int posicao = recursao ( exercito, 0, exercito.length, busca );
		
		if ( posicao == -1 ) {
			
			System.out.println( "Elemento nao encontrado!" );
			
		} else {
			
			System.out.println("Elemento " + busca + 
				" encontrado na posicao: " + posicao);
			
			System.out.println(">>> " + exercito [ posicao ] );
		}
		
		System.out.println(">>> Contador: " + contador );
		
		
		contador = 0;
		
		posicao = recursao  ( exercito, 0, exercito.length, busca );
		
		if ( posicao == -1 ) {
			
			System.out.println( "Elemento nao encontrado!" );
			
		} else {
			
			System.out.println("Elemento " + busca + 
				" encontrado na posicao: " + posicao);
			
			System.out.println(">>> " + exercito [ posicao ] );
		}
		
		System.out.println(">>> Contador: " + contador );
	}

	//recursão nao tem laço
	static int recursao ( int[] vetor, int inicio, int termino, int busca) {
		// fazer o caso base caso dê stack overflow
		if ( termino - inicio <1 ) {
			return -1;
			
		}contador++;
			int meio = ( inicio + termino ) / 2;
			
			if ( vetor[meio] == busca ) {
				
				return meio;
				
			} else {
				
				if ( vetor[meio] < busca ) {
					inicio=meio+1;
					return recursao (vetor,inicio,termino,busca);
					
				} else {termino = meio;
					return recursao (vetor,inicio,termino,busca);
					
				}
			//}
		}
		
		
	}
	
	static int buscaSimples ( int[] vetor, int inicio, int termino, int busca ) {
		
		for ( int atual = inicio; atual < termino ; atual++ ) {
			
			contador++;
			
			if ( vetor[atual] == busca ) {
				
				return atual;
			}
		}
		
		return -1;
	}
	
	static void imprime ( int vetor[] ) {
		
		System.out.println( Arrays.toString ( vetor ) );
	}
}
