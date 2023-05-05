package ex_06;

//Barbara Mingatos

public class Data {

	private int dia1;
	private int mes1;
	private int ano1;
	private int data1;
	private int dia2;
	private int mes2;
	private int ano2;
	private int data2;

	public Data() {
		this.dia1 = 0;
		this.mes1 = 0;
		this.ano1 = 0;
		this.dia2 = 0;
		this.mes2 = 0;
		this.ano2 = 0;
	}

	public int getDia1() {
		return this.dia1;
	}

	public void setDia1(int dia1) {
		this.dia1 = dia1;
	}

	public int getMes1() {
		return this.mes1;
	}

	public void setMes1(int mes1) {
		this.mes1 = mes1;
	}

	public int getAno1() {
		return this.ano1;
	}

	public void setAno1(int ano1) {
		this.ano1 = ano1;
	}

	public int getData1() {
		return this.data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public int getDia2() {
		return this.dia2;
	}

	public void setDia2(int dia2) {
		this.dia2 = dia2;
	}

	public int getMes2() {
		return this.mes2;
	}

	public void setMes2(int mes2) {
		this.mes2 = mes2;
	}

	public int getAno2() {
		return this.ano2;
	}

	public void setAno2(int ano2) {
		this.ano2 = ano2;
	}

	public int getData2() {
		return this.data2;
	}

	public void setData2(int data2) {
		this.data2 = data2;
	}

	public boolean ok1() {
		return dia1 >= 1 && dia1 <= 31 && mes1 >= 1 && mes1 <= 12 && ano1 > 0;
	}

	public boolean ok2() {
		return dia2 >= 1 && dia2 <= 31 && mes2 >= 1 && mes2 <= 12 && ano2 > 0;
	}

	public boolean iguais() {
		boolean iguais = false;
		if (dia1 == dia2 && mes1 == mes2 && ano1 == ano2) {
			iguais = true;
		}
		return iguais;
	}

	public int dif() {
		if (!iguais()) {
			int max = Math.max(getDia1(), getDia2());
			int min = Math.min(getDia1(), getDia2());
			int dif = max - min;
			return dif;
		}
		return 0;
	}
}
