import java.util.Scanner;

public class fatorial3 {
	// fatorial
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite ai");
		int numero = sc.nextInt();
		
		int fatorial = 1;		
		for (int atual =1; atual <= numero; atual++){	
			fatorial = fatorial * atual;
		}
		System.out.print("Fatorial "+ fatorial);
	}
}

