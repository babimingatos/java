package ex_06;

//Barbara Mingatos
import java.util.Arrays;

class Sala {
	private String nome;
	private int qtdPessoas;
	private Aluno[] alunos;
	private Professor professor;

	public Sala(String nome, Aluno[] alunos, Professor professor) {
		this.nome = nome;
		this.alunos = alunos;
		this.professor = professor;
		this.qtdPessoas = alunos.length + 1;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sala: ").append(nome).append(", quantidade de Pessoas: ").append(qtdPessoas);
		sb.append("\nProfessor: ").append(professor);
		sb.append("\nAlunos: ").append(Arrays.toString(alunos));
		return sb.toString();
	}
}