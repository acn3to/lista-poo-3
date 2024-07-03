package Ex3;

public class Filme {
    private String titulo;
    private int anoLancamento;
    private String diretor;
    private String descricao;

    public Filme(String titulo, int anoLancamento, String diretor, String descricao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + getTitulo() + '\'' +
                ", anoLancamento=" + getAnoLancamento() +
                ", diretor='" + getDiretor() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }
}
