package exercicios.ListaSalaDesafios.Desafio_1;

public class Retangulo extends Forma {

    protected double largura;
    protected double altura;

    public Retangulo(double largura, double altura) {
        super("Retangulo");
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
    return largura * altura;
    }

    public double calcularPerimetro(){
    return 2 * (altura + largura);
    }


}