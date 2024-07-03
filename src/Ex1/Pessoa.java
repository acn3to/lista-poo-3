package Ex1;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    protected Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected double getAltura() {
        return altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected void envelhecer(int anos) {
        this.idade += anos;
    }

    protected void engordar(double quantidade) {
        this.peso += quantidade;
    }

    protected void emagrecer(double quantidade) {
        this.peso -= quantidade;
    }

    @Override
    public String toString() {
        return "Ex1.Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                '}';
    }
}
