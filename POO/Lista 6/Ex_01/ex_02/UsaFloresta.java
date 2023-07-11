package ex_02;

//Barbara Mingatos
import java.util.Scanner;

public class UsaFloresta {
	public static void main(String[] args) {

		Floresta floresta = new Floresta();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1- Cadastrar planta");
			System.out.println("2- Listar plantas");
			System.out.println("3- Quantidade de plantas na floresta");
			System.out.println("4- Quantidade de cada tipo de planta");
			System.out.println("5- Sair: ");

			int op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.println("Tipo de planta: \n1- Árvore \n2- Flor\n3- Carnívora");
				int tipoPlanta = sc.nextInt();
				sc.nextLine();

				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("É frutífera? (Sim/Não): ");
				boolean frutifera = sc.nextLine().equalsIgnoreCase("Sim");

				switch (tipoPlanta) {
				case 1:
					Arvore arvore = new Arvore(nome, frutifera);
					floresta.cadastrarPlanta(arvore);
					break;

				case 2:
					System.out.print("Cor da flor: ");
					String corFlor = sc.nextLine();

					Flor flor = new Flor(nome, frutifera, corFlor);
					floresta.cadastrarPlanta(flor);
					break;

				case 3:
					System.out.print("É venenosa? (Sim/Não): ");
					boolean venenosa = sc.nextLine().equalsIgnoreCase("Sim");

					Carnivora carnivora = new Carnivora(nome, frutifera, venenosa);
					floresta.cadastrarPlanta(carnivora);
					break;

				default:
					System.out.println("Opção inválida.");
					break;
				}
				break;

			case 2:
				System.out.println("Plantas: ");
				floresta.listarPlantas();
				break;

			case 3:
				System.out.println("Quantidade de plantas na floresta: " + floresta.getQtdPlantas());
				break;

			case 4:
				System.out.println("Quantidade de Árvores: " + floresta.getQtdArvores());
				System.out.println("Quantidade de Flores: " + floresta.getQtdFlores());
				System.out.println("Quantidade de Plantas Carnívoras: " + floresta.getQtdCarnivoras());
				break;

			case 5:
				return;
			}
		}
	}
}
