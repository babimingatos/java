package ex_02;

//Barbara Mingatos
class Planta {
	private String nome;
	private boolean frutifera;

	public Planta(String nome, boolean frutifera) {
		this.nome = nome;
		this.frutifera = frutifera;
	}

	public String getNome() {
		return nome;
	}

	public boolean isFrutifera() {
		return frutifera;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Frutífera: " + (frutifera ? "Sim" : "Não");
	}
}