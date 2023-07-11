package ex_01;

//Barbara Mingatos
import java.util.Scanner;

public class UsaProduto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pedido pedido = new Pedido();
		int continuar = 0;

		do {
			System.out.print("1- Frios, 2- Pães, 3- Doces: ");
			int tipo = sc.nextInt();

			System.out.print("Quantidade: ");
			int qtd = sc.nextInt();
			
			System.out.print("Preço unitário: ");
			double preco = sc.nextDouble();

			Produtos produto;

			switch (tipo) {
			case 1:
				produto = new Frios(preco, qtd);
				break;
			case 2:
				produto = new Paes(preco, qtd);
				break;
			case 3:
				produto = new Doces(preco, qtd);
				break;
			default:
				System.out
						.println("Tipo inválido (1- Frios, 2- Pães, 3- Doces)");
				continue;
			}

			pedido.adcProduto(produto);

			System.out.print("Deseja adicionar mais? 1- SIM 0- NÃO ");
			continuar = sc.nextInt();

		} while (continuar != 0);

		double valorTotal = pedido.totalDoPedido();
		System.out.println("Valor total do pedido: R$" + valorTotal);
	}
}
