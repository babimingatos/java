package ex_02;

//Barbara Mingatos
class Arvore extends Planta {
	public Arvore(String nome, boolean frutifera) {
		super(nome, frutifera);
	}

	@Override
	public String toString() {
		return "Árvore: " + super.toString();
	}
}
