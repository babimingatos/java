package ex_05;

//Barbara Mingatos
class Animal {
	private String nome;
	private String tipo;
	private String habitat;
	private double comprimento;
	private double largura;

	public Animal(String nome, String tipo, String habitat, double comprimento, double largura) {
		this.nome = nome;
		this.tipo = tipo;
		this.habitat = habitat;
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
}