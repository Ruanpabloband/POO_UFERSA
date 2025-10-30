package exercicios.ListaSalaDesafios.Desafio_4.Entidades;

import exercicios.ListaSalaDesafios.Desafio_4.Interfaces.*;

public class SalaDeMidia {

    public void iniciarSessaoDeMusica(ReprodutorAudio dispositivo, String faixa) {
        System.out.println("\n--- Iniciando Sessao de Música ---");
        dispositivo.tocarMusica(faixa);
        System.out.println("-----------------------------------");
    }

    public void iniciarSessaoDeFilme(ReprodutorVideo dispositivo, String filme) {
        System.out.println("\n--- Iniciando Sessao de Filme ---");
        dispositivo.tocarVideo(filme);
        System.out.println("----------------------------------");
    }
}