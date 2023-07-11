package ex_02;

//Barbara Mingatos
class Flor extends Planta {
	private String cor;

	public Flor(String nome, boolean frutifera, String cor) {
		super(nome, frutifera);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Flor: " + super.toString() + ", Cor: " + cor;
	}
}