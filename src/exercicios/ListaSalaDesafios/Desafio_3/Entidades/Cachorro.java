package exercicios.ListaSalaDesafios.Desafio_3.Entidades;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}