import java.util.Arrays;

public class BuscaBinaria3 {
	
	static int contador;
	
	public static void main (String[] args) {
		
		//dados aleatorios: busca sequencial
		//dados oedenados e sem dados iguais
		
		int [] exercito = {2, 6, 9, 12, 17, 37};
		contador=0;
		imprime(exercito);
		
		int busca=15;
		int posicao= buscaSimples(exercito, 0, exercito.length, busca);
		
		if(posicao==-1){
			System.out.print("Elemento não encontrado.");
		} else{
			System.out.print("Elemento "+ busca+" encontrado na posicao "+posicao);
			System.out.print("\n>>>>> "+ exercito[posicao]);
			
		}
		System.out.print("\nContador"+contador);
		
	}
	// exemplo da lista telefonica /2 /2 /2 /2, não pode ser length
	static int buscaBinaria (int [] vetor, int inicio, int termino, int busca){
		
		
	while(termino-inicio>0){
		contador++;
		int meio = (inicio+termino)/2;
		
		if( vetor[meio]==busca ){
			return meio;
		} else{
			if (vetor[meio]<busca){
				inicio = meio + 1;
			} else {
				termino = meio;
			}
		}
	  }
		
		return -1;
	}
	
	static int buscaSimples(int [] vetor, int inicio, int termino, int busca){
		// inicio e termino da posicao q quer o
		for(int atual=inicio;atual<termino;atual++){
			
			contador++;
			
			if(vetor[atual]==busca){
				return atual;
			}
		}
		
		return -1;
	}
	
	static void imprime (int vetor []){
		System.out.println(Arrays.toString(vetor));
	
	}
	
}

