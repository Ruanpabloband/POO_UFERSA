package exercicios.ListaSalaDesafios.Desafio_3.Entidades;

public abstract class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer() {
        System.out.printf("%s esta comendo!\n", nome);
    }
    public abstract void fazerSom();
}