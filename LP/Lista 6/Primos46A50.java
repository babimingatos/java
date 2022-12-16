package lista06_fatec;

import java.util.Scanner;

public class Primos46A50 {

	public static void main(String args[]) {
		/*Barbara Mingatos
		 * 46)Solicite ao usu�rio um n�mero e verifique se este n�mero � primo ou n�o.
		 * 47) Imprima somente os n�meros primos existentes na faixa de um 1 at� 100.
		 * 48) Solicite ao usu�rio a quantidade de termos da sequ�ncia de n�meros primos
		 * e imprima o resultado. 49) Solicite ao usu�rio a quantidade de termos da
		 * sequ�ncia de n�meros primos e imprima a sequ�ncia do final para o in�cio. 
		 * 50) Solicite ao usu�rio o termo inicial e a quantidade de termos da sequ�ncia de
		 * n�meros primos e imprima o resultado
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o exercicio desejado: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 46:
			System.out.print("Digite um n�mero: ");
			int num = sc.nextInt();
			boolean primo = true;
			if (num == 0 || num == 1) {
				primo = false;
			} else {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						primo = false;
					}
				}
			}
			if (primo == true) {
				System.out.print(num + " � primo");
			}
			if (primo == false) {
				System.out.print(num + " n�o � primo");
			}

			break;
		case 47:
			primo = true;
			for (int i = 2; i <= 100; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primo = false;
					}
				}
				if (primo == false) {
					System.out.print("");
					primo = true;
				} else {
					System.out.print(i + " ");
				}
			}

			break;
		case 48:
			System.out.print("Digite a quantidade de termos: ");
			num = sc.nextInt();
			primo = true;
			int cont = 0;
			for (int i = 2; cont < num; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primo = false;
					}
				}
				if (primo == true) {
					System.out.print(i + " ");
					cont++;
				}
				primo = true;
			}

			break;
		case 49:
			primo = true;
			cont = 0;
			System.out.print("Digite a quantidade de termos: ");
			num = sc.nextInt();

			int[] numPri = new int[num];
			for (int i = 2; cont < num; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primo = false;
					}
				}
				if (primo == true) {
					numPri[cont] = i;
					cont++;
				}
				primo = true;
			}
			for (int i = numPri.length - 1; i >= 0; i--) {
				System.out.printf("%d ", numPri[i]);
			}

			break;
		case 50:
			cont = 0;
			primo = true;
			System.out.print("Digite o termo inicial: ");
			int qtd = sc.nextInt();

			System.out.print("Quantidade de termos da sequ�ncia: ");
			int termoSe = sc.nextInt();

			for (int i = qtd; cont < termoSe; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primo = false;
					}
				}
				if (primo == true) {
					System.out.print(i + " ");
					cont++;
				}
				primo = true;
			}
			
			break;
		}

	}

}
