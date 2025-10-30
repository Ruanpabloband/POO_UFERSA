package exercicios.Lista4java.Questao_2;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, int codigoCargo, double salarioBase) {
        super(nome, codigoCargo, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        double bonus;
        switch (codigoCargo) {
            case 1:
                bonus = salarioBase * 0.10;
                break;
            case 2:
                bonus = salarioBase * 0.15;
                break;
            case 3:
                bonus = salarioBase * 0.20;
                break;
            default:
                bonus = salarioBase * 0.05;
                break;
        }
        return bonus;
    }
}

