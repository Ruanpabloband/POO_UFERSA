package exercicios.Lista4java.Questao_2;

public abstract class Funcionario {
    protected String nome;
    protected int codigoCargo;
    protected double salarioBase;

    public Funcionario(String nome, int codigoCargo, double salarioBase) {
        this.nome = nome;
        this.codigoCargo = codigoCargo;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonificacao();
}

