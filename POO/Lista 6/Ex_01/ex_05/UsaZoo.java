package ex_05;

//Barbara Mingatos
import java.util.Scanner;

public class UsaZoo {
	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		Scanner sc = new Scanner(System.in);
		int op = 0;

		while (op != 7) {
			System.out.println("1- Cadastrar animal");
			System.out.println("2- Listar animais");
			System.out.println("3- Quantidade de animais no Zoo");
			System.out.println("4- Quantidade de animais por tipo");
			System.out.println("5- Quantidade de animais por habitat");
			System.out.println("6- �rea total ocupada pelos animais");
			System.out.println("7- Sair");

			op = sc.nextInt();
			sc.nextLine();

			switch (op) {
			case 1:
				System.out.print("Nome do animal: ");
				String nome = sc.nextLine();

				System.out.println("Tipo do animal: \n 1- Voador \n 2- Terrestre\n 3- Aqu�tico");
				int tipoOpcao = sc.nextInt();

				String tipo;

				switch (tipoOpcao) {
				case 1:
					tipo = "Voador";
					break;
				case 2:
					tipo = "Terrestre";
					break;
				case 3:
					tipo = "Aqu�tico";
					break;
				default:
					System.out.println("Op��o inv�lida");
					tipo = "Desconhecido";
					break;
				}

				System.out.println(
						"Escolha o habitat do animal: \n 1- Jaula \n 2- Gaiola\n 3- Aqu�rio\n 4- Lago\n 5- Viveiro");
				int habitatOpcao = sc.nextInt();
				String habitat;

				switch (habitatOpcao) {
				case 1:
					habitat = "Jaula";
					break;
				case 2:
					habitat = "Gaiola";
					break;
				case 3:
					habitat = "Aqu�rio";
					break;
				case 4:
					habitat = "Lago";
					break;
				case 5:
					habitat = "Viveiro";
					break;
				default:
					System.out.println("Op��o inv�lida! Definindo como 'Desconhecido'.");
					habitat = "Desconhecido";
					break;
				}

				System.out.print("Comprimento do animal: ");
				double comprimento = sc.nextDouble();

				System.out.print("Largura do animal: ");
				double largura = sc.nextDouble();

				Animal animal = new Animal(nome, tipo, habitat, comprimento, largura);
				zoo.cadastrarAnimal(animal);

				System.out.println("Animal cadastrado!");
				break;

			case 2:
				zoo.listarAnimais();
				break;

			case 3:
				int qtdAnimais = zoo.getQtdAnimais();
				System.out.println("Quantidade de animais no Zoo: " + qtdAnimais);
				break;

			case 4:
				System.out.println("Escolha o tipo de animal: \n1- Voador \n2- Terrestre \n3- Aqu�tico");
				int tipoAnimaisOpcao = sc.nextInt();
				String tipoAnimais;
				switch (tipoAnimaisOpcao) {
				case 1:
					tipoAnimais = "Voador";
					break;
				case 2:
					tipoAnimais = "Terrestre";
					break;
				case 3:
					tipoAnimais = "Aqu�tico";
					break;
				default:
					System.out.println("Op��o inv�lida! Usando 'Desconhecido'.");
					tipoAnimais = "Desconhecido";
					break;
				}

				int qtdAnimaisTipo = zoo.getQtdAnimaisPorTipo(tipoAnimais);
				System.out.println("Quantidade de animais do tipo " + tipoAnimais + ": " + qtdAnimaisTipo);
				break;

			case 5:
				System.out.println("Escolha o habitat: \n 1- Jaula \n 2- Gaiola\n 3- Aqu�rio\n 4- Lago\n - Viveiro");
				int habitatAnimaisOpcao = sc.nextInt();
				String habitatAnimais;

				switch (habitatAnimaisOpcao) {
				case 1:
					habitatAnimais = "Jaula";
					break;
				case 2:
					habitatAnimais = "Gaiola";
					break;
				case 3:
					habitatAnimais = "Aqu�rio";
					break;
				case 4:
					habitatAnimais = "Lago";
					break;
				case 5:
					habitatAnimais = "Viveiro";
					break;
				default:
					System.out.println("Op��o inv�lida!");
					habitatAnimais = "Desconhecido";
					break;
				}

				int qtdAnimaisHabitat = zoo.getQtdAnimaisPorHabitat(habitatAnimais);
				System.out.println("Quantidade de animais no habitat " + habitatAnimais + ": " + qtdAnimaisHabitat);
				break;

			case 6:
				double areaTotalAnimais = zoo.getAreaTotalAnimais();
				System.out.println("�rea total ocupada pelos animais: " + areaTotalAnimais);
				break;
			case 7:
				break;

			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}
	}
}