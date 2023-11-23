package br.edu.ifrn.peoo.polimorfismo.escola.v2;

public class Estagiario extends Funcionario {

    public Estagiario() {
        System.out.println("Estagiario");
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() / 2.5;
    }

}
