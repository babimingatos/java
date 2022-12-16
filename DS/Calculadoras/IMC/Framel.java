package imc04052021;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Framel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfPeso;
	private JTextField tfAltura;
	private JTextField tfImc;
	private JTextField tfResultado;

	Imc imc = new Imc();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Framel frame = new Framel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Framel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(480, 100, 341, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblClculoDoImc = new JLabel("C\u00E1lculo do IMC");
		lblClculoDoImc.setHorizontalAlignment(SwingConstants.CENTER);
		lblClculoDoImc.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblClculoDoImc.setBounds(10, 11, 303, 51);
		contentPane.add(lblClculoDoImc);

		JLabel lblDigiteSeuPeso = new JLabel("Digite seu peso:");
		lblDigiteSeuPeso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDigiteSeuPeso.setBounds(10, 90, 162, 37);
		contentPane.add(lblDigiteSeuPeso);

		tfPeso = new JTextField();
		tfPeso.setHorizontalAlignment(SwingConstants.CENTER);
		tfPeso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfPeso.setBounds(207, 90, 106, 37);
		contentPane.add(tfPeso);
		tfPeso.setColumns(10);

		JLabel lblDigiteSuaAltura = new JLabel("Digite sua altura:");
		lblDigiteSuaAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDigiteSuaAltura.setBounds(10, 151, 162, 37);
		contentPane.add(lblDigiteSuaAltura);

		tfAltura = new JTextField();
		tfAltura.setHorizontalAlignment(SwingConstants.CENTER);
		tfAltura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfAltura.setColumns(10);
		tfAltura.setBounds(207, 151, 106, 37);
		contentPane.add(tfAltura);

		JLabel lblImc = new JLabel("IMC:");
		lblImc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblImc.setBounds(10, 218, 162, 37);
		contentPane.add(lblImc);

		tfImc = new JTextField();
		tfImc.setEditable(false);
		tfImc.setHorizontalAlignment(SwingConstants.CENTER);
		tfImc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfImc.setColumns(10);
		tfImc.setBounds(207, 218, 106, 37);
		contentPane.add(tfImc);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBackground(Color.CYAN);
		btnVerificar.setForeground(Color.BLACK);
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pegarDados();
					if (pegarDados()) {
						imc.calcularImc();
						imc.resultado();
						exibir();
						desabilitar();
					}
				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Erro de digitação\n" + erro.getMessage());
					limpar();
				}
			}
		});
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnVerificar.setBounds(10, 282, 303, 37);
		contentPane.add(btnVerificar);

		tfResultado = new JTextField();
		tfResultado.setEditable(false);
		tfResultado.setHorizontalAlignment(SwingConstants.CENTER);
		tfResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfResultado.setColumns(10);
		tfResultado.setBounds(10, 330, 303, 37);
		contentPane.add(tfResultado);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnLimpar.setBounds(10, 386, 129, 37);
		contentPane.add(btnLimpar);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnSair.setBounds(184, 386, 129, 37);
		contentPane.add(btnSair);
	}

	public boolean pegarDados() {
		if ((Double.parseDouble(tfPeso.getText()) == 0) || (Double.parseDouble(tfAltura.getText()) == 0)) {
			limpar();
			return false;
		} else {
			imc.setPeso(Double.parseDouble(tfPeso.getText()));
			imc.setAltura(Double.parseDouble(tfAltura.getText()));
			return true;
		}
	}

	public void exibir() {
		tfImc.setText(String.valueOf(imc.getImc()));
		tfResultado.setText(imc.getResultado());
	}

	public void desabilitar() {
		tfPeso.setEditable(false);
		tfAltura.setEditable(false);
	}

	public void limpar() {
		tfAltura.setText(null);
		tfImc.setText(null);
		tfPeso.setText(null);
		tfResultado.setText(null);
		tfPeso.requestFocus();
		tfPeso.setEditable(true);
		tfAltura.setEditable(true);
	}
}
