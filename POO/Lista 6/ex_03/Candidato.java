package ex_03;

//Barbara Mingatos
public class Candidato {

	private String nome;
	private int idade;
	private String empresa;
	private int mesesDesempregado;

	public Candidato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getMesesDesempregado() {
		return mesesDesempregado;
	}

	public void setMesesDesempregado(int mesesDesempregado) {
		this.mesesDesempregado = mesesDesempregado;
	}

}
