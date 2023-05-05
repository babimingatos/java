package ex_07;

public class Computador {

	// Barbara Mingatos

	private double placamae;
	private double proc;
	private double memoria;
	private double disco;
	private double monitor;

	public Computador() {
		this.proc = 0.0;
		this.placamae = 0.0;
		this.memoria = 0.0;
		this.disco = 0.0;
		this.monitor = 0.0;
	}

	public void setPlacamae(double placamae) {
		this.placamae = placamae;
	}

	public double getPlacamae() {
		return this.placamae;
	}

	public void setProc(double proc) {
		this.proc = proc;
	}

	public double getProc() {
		return this.proc;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getMemoria() {
		return this.memoria;
	}

	public void setDisco(double disco) {
		this.disco = disco;
	}

	public double getDisco() {
		return this.disco;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

	public double getMonitor() {
		return this.monitor;
	}

	public double soma() {
		return getPlacamae() + getProc() + getMemoria() + getDisco() + getMonitor();
	}
}
