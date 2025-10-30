package exercicios.ListaSalaDesafios.Desafio_3.Entidades;

import exercicios.ListaSalaDesafios.Desafio_3.Interfaces.*;

public class Pato extends Animal implements Voador, Nadador {

    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Quack quack!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " esta voando baixo.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " esta nadando no lago.");
    }
}