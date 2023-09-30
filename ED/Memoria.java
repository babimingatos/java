
import java.util.Scanner;

public class Memoria {
	static int [] memo = new int [100];
	
	public static void main (String[] args) {
		memo [0] = 0;
		memo [1] = 1;
		
			Scanner sc = new Scanner (System.in);
			
			for(int posicao = 0; posicao < 10; posicao++){
				System.out.print(posicao+"- "+ fibonacci (posicao)+"\n");
			}
			
	}
	
	static int fibonacci (int posicao){
	// if (posicao <=1) return posicao;
	if (posicao <= 1 && memo[posicao]==0){
	/*){
		return memo [posicao];
	} else{
		if(memo[posicao]==0){*/
			memo [posicao] =  fibonacci (posicao -1)+ fibonacci (posicao -2);
		
		} 	
		return memo[posicao];
		//else{
			//return memo[posicao];
		//}
		
	
	// return fibonacci (posicao -1)+ fibonacci (posicao -2)
	
}
}
