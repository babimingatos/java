package so;

import java.util.*;

public class SJF {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de processos: ");
		int n = sc.nextInt();

		int numdoProcesso[] = new int[n]; // Número do processo
		int tempoFin[] = new int[n]; // Tempo de finalização
		int tempoChegada[] = new int[n];
		int tempoUCP[] = new int[n];
		int tempoturnaround[] = new int[n];
		int tempoEspera[] = new int[n];
		int completoounao[] = new int[n]; // Checar se o processo está completo ou não
		int sistempo = 0; // Tempo atual do sistema
		int qtdProcessos = 0;
		float tme = 0;
		float tmp = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("Tempo de chegada do processo " + (i + 1) + ": ");
			tempoChegada[i] = sc.nextInt();

			System.out.print("Tempo de UCP do processo " + (i + 1) + ": ");
			tempoUCP[i] = sc.nextInt();

			numdoProcesso[i] = i + 1;
			completoounao[i] = 0;
		}

		while (true) {
			int c = n; // C guarda o menor processo
			int min = 999; // Processo com o menor tempo de execução restante atualmente

			if (qtdProcessos == n)
				break;

			for (int i = 0; i < n; i++) { // Percorre todos os processos e seleciona o que tem o menor T.E. restante
				if ((tempoChegada[i] <= sistempo) // verifica se o processo já chegou na fila de execução
						&& (completoounao[i] == 0) // verifica se o processo ainda não foi executado
						&& (tempoUCP[i] < min)) {// verifica se o T.E restante do processo atual é menor do que o T.E
													// restante do processo com o menor T.E atual
					min = tempoUCP[i]; // Armazena T.E restante
					c = i; // Armazena o indice do processo
				}
			}

			if (c == n) // Garante que todos os processos sejam executados e finalizados
				sistempo++;
			else {
				tempoFin[c] = sistempo + tempoUCP[c]; // Calcular tempo de finalização
				sistempo += tempoUCP[c];// Atualiza a sistempo com o TE restante
				tempoturnaround[c] = tempoFin[c] - tempoChegada[c];
				tempoEspera[c] = tempoturnaround[c] - tempoUCP[c];
				completoounao[c] = 1;
				qtdProcessos++;// Finalizados
			}
		}

		for (int i = 0; i < n; i++) {
			tme += tempoEspera[i];
			tmp += tempoturnaround[i];
		}

		System.out.println("\nTMP: " + (float) (tmp / n));
		System.out.println("TME: " + (float) (tme / n));
	}
}
