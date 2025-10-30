package exercicios.ListaSalaDesafios.Desafio_4;

import exercicios.ListaSalaDesafios.Desafio_4.Entidades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    SISTEMA DE DISPOSITIVOS DE MIDIA");
        System.out.println("========================================");

        CaixaDeSom caixa = new CaixaDeSom();
        Projetor projetor = new Projetor();
        SmartTV smartTV = new SmartTV();

        SalaDeMidia sala = new SalaDeMidia();

        sala.iniciarSessaoDeMusica(caixa, "Imagine - John Lennon");

        sala.iniciarSessaoDeFilme(projetor, "Inception");

        sala.iniciarSessaoDeMusica(smartTV, "Tarcisio do Acordeon - Inseguranca");

        sala.iniciarSessaoDeFilme(smartTV, "Kimetsu no Yaba, Infnite Castle");

        System.out.println("\n========================================");
        System.out.println("     FIM DAS SESSOES DE MIDIA");
        System.out.println("========================================");
    }
}