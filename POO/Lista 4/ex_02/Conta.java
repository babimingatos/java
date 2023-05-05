package ex_02;

//Barbara Mingatos

public class Conta {

	private int qtd;
	private double valor;
	private boolean garcom;

	public Conta() {
		this.qtd = 0;
		this.valor = 0.0;
		this.garcom = false;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean getGarcom() {
		return garcom;
	}

	public void setGarcom(boolean garcom) {
		this.garcom = garcom;
	}

	public double getValorTotal() {
		if (garcom) {
			return (this.valor * 1.1) / 2;
		} else {
			return this.valor / this.getQtd();
		}
	}
}
