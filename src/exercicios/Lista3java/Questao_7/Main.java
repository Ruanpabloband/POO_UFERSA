package exercicios.Lista3java.Questao_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("""
                Escolha uma opcao:
                
                1 - Esporte comum
                2 - Futebol
                3 - Basquete
                
                """);

        int opcao = scanf.nextInt();

        Esporte esporte = null;

        switch (opcao) {
            case 1:
                System.out.println("Esporte comum:");
                System.out.println("Informe o nome do esporte: ");
                String nome = scanf.next();
                System.out.println("Informe o numero de jogadores: ");
                int numeroJogadores = scanf.nextInt();
                System.out.println("Informe a duracao da partida: ");
                double duracaoPartida = scanf.nextDouble();
                System.out.println("Informe a popularidade: ");
                int popularidade = scanf.nextInt();
                esporte = new Esporte(nome, numeroJogadores, duracaoPartida, popularidade);
                break;
            case 2:
                System.out.println("Futebol: ");
                System.out.println("Informe o nome do jogador de futebol: ");
                String nomeFutebol = scanf.next();
                System.out.println("Informe o numero de jogadores de futebol: ");
                int numeroJogadoresFutebol = scanf.nextInt();
                System.out.println("Informe a duracao da partida de futebol: ");
                double duracaoPartidaFutebol = scanf.nextDouble();
                System.out.println("Informe a popularidade no futebol: ");
                int popularidadeFutebol = scanf.nextInt();
                System.out.println("Informe o tamanho do campo: ");
                double tamanhoCampo = scanf.nextDouble();
                esporte = new Futebol(nomeFutebol, numeroJogadoresFutebol, duracaoPartidaFutebol, popularidadeFutebol, tamanhoCampo);
                break;
            case 3:
                System.out.println("Basquete: ");
                System.out.println("Informe o nome do jogador de basquete: ");
                String nomeBasquete = scanf.next();
                System.out.println("Informe o numero de jogadores de basquete: ");
                int numeroJogadoresBasquete = scanf.nextInt();
                System.out.println("Informe a duracao da partida de basquete: ");
                double duracaoPartidaBasquete = scanf.nextDouble();
                System.out.println("Informe a popularidade no basquete: ");
                int popularidadeBasquete = scanf.nextInt();
                System.out.println("Informe a altura da cesta: ");
                double alturaCesta = scanf.nextDouble();
                esporte = new Futebol(nomeBasquete, numeroJogadoresBasquete, duracaoPartidaBasquete, popularidadeBasquete, alturaCesta);
                break;
            default:
                System.out.println("Opcao invalida!!!");
                break;
        }
        if (esporte != null) {
            System.out.println("\n<<<Informacoes do esporte>>>");
            esporte.exibirRegras();
            System.out.println("Preco do custo dos equipamentos: " + esporte.calcularCustoEquipamento());
        }
    }
}