package notas;

public class PrincipalAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.cadastrar();
		aluno.calcularMedia();
		aluno.frequencia();

		aluno.verificarSituacao();

	}
}
