package controleBancario;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

	protected double limiteEspecial;

	public ContaCorrente(double saldo, double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public ContaCorrente() {
		this(0.0, 0.0);
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public void debitar(double valor) {
		if ((this.saldo + this.limiteEspecial) >= valor) {
			if (this.saldo >= 0) {
				this.saldo -= valor;
			}

			if (this.saldo <= 0) {
				this.limiteEspecial += this.saldo;
				this.saldo = 0;
				JOptionPane.showMessageDialog(null, "Limite especial: " + this.limiteEspecial);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente: " + this.saldo);
		}
	}

	public void atualizarSaldo(double reajuste) {
		if (this.limiteEspecial < 1000) {
			double juros = (1000 - this.limiteEspecial) * 0.08;
			this.saldo -= juros;
			JOptionPane.showMessageDialog(null, "Juros: " + juros);
		}
	}

}
