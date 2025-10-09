//Questão 5: Sistema de Eletrônicos
//Implemente a classe ProdutoEletronico com os atributos marca, modelo, preco e voltagem, e os métodos:
//calcularGarantiaEstendida() - retorna 15% do preço
//exibirEspecificacoes()

package exercicios.Lista3java.Questao_5;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected int voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida() {
        return preco * 0.15;
    }


    public void exibirEspecificacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: " + preco);
        System.out.println("Voltagem: " + voltagem);
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}

//a. Crie a classe Smartphone que herda de ProdutoEletronico e possui atributos tamanhoTela e
//capacidadeBateria. Sobrescreva calcularGarantiaEstendida() para retornar 20% do preço.

class Smartphone extends ProdutoEletronico {
    protected double tamanhoTela;
    protected int capacidadeBateria;

    public Smartphone(String marca, String modelo, double preco, int voltagem, double tamanhoTela, int capacidadeBateria) {
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.20;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Tamanha da tela: " + tamanhoTela);
        System.out.println("Capacidade da bateria: " + capacidadeBateria);
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
}

//b. Crie a classe Notebook que herda de ProdutoEletronico e possui atributos processador e memoriaRAM.
//Sobrescreva calcularGarantiaEstendida() para retornar 25% do preço.

class Notebook extends ProdutoEletronico {

    protected String processador;
    protected int memoriaRam;


    public Notebook(String marca, String modelo, double preco, int voltagem, String processador, int memoriaRam) {
        super(marca, modelo, preco, voltagem);
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.25;
    }

    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Processador: " + processador);
        System.out.println("Memoria Ram: " + memoriaRam);
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }


    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }


}