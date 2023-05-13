package ex_04;

public class Numero {
	// Barbara Mingatos

	private int numero;

	public Numero() {
		this.numero = numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public int inverte() {
		String numeroString = Integer.toString(getNumero());
		String invertidoString = new StringBuilder(numeroString).reverse().toString();
		int invertido = Integer.parseInt(invertidoString);

		return invertido;
	}
}
