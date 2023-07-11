package ex_05;

//Barbara Mingatos
import java.util.ArrayList;
import java.util.List;

class Zoo {
	private List<Animal> animais;

	public Zoo() {
		animais = new ArrayList<>();
	}

	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}

	public void listarAnimais() {
		for (Animal animal : animais) {
			System.out.println("Nome: " + animal.getNome());
			System.out.println("Tipo: " + animal.getTipo());
			System.out.println("Habitat: " + animal.getHabitat());
			System.out.println("Comprimento: " + animal.getComprimento());
			System.out.println("Largura: " + animal.getLargura());
			System.out.println();
		}
	}

	public int getQtdAnimais() {
		return animais.size();
	}

	public int getQtdAnimaisPorTipo(String tipo) {
		int qtd = 0;
		for (Animal animal : animais) {
			if (animal.getTipo().equalsIgnoreCase(tipo)) {
				qtd++;
			}
		}
		return qtd;
	}

	public int getQtdAnimaisPorHabitat(String habitat) {
		int qtd = 0;
		for (Animal animal : animais) {
			if (animal.getHabitat().equalsIgnoreCase(habitat)) {
				qtd++;
			}
		}
		return qtd;
	}

	public double getAreaTotalAnimais() {
		double areaTotal = 0.0;
		for (Animal animal : animais) {
			areaTotal += animal.getComprimento() * animal.getLargura();
		}
		return areaTotal;

	}
}