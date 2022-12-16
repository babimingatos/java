package imc04052021;

public class Imc {

	protected double peso;
	protected double altura;
	protected double imc;
	protected String resultado;

	public Imc(double peso, double altura, double imc, String resultado) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.resultado = resultado;
	}

	public Imc() {
		this(0.0, 0.0, 0.0, "");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void calcularImc() {
		setImc(Math.floor(this.peso / Math.pow(this.altura, 2)));
	}

	public void resultado() {
		if (this.imc <= 18.9) {
			this.resultado = "Muito magro";
		} else if (this.imc <= 24.9) {
			this.resultado = "Normal";
		} else if (this.imc <= 29.9) {
			this.resultado = "Sobrepeso";
		} else if (this.imc <= 39.9) {
			this.resultado = "Obeso";
		} else {
			this.resultado = "Obesidade Grave";
		}
	}

}
