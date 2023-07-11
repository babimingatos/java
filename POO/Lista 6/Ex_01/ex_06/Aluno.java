package ex_06;

//Barbara Mingatos
class Aluno extends Pessoa {
	private String curso;
	private double mensalidade;

	public Aluno(String nome, int idade, String curso, double mensalidade) {
		super(nome, idade);
		this.curso = curso;
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	@Override
	public String toString() {
		return super.toString() + ", curso: " + curso + ", mensalidade: " + mensalidade;
	}
}