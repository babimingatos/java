package ex_02;

public class Calculadora {
	// Barbara Mingatos

	private int num1;
	private int num2;

	public Calculadora() {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum1() {
		return this.num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum2() {
		return this.num2;
	}

	public int somar() {
		return this.num1 + this.num2;
	}

	public int subtrair() {
		return this.num1 - this.num2;
	}

	public int multiplicar() {
		return this.num1 * this.num2;
	}

	public double dividir() {
		return this.num1 / this.num2;
	}
}
