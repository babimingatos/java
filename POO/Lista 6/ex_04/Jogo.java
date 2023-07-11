package ex_04;

//Barbara Mingatos
public class Jogo extends Midia {
	private String console;

	public Jogo(int codigo, String descricao, String genero, double valor, String console) {
		super(codigo, descricao, genero, valor);
		this.console = console;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	@Override
	public String toString() {
		return "Jogo: " + getDescricao() + ", console: " + console;
	}
}