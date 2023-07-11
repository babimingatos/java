package ex_03;

//Barbara Mingatos
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaRH {

	private List<Candidato> candidatos;
	private List<Vaga> vagas;

	public static void main(String[] args) {

		UsaRH empresa = new UsaRH();
		Scanner sc = new Scanner(System.in);

		int op = 0;

		do {
			System.out.println("1- Cadastrar candidato");
			System.out.println("2- Cadastrar vaga");
			System.out.println("3- Listar vagas de estágio");
			System.out.println("4- Listar vagas de contrato");
			System.out.println("5- Quantidade de candidatos");
			System.out.println("0- Sair");
			op = sc.nextInt();

			switch (op) {
			case 1:
				empresa.cadastrarCandidato();
				break;
			case 2:
				empresa.cadastrarVaga();
				break;
			case 3:
				empresa.listarVagasPorTipo("estagio");
				break;
			case 4:
				empresa.listarVagasPorTipo("contrato");
				break;
			case 5:
				empresa.qtdCandidatos();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (op != 0);
	}

	public UsaRH() {
		candidatos = new ArrayList<>();
		vagas = new ArrayList<>();
	}

	public void cadastrarCandidato() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastrar novo candidato");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Idade: ");
		int idade = sc.nextInt();

		System.out.print("O candidato está empregado? (S/N): ");
		String empregado = sc.nextLine();

		if (empregado.equalsIgnoreCase("S")) {
			System.out.print("Nome da empresa: ");
			String empresa = sc.nextLine();

			Candidato candidato = new Candidato(nome, idade);
			candidato.setEmpresa(empresa);
			candidatos.add(candidato);
		} else {
			System.out.print("Tempo em meses sem emprego: ");
			int mesesDesempregado = sc.nextInt();

			Candidato candidato = new Candidato(nome, idade);
			candidato.setMesesDesempregado(mesesDesempregado);
			candidatos.add(candidato);
		}

		System.out.println("Candidato cadastrado!");
	}

	public void cadastrarVaga() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastrar vaga ");
		System.out.print("Descrição: ");
		String descricao = sc.nextLine();

		System.out.print("Salário oferecido: ");
		double salario = sc.nextDouble();

		System.out.print("A vaga é um contrato? (S/N): ");
		String temp = sc.nextLine();

		if (temp.equalsIgnoreCase("S")) {
			Vaga vaga = new Vaga(descricao, salario);
			vaga.setContratoTemp(true);
			vagas.add(vaga);
		} else {
			System.out.print("A vaga é de estágio? (S/N): ");
			temp = sc.nextLine();

			if (temp.equalsIgnoreCase("S")) {
				System.out.print("Tempo em meses de estágio: ");
				int mesesEstagio = sc.nextInt();

				Vaga vaga = new Vaga(descricao, salario);
				vaga.setMesesEstagio(mesesEstagio);
				vagas.add(vaga);
			} else {
				Vaga vaga = new Vaga(descricao, salario);
				vagas.add(vaga);
			}
		}

		System.out.println("Vaga cadastrada!");
	}

	public void listarVagasPorTipo(String tipo) {
		System.out.println("Vagas de " + tipo + ": ");

		for (Vaga vaga : vagas) {
			if (tipo.equalsIgnoreCase("estagio") && vaga.getMesesEstagio() > 0 && !vaga.isContratoTemp()) {
				System.out.println("Descrição: " + vaga.getDescricao());
				System.out.println("Salário: " + vaga.getSalario());
				System.out.println("Tempo em meses de estágio: " + vaga.getMesesEstagio());

			} else if (tipo.equalsIgnoreCase("contrato") && vaga.isContratoTemp()) {
				System.out.println("Descrição: " + vaga.getDescricao());
				System.out.println("Salário: " + vaga.getSalario());

			}
		}
	}

	public void qtdCandidatos() {
		int total = candidatos.size();
		int qtdEmpregados = 0;
		int qtdDesempregados = 0;

		for (Candidato candidato : candidatos) {
			if (candidato.getEmpresa() != null) {
				qtdEmpregados++;
			} else {
				qtdDesempregados++;
			}
			System.out.println("Total: " + total);
			System.out.println("Empregados: " + qtdEmpregados);
			System.out.println("Desempregados: " + qtdDesempregados);
		}
	}
}
