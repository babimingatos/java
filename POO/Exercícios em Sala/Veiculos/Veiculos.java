package veiculos;

public class Veiculos {

    private String placa;
    private String marca;
    private double modelo;
    private int ano;
    private double valorkmrod;
    private int kminc;
    private int kmfim;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;

    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public double getModelo() {
        return modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setValorkmrod(double valorkmrod) {
        this.valorkmrod = valorkmrod;
    }

    public double getValorkmrod() {
        return valorkmrod;
    }

}
