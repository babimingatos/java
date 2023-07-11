package ex_02;

//Barbara Mingatos
import java.util.ArrayList;
import java.util.List;

class Floresta {
	private List<Planta> plantas;

	public Floresta() {
		plantas = new ArrayList<>();
	}

	public void cadastrarPlanta(Planta planta) {
		plantas.add(planta);
	}

	public void listarPlantas() {
		for (Planta planta : plantas) {
			System.out.println(planta);
		}
	}

	public int getQtdPlantas() {
		return plantas.size();
	}

	public int getQtdArvores() {
		int qtd = 0;
		for (Planta planta : plantas) {
			if (planta instanceof Arvore) {
				qtd++;
			}
		}
		return qtd;
	}

	public int getQtdFlores() {
		int qtd = 0;
		for (Planta planta : plantas) {
			if (planta instanceof Flor) {
				qtd++;
			}
		}
		return qtd;
	}

	public int getQtdCarnivoras() {
		int qtd = 0;
		for (Planta planta : plantas) {
			if (planta instanceof Carnivora) {
				qtd++;
			}
		}
		return qtd;
	}
}