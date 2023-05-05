package ex_01;

public class Lampada {
	// Barbara Mingatos
	
	private String modelo;
	private String tipo;
	private double preco;
	private boolean acesa;

	public Lampada() {
		this.modelo = "";
		this.tipo = "";
		this.preco = 0.0;
		this.acesa = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean getAcesa() {
		return acesa;
	}

	public void setAcesa(boolean acesa) {
		this.acesa = acesa;
	}
}
