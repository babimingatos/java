import java.util.Scanner;

public class fatorial4 {
	
	// fatorial
	static int fatorial;
	public static void main (String[] args) {
		
	
		Scanner sc = new Scanner (System.in);

		System.out.print("Digite ai: ");
		int numero = sc.nextInt();
		
		int fat= fatorial(numero);
					
		
		System.out.print("Fatorial " + fat);
	
	}
	
	static int fatorial(int numero){
		int fatorial =1;
		for (int atual =numero; atual > 1; atual--){	
			fatorial = fatorial * atual;
		}
		
		
		return fatorial;
}
}

