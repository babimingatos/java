package notas;

import javax.swing.JOptionPane;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	private double numeroFaltas;
	private double numeroAulas;
	private double media;
	private double frequencia;

	public Aluno(String nome, double nota1, double nota2, double numeroFaltas, double numeroAulas, double media,
			double frequencia) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.numeroFaltas = numeroFaltas;
		this.numeroAulas = numeroAulas;
		this.media = media;
		this.frequencia = frequencia;
	}

	public Aluno() {
		this("", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNumeroFaltas() {
		return numeroFaltas;
	}

	public void setNumeroFaltas(double numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

	public double getNumeroAulas() {
		return numeroAulas;
	}

	public void setNumeroAulas(double numeroAulas) {
		this.numeroAulas = numeroAulas;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	// Métodos específicos

	public void cadastrar() {
		this.nome = JOptionPane.showInputDialog("Entre com o nome do aluno:");
		this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a 1ª nota:"));
		this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com a 2ª nota:"));
	}

	public double calcularMedia() {

		this.media = (this.nota1 + this.nota2) / 2;
		return media;
	}

	public void verificarSituacao() {
		if (this.media <= 4.9 || this.frequencia < 75) {
			JOptionPane.showMessageDialog(null,
					"Situação: Reprovado! \nMédia: " + this.media + "\nFrequência: " + this.frequencia+ "% ");
		} else if (this.media <= 6.9 && this.frequencia >= 75) {
			JOptionPane.showMessageDialog(null,
					"Situação: Recuperação! \nMédia: " + this.media + "\nFrequência: " + this.frequencia+ "% ");
		} else {
			JOptionPane.showMessageDialog(null, "Situação: Aprovado! \nMédia: " + this.media + "\nFrequência: " + this.frequencia+ "% ");
		}

	}

	public double frequencia() {
		this.numeroAulas = Double.parseDouble(JOptionPane.showInputDialog("Entre com o número de aulas:"));
		this.numeroFaltas = Double.parseDouble(JOptionPane.showInputDialog("Entre com o  número de faltas:"));
		this.frequencia = this.numeroAulas - this.numeroFaltas;
		this.frequencia = (this.frequencia / this.numeroAulas) * 100;
		return frequencia;
	}

}
