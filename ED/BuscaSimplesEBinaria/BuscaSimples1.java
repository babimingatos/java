import java.util.Arrays;

public class BuscaBinaria {
	
	public static void main (String[] args) {
		
		int [] exercito = {6, 2, 9, 12, 37, 17};
		
		imprime(exercito);
		
		int busca=9;
		int posicao= buscaSimples(exercito, 0, exercito.length, busca);
		
		if(posicao==-1){
			System.out.print("Elemento não encontrado.");
		} else{
			System.out.print("Elemento "+ busca+" encontrado na posicao "+posicao);
			System.out.print("\n>>>>> "+ exercito[posicao]);
		}
		
	}
	
	static int buscaSimples(int [] vetor, int inicio, int termino, int busca){
		// inicio e termino da posicao q quero
		for(int atual=inicio;atual<termino;atual++){
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

