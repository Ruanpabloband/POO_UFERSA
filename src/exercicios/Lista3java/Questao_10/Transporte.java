//Questão 10: Sistema de Transporte
//Implemente a classe Transporte com os atributos capacidadePassageiros, velocidadeMaxima, consumo e
//preco, e os métodos:
//calcularCustoViagem(double distancia) - retorna (distância/consumo) * 5.50
//exibirDados()
//a. Crie a classe Onibus que herda de Transporte e possui atributo numeroEixos. Sobrescreva
//calcularCustoViagem() aplicando um desconto de 20%.
//b. Crie a classe Metro que herda de Transporte e possui atributo eletrico. Sobrescreva
//calcularCustoViagem() aplicando um desconto de 30%.

package exercicios.Lista3java.Questao_10;

public class Transporte {
    protected int capacidadePassageiros;
    protected double velocidadeMaxima;
    protected double consumo;
    protected double preco;

    public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        return (distancia / consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("\n Dados do Transporte ");
        System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade maxima: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/L");
        System.out.println("Preco: R$ " + preco);
    }
}

class Onibus extends Transporte {
    protected int numeroEixos;

    public Onibus(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoNormal = super.calcularCustoViagem(distancia);
        return custoNormal * 0.8;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Numero de eixos: " + numeroEixos);
    }
}

class Metro extends Transporte {
    protected boolean eletrico;

    public Metro(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, boolean eletrico) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoNormal = super.calcularCustoViagem(distancia);
        return custoNormal * 0.7;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("E eletrico: " + (eletrico ? "Sim" : "Não"));
    }
}
