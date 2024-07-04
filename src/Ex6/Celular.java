package Ex6;

import Ex2.Produto;

import java.util.ArrayList;
import java.util.List;

public class Celular extends Produto {
    private String marca;
    private String modelo;
    private int armazenamento;
    private List<String> aplicativosInstalados;

    public Celular(String nome, double preco, int quantidadeEmEstoque, String marca, String modelo, int armazenamento, List<String> aplicativosInstalados) {
        super(nome, preco, quantidadeEmEstoque);
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados = aplicativosInstalados != null ? aplicativosInstalados : new ArrayList<>();
    }

    public void instalarAplicativo(String aplicativo) {
        aplicativosInstalados.add(aplicativo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public List<String> getAplicativosInstalados() {
        return aplicativosInstalados;
    }

    public void setAplicativosInstalados(List<String> aplicativosInstalados) {
        this.aplicativosInstalados = aplicativosInstalados;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", armazenamento=" + getArmazenamento() +
                ", aplicativosInstalados=" + getAplicativosInstalados() +
                '}';
    }
}
