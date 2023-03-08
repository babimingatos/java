import java.util.Scanner;

public class Main{
    
  public static void main (String args[]){
    //Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e imprimir seus elementos
    //Barbara Mingatos
   
    int[][] array = new int[4][5];
    
    for (int l = 0; l < 4; l++) {
	  System.out.println ();

	  for (int j = 0; j < 5; j++) {
	    array[l][j] = (int) (Math.random () * 8);
	    System.out.print (array[l][j] + " ");
	  }
    
    }
  }
}

