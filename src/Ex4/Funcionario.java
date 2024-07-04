package Ex4;

import Ex1.Pessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome, int idade, double altura, double peso, String cargo, double salario, String departamento) {
        super(nome, idade, altura, peso);
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + getCargo() + '\'' +
                ", salario=" + getSalario() +
                ", departamento='" + getDepartamento() + '\'' +
                '}';
    }
}
