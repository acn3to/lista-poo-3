package Ex2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getPreco() {
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    protected int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    protected void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    protected void atualizarEstoque(boolean adicionar, int quantidade) {
        if (adicionar) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            this.quantidadeEmEstoque -= quantidade;
        }
    }

    @Override
    public String toString() {
        return "Ex2.Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidadeEmEstoque=" + getQuantidadeEmEstoque() +
                '}';
    }
}
