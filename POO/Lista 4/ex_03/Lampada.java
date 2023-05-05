package ex_03;

public class Lampada {
	// Barbara Mingatos
	
	private String estado;

	public Lampada() {
		this.estado = "Apagada";
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void acesa() {
		this.estado = "Acesa";
	}

	public void apagada() {
		this.estado = "Apagada";
	}

	public void meiaLuz() {
		this.estado = "Meia-luz";
	}

}
