package Ex3;

import java.util.List;

public class GestorFilmes {
    private List<Filme> filmes;

    public GestorFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public boolean removerFilme(int indice) {
        return indice >= 0 && indice < filmes.size() && filmes.remove(indice) != null;
    }

    public void listarFilmes() {
        filmes.forEach(filme -> System.out.println(filme.toString()));
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "GestorFilmes{" + "filmes=" + getFilmes() + '}';
    }
}
