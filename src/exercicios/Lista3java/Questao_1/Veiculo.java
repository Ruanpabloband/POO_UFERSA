//Questão 1: Sistema de Veículos
//Implemente a classe Veiculo com os atributos marca, modelo, ano e preco, e os métodos:
//calcularIpva() - retorna 4% do preço para veículos comuns
//exibirDetalhes() - mostra todos os dados do veículo
//a. Crie a classe Moto que herda de Veiculo e possui atributo cilindrada. Sobrescreva calcularIpva() para
//retornar 2% do preço.
//b. Crie a classe Caminhao que herda de Veiculo e possui atributo capacidadeCarga. Sobrescreva
//calcularIpva() para retornar 1.5% do preço

package exercicios.Lista3java.Questao_1;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("IPVA: R$ %.2f\n", calcularIpva());
    }

    public double calcularIpva() {
        return preco * 0.04;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

class Moto extends Veiculo {
    private int cilindrada;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }

    @Override
    public double calcularIpva() {
        return getPreco() * 0.02;
    }
}


class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao() {
        super();
    }

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }

    @Override
    public double calcularIpva() {
        return getPreco() * 0.015;
    }
}
