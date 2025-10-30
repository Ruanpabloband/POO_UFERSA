package exercicios.ListaSalaDesafios.Desafio_4.Entidades;

import exercicios.ListaSalaDesafios.Desafio_4.Interfaces.ReprodutorAudio;

public class CaixaDeSom implements ReprodutorAudio {

    @Override
    public void tocarMusica(String faixa){
        System.out.println("Tocando musica: " + faixa);
    }
}