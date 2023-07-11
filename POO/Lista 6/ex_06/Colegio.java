package ex_06;

//Barbara Mingatos
import java.util.Arrays;

class Colegio {
	private Sala[] salas;

	public Colegio() {
		this.setSalas(new Sala[0]);
	}

	public void cadastrarSala(Sala sala) {
		Sala[] newSalas = Arrays.copyOf(getSalas(), getSalas().length + 1);
		newSalas[getSalas().length] = sala;
		setSalas(newSalas);
	}

	public void listarSalas() {
		for (Sala sala : getSalas()) {
			System.out.println(sala);
		}
	}

	public Sala[] getSalas() {
		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}
}
