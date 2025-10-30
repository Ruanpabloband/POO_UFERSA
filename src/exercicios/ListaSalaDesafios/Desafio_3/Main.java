package exercicios.ListaSalaDesafios.Desafio_3;

import exercicios.ListaSalaDesafios.Desafio_3.Entidades.*;
import exercicios.ListaSalaDesafios.Desafio_3.Interfaces.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   SISTEMA DE ANIMAIS E HABILIDADES");
        System.out.println("========================================\n");

        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex"));
        animais.add(new Pomba("Pipoca"));
        animais.add(new Pato("Donald"));

        System.out.println("Total de animais cadastrados: " + animais.size() + "\n");

        for (Animal animal : animais) {
            System.out.println("Animal: " + animal.nome);
            animal.comer();
            animal.fazerSom();

            if (animal instanceof Voador) {
                ((Voador) animal).voar();
            }

            if (animal instanceof Nadador) {
                ((Nadador) animal).nadar();
            }
        }
        

        System.out.println("\n========================================");
        System.out.println("   FIM DO SISTEMA DE ANIMAIS");
        System.out.println("========================================");
    }
}