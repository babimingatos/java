package ex_04;

//Barbara Mingatos
public class Midia {
	private int codigo;
	private String descricao;
	private String tipo;
	private String genero;
	private double valor;

	public Midia(int codigo, String descricao, String genero, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.genero = genero;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isAlugada() {
		return false;
	}

	public void setAlugada(boolean b) {
	}
}
