package ex_04;

//Barbara Mingatos
public class Livro extends Midia {
	private String autor;
	private String editora;
	private int edicao;

	public Livro(int codigo, String descricao, String genero, double valor, String autor, String editora, int edicao) {
		super(codigo, descricao, genero, valor);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "Livro: " + getDescricao() + ", autor: " + autor + ", editora: " + editora + ", edição: " + edicao;
	}
}