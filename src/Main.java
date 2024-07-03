package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Filme filme1 = new Filme("Inception", 2010, "Christopher Nolan", "Muito bom!");
        Filme filme2 = new Filme("The Dark Knight", 2008, "Christopher Nolan", "Perfeito!");
        Filme filme3 = new Filme("Interstellar", 2014, "Christopher Nolan", "O melhor!");

        List<Filme> listaInicial = new ArrayList<>();
        listaInicial.add(filme1);
        listaInicial.add(filme2);

        GestorFilmes gestorFilmes = new GestorFilmes(listaInicial);

        gestorFilmes.adicionarFilme(filme3);

        gestorFilmes.listarFilmes();

        gestorFilmes.removerFilme(1);

        gestorFilmes.listarFilmes();
    }
}
