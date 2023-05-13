package ex_03;

public class Ano {
	// Barbara Mingatos

	private int ano;

	public Ano() {
		this.ano = 0;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return this.ano;
	}

	public boolean bissexto() {
		if (this.getAno() % 4 == 0) {
			return true;
		} else if (this.getAno() % 100 != 0) {
			if (this.getAno() % 400 == 0) {
				return true;
			}
		}
		return false;
	}
}