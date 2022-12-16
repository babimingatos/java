package lista06_fatec;

import java.util.Scanner;

public class Primos46A50 {

	public static void main(String args[]) {
		/*Barbara Mingatos
		 * 46)Solicite ao usuário um número e verifique se este número é primo ou não.
		 * 47) Imprima somente os números primos existentes na faixa de um 1 até 100.
		 * 48) Solicite ao usuário a quantidade de termos da sequência de números primos
		 * e imprima o resultado. 49) Solicite ao usuário a quantidade de termos da
		 * sequência de números primos e imprima a sequência do final para o início. 
		 * 50) Solicite ao usuário o termo inicial e a quantidade de termos da sequência de
		 * números primos e imprima o resultado
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o exercicio desejado: ");
		int exercicio = sc.nextInt();

		switch (exercicio) {

		case 46:
			System.out.print("Digite um número: ");
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
				System.out.print(num + " é primo");
			}
			if (primo == false) {
				System.out.print(num + " não é primo");
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

			System.out.print("Quantidade de termos da sequência: ");
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
