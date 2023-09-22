import java.util.Scanner;
public class fatorial5 {
	
static int cont=0;
	
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
		
		System.out.print ("\n"+cont++);// ver qts vezxes passou
		return numero * fatorial (numero - 1); // exc STACKOVERFLOW
		
	}
}

