package exercicios.ListaSalaDesafios.Desafio_4.Entidades;

import exercicios.ListaSalaDesafios.Desafio_4.Interfaces.*;

public class SmartTV implements ReprodutorAudio, ReprodutorVideo {

    @Override
    public void tocarMusica(String faixa) {
        System.out.println("SmartTV tocando audio: " + faixa);
    }

    @Override
    public void tocarVideo(String filme) {
        System.out.println("SmartTV exibindo filme: " + filme);
    }
}