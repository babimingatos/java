package ex_04;

	//Barbara Mingatos

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private int data;

	public Data() {
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean ok() {
		return dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano > 0;
	}

}
