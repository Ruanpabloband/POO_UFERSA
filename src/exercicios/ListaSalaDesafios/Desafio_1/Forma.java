package exercicios.ListaSalaDesafios.Desafio_1;

public abstract class Forma {
    protected String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }

    abstract double calcularArea();

    abstract double calcularPerimetro();

}