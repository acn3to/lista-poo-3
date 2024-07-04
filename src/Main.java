import Ex5.Casa;
import Ex5.Endereco;

;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 6, "Brotas", "Salvador", "BA", "88000-000");

        Casa casa = new Casa(endereco, 3, 120.0, 350000.0);

        double taxaImposto = 0.015;
        double imposto = casa.calcularImposto(taxaImposto);

        System.out.println(casa);

        System.out.println("Imposto calculado: " + imposto);
    }
}
