package ex_06;

//Barbara Mingatos
class Professor extends Pessoa {
	private double salario;

	public Professor(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + ", salário: " + salario;
	}
}