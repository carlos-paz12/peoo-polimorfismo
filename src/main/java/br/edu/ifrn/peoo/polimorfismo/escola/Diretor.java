package br.edu.ifrn.peoo.polimorfismo.escola;

public class Diretor extends Funcionario {

    public Diretor() {
        System.out.println("Diretor");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 5;
    }

}