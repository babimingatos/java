package ex_02;

//Barbara Mingatos
class Carnivora extends Planta {
	private boolean venenosa;

	public Carnivora(String nome, boolean frutifera, boolean venenosa) {
		super(nome, frutifera);
		this.venenosa = venenosa;
	}

	public boolean isVenenosa() {
		return venenosa;
	}

	@Override
	public String toString() {
		return "Planta Carnívora: " + super.toString() + ", Venenosa: " + (venenosa ? "Sim" : "Não");
	}
}
