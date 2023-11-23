package br.edu.ifrn.peoo.polimorfismo.escola;

public class Professor extends Funcionario {

    public Professor() {
        System.out.println("Professor");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 3;
    }

}
