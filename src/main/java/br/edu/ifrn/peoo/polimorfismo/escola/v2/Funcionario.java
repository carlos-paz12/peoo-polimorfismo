package br.edu.ifrn.peoo.polimorfismo.escola.v2;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario = 2000.00;

    public Funcionario() {
        System.out.println("Funcionario");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

}
