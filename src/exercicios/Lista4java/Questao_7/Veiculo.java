package exercicios.Lista4java.Questao_7;

public abstract class Veiculo {
    protected String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public void mostrarCor() {
        System.out.println("Cor do veiculo: " + cor);
    }
}