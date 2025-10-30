package exercicios.ListaSalaDesafios.Desafio_4.Entidades;

import exercicios.ListaSalaDesafios.Desafio_4.Interfaces.ReprodutorVideo;

public class Projetor implements ReprodutorVideo {

    @Override
    public void tocarVideo(String filme) {
        System.out.println("Exibindo filme: " + filme);
    }
}