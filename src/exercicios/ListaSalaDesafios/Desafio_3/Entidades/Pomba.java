package exercicios.ListaSalaDesafios.Desafio_3.Entidades;

import exercicios.ListaSalaDesafios.Desafio_3.Interfaces.*;

public class Pomba extends Animal implements Voador {

    public Pomba(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("Pruu pruu!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " esta voando alto!");
    }
}