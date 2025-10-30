package exercicios.ListaSalaDesafios.Desafio_1;

public class Circulo extends Forma {

    protected double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    public double calcularArea(){
        return raio * 3.14;
    }

    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}