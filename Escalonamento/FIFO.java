package so;

import java.util.*;

public class FIFO {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numprocessos;
		int tempoTotal = 0;
		int tempoEspera = 0;
		int tempoTurnaround = 0;

		ArrayList<Integer[]> listaprocesso = new ArrayList<>(); // Cada array é um processo

		System.out.print("Digite o número de processos: ");
		numprocessos = sc.nextInt();

		System.out.println("Digite o tempo de chegada e o tempo de execução de cada processo:");

		for (int i = 0; i < numprocessos; i++) {
			Integer[] processos = new Integer[3];
			processos[0] = i + 1;// Num processo
			processos[1] = sc.nextInt();// Chegada
			processos[2] = sc.nextInt(); // Execução
			listaprocesso.add(processos);
		}

		Collections.sort(listaprocesso, Comparator.comparingInt(p -> p[1])); // Ordena a lista de processos com base no tempo de chegada

		for (Integer[] processos : listaprocesso) {
			tempoEspera += tempoTotal - processos[1];
			tempoTurnaround += tempoTotal + processos[2] - processos[1];
			tempoTotal += processos[2];
		} // os valores dos elementos do array processos são usados para realizar os
			// cálculos dos tempos

		double tme = (double) tempoEspera / numprocessos;
		double tmp = (double) tempoTurnaround / numprocessos;

		System.out.println("TME: " + tme);
		System.out.println("TMP: " + tmp);
	}
}
