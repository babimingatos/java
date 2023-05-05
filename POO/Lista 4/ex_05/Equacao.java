package ex_05;

public class Equacao {
	private double a, b, c;
	private double delta;
	private Double x1, x2;
	private boolean calculada = false;

	// Barbara Mingatos

	public Equacao() {
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getB() {
		return b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getC() {
		return c;
	}

	public double getDelta() {
		if (!calculada) {
			calcular();
		}
		return delta;
	}

	public Double getX1() {
		if (!calculada) {
			calcular();
		}
		return x1;
	}

	public Double getX2() {
		if (!calculada) {
			calcular();
		}
		return x2;
	}

	public boolean raizes() {
		if (!calculada) {
			calcular();
		}
		return x1 != null && x2 != null;
	}

	private void calcular() {
		delta = b * b - 4 * a * c;
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		} else {
			x1 = null;
			x2 = null;
		}
		calculada = true;
	}
}
