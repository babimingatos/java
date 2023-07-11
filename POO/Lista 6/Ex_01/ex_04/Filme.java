package ex_04;

//Barbara Mingatos
public class Filme extends Midia {
	private String classificacao;
	private int duracao;

	public Filme(int codigo, String descricao, String genero, double valor, String classificacao, int duracao) {
		super(codigo, descricao, genero, valor);
		this.classificacao = classificacao;
		this.duracao = duracao;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Filme: " + getDescricao() + ", classificação: " + classificacao + ", duração: " + duracao + " minutos)";
	}
}