import Ex6.Celular;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> aplicativos = new ArrayList<>();

        Celular celular = new Celular("Smartphone", 1258.00, 10, "Samsung", "Galaxy S21", 128, aplicativos);

        celular.instalarAplicativo("Twitter");

        System.out.println(celular);
    }
}
