package ex_01;

//Barbara Mingatos
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Produtos> produtos;

	public Pedido() {
		produtos = new ArrayList<>();
	}

	public void adcProduto(Produtos produto) {
		produtos.add(produto);
	}

	public double totalDoPedido() {
		double valorTotal = 0;
		for (Produtos produto : produtos) {
			valorTotal += produto.calcularValorTotal();
		}
		return valorTotal;
	}
}
