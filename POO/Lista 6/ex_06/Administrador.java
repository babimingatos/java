package ex_06;

//Barbara Mingatos
class Administrador {
	private Colegio colegio;

	public Administrador(Colegio colegio) {
		this.colegio = colegio;
	}

	public void rentabilidade() {
		double totalMensalidades = 0;
		double totalSalarios = 0;

		for (Sala sala : colegio.getSalas()) {
			Aluno[] alunos = sala.getAlunos();
			Professor prof = sala.getProfessor();

			for (Aluno aluno : alunos) {
				totalMensalidades += aluno.getMensalidade();
			}

			totalSalarios += prof.getSalario();
		}

		System.out.println("Rentabilidade por Sala:");
		for (Sala sala : colegio.getSalas()) {
			Aluno[] alunos = sala.getAlunos();
			Professor prof = sala.getProfessor();

			double totalMensalidadesSala = 0;
			double totalSalariosSala = prof.getSalario();

			for (Aluno aluno : alunos) {
				totalMensalidadesSala += aluno.getMensalidade();
			}

			System.out.println(
					sala.getNome() + ": Receita - " + totalMensalidadesSala + ", despesa - " + totalSalariosSala);
		}

		System.out.println("Receita total: " + totalMensalidades);
		System.out.println("Despesa total: " + totalSalarios);
	}
}