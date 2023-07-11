package ex_01;

//Barbara Mingatos
public class Produtos {
	protected static String nome;
	protected double preco;
	protected int qtd;

	public Produtos(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public double calcularValorTotal() {
		return preco * qtd;
	}
}
