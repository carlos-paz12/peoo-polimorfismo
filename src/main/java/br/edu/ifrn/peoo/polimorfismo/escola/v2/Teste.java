package br.edu.ifrn.peoo.polimorfismo.escola.v2;

public class Teste {

    public static void main(String[] args) {

        Estagiario estagiario = new Estagiario();
        System.out.println("Estagiário SALÁRIO: R$" + estagiario.calcularSalario());

        Professor professor = new Professor();
        System.out.println("Professor SALÁRIO: R$" + professor.calcularSalario());

        Diretor diretor = new Diretor();
        System.out.println("Diretor SALÁRIO: R$" + diretor.calcularSalario());

    }

}
