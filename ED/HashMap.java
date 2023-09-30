import java.util.Map;
import java.util.HashMap;

public class Memoria {
	static Map<Integer,Integer> memo = new HashMap<Integer, Integer> ();
	
	public static void main (String[] args) {
		memo.put(0, 0);// na chave zero, coloca 0
		memo.put(1,1);

			for(int posicao = 0; posicao < 10; posicao++){
				System.out.print(posicao+"- "+ fibonacci (posicao)+"\n");
			}
			
	}
	
	static int fibonacci (int posicao){
// memoria tem a chave da posucao q estou procurando?
	if (! memo.containsKey(posicao) ){
		
		memo.put(posicao, fibonacci (posicao -1)+ fibonacci (posicao -2));
		return memo.get(posicao);
	}
		
//put devolve o valor
}
