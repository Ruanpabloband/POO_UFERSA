package exercicios.ListaSalaDesafios.Desafio_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Forma> forma = new ArrayList<>();
        forma.add(new Retangulo(10, 5));
        forma.add(new Circulo(5));

        for(Forma f : forma){
            f.exibirNome();
            System.out.println(f.calcularArea());
            System.out.println(f.calcularPerimetro());
        }
    }
}
