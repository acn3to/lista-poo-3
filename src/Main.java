import Ex4.Funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Silva", 30, 1.75, 70.5, "Gerente", 3000.00, "Recursos Humanos");


        funcionario.promover("Diretor", 5000.00);

        System.out.println(funcionario);

    }
}
