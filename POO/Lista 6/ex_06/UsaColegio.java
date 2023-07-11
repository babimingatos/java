package ex_06;

//Barbara Mingatos
import java.util.Scanner;

public class UsaColegio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Colegio colegio = new Colegio();

		int op = 0;

		while (op != 4) {
			System.out.println("1- Cadastrar Sala");
			System.out.println("2- Listar Salas");
			System.out.println("3- Verificar Rentabilidade");
			System.out.println("4- Sair");
			System.out.print("Digite a opção desejada: ");
			op = sc.nextInt();

			sc.nextLine();

			switch (op) {
			case 1:
				cadastrarSala(colegio);
				break;

			case 2:
				listarSalas(colegio);
				break;

			case 3:
				rentabilidade(colegio);
				break;

			case 4:
				break;

			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

	public static void cadastrarSala(Colegio colegio) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da sala: ");
		String nomeSala = sc.nextLine();

		System.out.println("1- Fundamental");
		System.out.println("2- Médio");
		System.out.println("3- Infantil");
		int tipoCurso = sc.nextInt();
		sc.nextLine();

		String cursoSala;

		switch (tipoCurso) {
		case 1:
			cursoSala = "Fundamental";
			break;

		case 2:
			cursoSala = "Médio";
			break;

		case 3:
			cursoSala = "Infantil";
			break;

		default:
			System.out.print("Digite o curso da sala: ");
			cursoSala = sc.nextLine();
			break;
		}

		System.out.print("Digite a quantidade de alunos na sala: ");
		int qtdAlunos = sc.nextInt();
		sc.nextLine();

		Aluno[] alunos = new Aluno[qtdAlunos];
		for (int i = 0; i < qtdAlunos; i++) {
			System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
			String nome = sc.nextLine();

			System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
			int idade = sc.nextInt();
			sc.nextLine();

			System.out.print("Digite a mensalidade do aluno " + (i + 1) + ": ");
			double mensalidade = sc.nextDouble();
			sc.nextLine();

			alunos[i] = new Aluno(nome, idade, cursoSala, mensalidade);
		}

		System.out.print("Digite o nome do professor: ");
		String nomeProfessor = sc.nextLine();

		System.out.print("Digite a idade do professor: ");
		int idadeProfessor = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite o salário do professor: ");
		double salarioProfessor = sc.nextDouble();
		sc.nextLine();

		Professor professor = new Professor(nomeProfessor, idadeProfessor, salarioProfessor);

		Sala sala1 = new Sala(nomeSala, alunos, professor);

		colegio.cadastrarSala(sala1);

		System.out.println("Sala cadastrada com sucesso!");
		System.out.println();
	}

	public static void listarSalas(Colegio colegio) {
		colegio.listarSalas();
		System.out.println();
	}

	public static void rentabilidade(Colegio colegio) {
		Administrador adm = new Administrador(colegio);
		adm.rentabilidade();
		System.out.println();
	}
}
