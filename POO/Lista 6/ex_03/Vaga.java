package ex_03;

//Barbara Mingatos
public class Vaga {
	private String descricao;
	private double salario;
	private boolean isContratoTemp;
	private int mesesEstagio;

	public Vaga(String descricao, double salario) {
		this.descricao = descricao;
		this.salario = salario;
	}

	public void setContratoTemp(boolean isContratoTemp) {
		this.isContratoTemp = isContratoTemp;
	}

	public void setMesesEstagio(int mesesEstagio) {
		this.mesesEstagio = mesesEstagio;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getSalario() {
		return salario;
	}

	public boolean isContratoTemp() {
		return isContratoTemp;
	}

	public int getMesesEstagio() {
		return mesesEstagio;
	}
}
