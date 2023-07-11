package ex_04;

//Barbara Mingatos
public class Aluguel {
	private Cliente cliente;
	private Midia midia;
	private boolean pago;

	public Aluguel(Cliente cliente, Midia midia) {
		this.cliente = cliente;
		this.midia = midia;
		this.pago = false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Midia getMidia() {
		return midia;
	}

	public void setMidia(Midia midia) {
		this.midia = midia;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double calcularValor() {
		if (midia.getTipo().equalsIgnoreCase("LIVRO")) {
			Livro livro = (Livro) midia;
			return livro.getValor();
		} else {
			return midia.getValor();
		}
	}

	@Override
	public String toString() {
		return "C�digo do cliente: " + cliente.getCodigo() + ", nome do cliente: " + cliente.getNome()
				+ ", c�digo da m�dia: " + midia.getCodigo() + ", descri��o da m�dia: " + midia.getDescricao();
	}
}