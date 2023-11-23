package br.edu.ifrn.peoo.polimorfismo.escola.v2;

public class Professor extends Funcionario {

    public Professor() {
        System.out.println("Professor");
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() * 3;
    }

}
