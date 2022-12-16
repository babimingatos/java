package controleBancario;

import javax.swing.JOptionPane;

public class Conta {

	protected double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public Conta() {
		this(0.0);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualizarSaldo(double reajuste) {

	}

	public void creditar(double valor) {
		if (verificarValorPositivo(valor)) {
			this.saldo += valor;
		} else {
			JOptionPane.showMessageDialog(null, "O depósito não pode ser zero ou negativo.");
		}
	}

	public boolean verificarValorPositivo(double valor) {
		if (valor > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, "Saldo: " + this.saldo);
		} else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente: " + this.saldo);
		}
	}

}
