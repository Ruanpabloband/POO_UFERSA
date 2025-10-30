package exercicios.Lista4java.Questao_7;

public class Carro extends Veiculo {
    private String modelo;

    public Carro(String cor, String modelo) {
        super(cor);
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Carro modelo: " + modelo);
        mostrarCor();
    }
}