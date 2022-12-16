package controleBancario;

import javax.swing.JOptionPane;

public class Movimentacao {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(500, 1000);
		ContaPoupanca cp1 = new ContaPoupanca(5000, 0.01);

		int op;
		int opcc = 0;
		int opp = 0;
		do {

			op = Integer.parseInt(
					JOptionPane.showInputDialog("1 - Conta Corrente " + "\n2 - ContaPoupanca" + "\n0 - Sair"));
			switch (op) {
			case 1:
				do {
					opcc = Integer.parseInt(JOptionPane
							.showInputDialog("Movimentação da Conta Corrente: " + "\n1 - Sacar " + "\n2 - Depositar"
									+ "\n3 - Consultar Saldo" + "\n4 - Atualizar Saldo" + "\n0 - Sair"));
					switch (opcc) {
					case 1:
						cc1.debitar(
								Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser Sacado:")));
						break;
					case 2:
						cc1.creditar(Double
								.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser Depositado:")));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "O Saldo atual é de: " + cc1.getSaldo() + "\n"
								+ "Limite de Especial: " + cc1.getLimiteEspecial());
						break;
					case 4:
						cc1.atualizarSaldo(0.08);
					case 0:
						break;
					default:
						JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
						break;
					}
				} while (opcc != 0);
				break;
			case 2:
				do {
					opp = Integer.parseInt(JOptionPane
							.showInputDialog("Movimentação da Conta Poupança: " + "\n1 - Sacar " + "\n2 - Depositar"
									+ "\n3 - Consultar Saldo" + "\n4 - Atualizar Saldo" + "\n0 - Sair"));
					switch (opp) {
					case 1:
						cp1.debitar(
								Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser Sacado:")));
						break;
					case 2:
						cp1.creditar(Double
								.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser Depositado:")));
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "O Saldo atual é de: " + String.valueOf(cp1.getSaldo()));
						break;
					case 0:
						break;
					case 4:
						cp1.reajustarSaldo(
								Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do reajuste mensal")));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
					}
				} while (opp != 0);
				break;
			case 0:
				break;
			default:
				JOptionPane.showInternalMessageDialog(null, "Digite uma Opção válida");
				break;
			}
		} while (op != 0);

	}
}
