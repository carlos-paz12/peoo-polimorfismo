package br.edu.ifrn.peoo.polimorfismo.escola;

public class Estagiario extends Funcionario {

    public Estagiario() {
        System.out.println("Estagiario");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() / 2.5;
    }

}
