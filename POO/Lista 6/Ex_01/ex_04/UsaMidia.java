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

			System.out.println("1- Cadastrar m�dia");
			System.out.println("2- Alugar m�dia");
			System.out.println("3- Pagar alugu�is pendentes");
			System.out.println("4- Exibir alugu�is pendentes");
			System.out.println("5- Exibir m�dias cadastradas");
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
				System.out.println("Op��o inv�lida.");
			}
		}
	}

	public static void cadastrarMidia() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o c�digo da m�dia: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite a descri��o da m�dia: ");
		String descricao = sc.nextLine();

		System.out.print("Digite o g�nero da m�dia: ");
		String genero = sc.nextLine();

		System.out.print("Digite o valor da m�dia: ");
		double valor = sc.nextDouble();

		System.out.println("Escolha o tipo de m�dia: \n1- Livro \n2- Jogo\n3- Filme");
		int op = sc.nextInt();
		
		Midia midia;

		switch (op) {
		case 1:
			System.out.print("Digite o autor do livro: ");
			String autor = sc.next();
			sc.nextLine();

			System.out.print("Digite a editora do livro: ");
			String editora = sc.nextLine();

			System.out.print("Digite a edi��o do livro: ");
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
			System.out.print("Digite a classifica��o do filme: ");
			String classificacao = sc.next();
			sc.nextLine();

			System.out.print("Digite a dura��o do filme (em minutos): ");
			int duracao = sc.nextInt();
			sc.nextLine();

			midia = new Filme(codigo, descricao, genero, valor, classificacao, duracao);
			break;
			
		default:
			System.out.println("Op��o inv�lida.");
			return;
		}

		midias.add(midia);
		System.out.println("M�dia cadastrada.");
	}

	public static void exibirMidiasCadastradas() {
		System.out.println("\nM�dias cadastradas:");

		for (Midia midia : midias) {
			System.out.println(midia);
		}
	}

	public static void alugarMidia() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nAluguel de M�dia");

		System.out.print("Digite o c�digo da m�dia: ");
		int codigoMidia = sc.nextInt();

		Midia midia = buscarMidiaPorCodigo(codigoMidia);
		if (midia == null) {
			System.out.println("M�dia n�o encontrada.");
			return;
		}

		if (midia.isAlugada()) {
			System.out.println("M�dia j� alugada.");
			return;
		}

		System.out.print("Digite o c�digo do cliente: ");
		int codigoCliente = sc.nextInt();
		sc.nextLine();

		Cliente cliente = buscarClienteCodigo(codigoCliente);
		if (cliente == null) {
			System.out.println("Cliente n�o encontrado.");
			return;
		}

		Aluguel aluguel = new Aluguel(cliente, midia);
		alugueis.add(aluguel);
		midia.setAlugada(true);

		System.out.println("Aluguel realizado.");
	}

	public static void pagarAluguePendentes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPagamento de Alugu�is Pendentes");

		double valorTotal = 0;

		for (Aluguel aluguel : alugueis) {
			if (!aluguel.isPago()) {
				System.out.println(aluguel);
				System.out.print("Pagar este aluguel? (Sim/N�o): ");
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
		System.out.println("\nAlugu�is Pendentes:");

		for (Aluguel aluguel : alugueis) {
			if (!aluguel.isPago()) {
				System.out.println(aluguel);
			}
		}
	}

	public static void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o c�digo do cliente: ");
		int codigo = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		Cliente cliente = new Cliente(codigo, nome);

		if (buscarClienteCodigo(codigo) != null) {
			System.out.println("Cliente j� cadastrado.");
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
