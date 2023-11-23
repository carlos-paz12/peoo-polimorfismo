package br.edu.ifrn.peoo.polimorfismo.escola.v2;

public class Diretor extends Funcionario {

    public Diretor() {
        System.out.println("Diretor");
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() * 5;
    }

}
