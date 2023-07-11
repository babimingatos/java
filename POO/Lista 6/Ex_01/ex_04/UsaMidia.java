package ex_04;

//Barbara Mingatos
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaMidia {
	private static List<Midia> midias = new ArrayList<>();
	private static List<Aluguel> alugueis = new ArrayList<>();
	private static List<Cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean executar = true;
		while (executar) {

			System.out.println("1- Cadastrar mídia");
			System.out.println("2- Alugar mídia");
			System.out.println("3- Pagar aluguéis pendentes");
			System.out.println("4- Exibir aluguéis pendentes");
			System.out.println("5- Exibir mídias cadastradas");
			System.out.println("6- Cadastrar cliente");
			System.out.println("0- Sair");

			int op = sc.nextInt();

			switch (op) {
			case 1:
				cadastrarMidia();
				break;
			case 2:
				alugarMidia();
				break;
			case 3:
				pagarAluguePendentes();
				break;
			case 4:
				exibirAluguePendentes();
				break;
			case 5:
				exibirMidiasCadastradas();
				break;
			case 6:
				cadastrarCliente();
				break;
			case 0:
				executar = false;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	public static void cadastrarMidia() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código da mídia: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite a descrição da mídia: ");
		String descricao = sc.nextLine();

		System.out.print("Digite o gênero da mídia: ");
		String genero = sc.nextLine();

		System.out.print("Digite o valor da mídia: ");
		double valor = sc.nextDouble();

		System.out.println("Escolha o tipo de mídia: \n1- Livro \n2- Jogo\n3- Filme");
		int op = sc.nextInt();
		
		Midia midia;

		switch (op) {
		case 1:
			System.out.print("Digite o autor do livro: ");
			String autor = sc.next();
			sc.nextLine();

			System.out.print("Digite a editora do livro: ");
			String editora = sc.nextLine();

			System.out.print("Digite a edição do livro: ");
			int edicao = sc.nextInt();
			sc.nextLine();
			
			midia = new Livro(codigo, descricao, genero, valor, autor, editora, edicao);
			break;
			
		case 2:
			System.out.print("Digite o console do jogo: ");
			String console = sc.next();
			sc.nextLine();

			midia = new Jogo(codigo, descricao, genero, valor, console);
			break;
			
		case 3:
			System.out.print("Digite a classificação do filme: ");
			String classificacao = sc.next();
			sc.nextLine();

			System.out.print("Digite a duração do filme (em minutos): ");
			int duracao = sc.nextInt();
			sc.nextLine();

			midia = new Filme(codigo, descricao, genero, valor, classificacao, duracao);
			break;
			
		default:
			System.out.println("Opção inválida.");
			return;
		}

		midias.add(midia);
		System.out.println("Mídia cadastrada.");
	}

	public static void exibirMidiasCadastradas() {
		System.out.println("\nMídias cadastradas:");

		for (Midia midia : midias) {
			System.out.println(midia);
		}
	}

	public static void alugarMidia() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nAluguel de Mídia");

		System.out.print("Digite o código da mídia: ");
		int codigoMidia = sc.nextInt();

		Midia midia = buscarMidiaPorCodigo(codigoMidia);
		if (midia == null) {
			System.out.println("Mídia não encontrada.");
			return;
		}

		if (midia.isAlugada()) {
			System.out.println("Mídia já alugada.");
			return;
		}

		System.out.print("Digite o código do cliente: ");
		int codigoCliente = sc.nextInt();
		sc.nextLine();

		Cliente cliente = buscarClienteCodigo(codigoCliente);
		if (cliente == null) {
			System.out.println("Cliente não encontrado.");
			return;
		}

		Aluguel aluguel = new Aluguel(cliente, midia);
		alugueis.add(aluguel);
		midia.setAlugada(true);

		System.out.println("Aluguel realizado.");
	}

	public static void pagarAluguePendentes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPagamento de Aluguéis Pendentes");

		double valorTotal = 0;

		for (Aluguel aluguel : alugueis) {
			if (!aluguel.isPago()) {
				System.out.println(aluguel);
				System.out.print("Pagar este aluguel? (Sim/Não): ");
				String opcao = sc.next();
				if (opcao.equalsIgnoreCase("Sim")) {
					aluguel.setPago(true);
					double valor = aluguel.calcularValor();
					valorTotal += valor;
					System.out.println("Aluguel pago.");
					System.out.println("Valor: R$" + valor);
				}
			}
		}

		System.out.println("Pagamento.");
		System.out.println("Valor: R$" + valorTotal);
	}

	public static void exibirAluguePendentes() {
		System.out.println("\nAluguéis Pendentes:");

		for (Aluguel aluguel : alugueis) {
			if (!aluguel.isPago()) {
				System.out.println(aluguel);
			}
		}
	}

	public static void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do cliente: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		Cliente cliente = new Cliente(codigo, nome);

		if (buscarClienteCodigo(codigo) != null) {
			System.out.println("Cliente já cadastrado.");
			return;
		}
		clientes.add(cliente);

		System.out.println("Cliente cadastrado.");
	}

	public static Cliente buscarClienteCodigo(int codigo) {
		for (Cliente cliente : clientes) {
			if (cliente.getCodigo() == codigo) {
				return cliente;
			}
		}
		return null;
	}

	public static Midia buscarMidiaPorCodigo(int codigo) {
		for (Midia midia : midias) {
			if (midia.getCodigo() == codigo) {
				return midia;
			}
		}
		return null;
	}
}
