package controleBancario;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

	protected double reajusteMensal;

	public ContaPoupanca(double saldo, double reajusteMensal) {
		super(saldo);
		this.reajusteMensal = reajusteMensal;
	}

	public ContaPoupanca() {
		this(0.0, 0.0);
	}

	public double getReajusteMensal() {
		return reajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}

	public void reajustarSaldo(double reajuste) {
		double saldoAnterior = this.saldo;
		this.reajusteMensal = this.saldo * reajuste / 100;
		this.saldo += this.reajusteMensal;
		JOptionPane.showMessageDialog(null, "Saldo anterior: " + saldoAnterior + "\nRendimento mensal: "
				+ this.reajusteMensal + "\nSaldo atual: " + this.saldo);

	}

}
