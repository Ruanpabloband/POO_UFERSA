//Questão 4: Sistema de Imóveis
//Implemente a classe Imovel com os atributos endereco, area, numeroQuartos e preco, e os métodos:
//calcularTaxaAdministracao() - retorna 8% do preço
//exibirCaracteristicas()

package exercicios.Lista3java.Questao_4;

public class Imovel {
    protected String endereco;
    protected double area;
    protected int numeroQuarto;
    protected double preco;

    public Imovel(String endereco, double area, int numeroQuarto, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuarto = numeroQuarto;
        this.preco = preco;
    }

    public double calcularTaxaAdministracao() {
        return preco * 0.08;
    }

    public void exibirCaracteristicas() {
        System.out.println("Sistema de imoveis: ");
        System.out.println("Endereco: " + endereco);
        System.out.println("Area: " + area);
        System.out.println("Numero do quarto: " + numeroQuarto);
        System.out.println("Preco: R$ " + preco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

//a. Crie a classe Apartamento que herda de Imovel e possui atributo andar e valorCondominio.
//Sobrescreva calcularTaxaAdministracao() para retornar 6% do preço.

class Apartamento extends Imovel {

    protected int andar;
    protected double valorCondominio;

    public Apartamento(String endereco, double area, int numeroQuarto, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuarto, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: " + andar);
        System.out.println("Valor Condomínio: " + valorCondominio);
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
}

//b. Crie a classe Casa que herda de Imovel e possui atributo areaQuintal e temPiscina.
//Sobrescreva calcularTaxaAdministracao() para retornar 10% do preço.

class Casa extends Imovel {

    protected double areaQuintal;
    protected boolean temPiscina;

    public Casa(String endereco, double area, int numeroQuarto, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuarto, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.10;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Area do Quintal: " + areaQuintal);
        System.out.println("Tem piscina: " + (temPiscina ? "Sim" : "Não"));
    }

    public double getAreaQuintal() {
        return areaQuintal;
    }

    public void setAreaQuintal(double areaQuintal) {
        this.areaQuintal = areaQuintal;
    }

    public boolean getTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }
}
