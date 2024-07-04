package Ex5;

public class Casa {
    private Endereco endereco;
    private int numeroQuartos;
    private double area;
    private double valor;

    public Casa(Endereco endereco, int numeroQuartos, double area, double valor) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
        this.valor = valor;
    }

    public double calcularImposto(double taxaImposto) {
        double imposto = valor * taxaImposto;
        return imposto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "endereco=" + getEndereco() +
                ", numeroQuartos=" + getNumeroQuartos() +
                ", area=" + getArea() +
                ", valor=" + getValor() +
                '}';
    }
}

