package exercicios.Lista3java.Questao_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("""
                Escolha uma opcao:
                
                1 - Midia comum
                2 - Filme
                3 - Series
                
                """);

        int opcao = scanf.nextInt();

        Midia midia = null;

        switch (opcao) {
            case 1:
                System.out.println("Midia comum:");
                System.out.println("Informe o titulo: ");
                String titulo = scanf.next();
                System.out.println("Informe o ano de lancamento: ");
                int anolancamento = scanf.nextInt();
                System.out.println("Informe a duracao: ");
                double duracao = scanf.nextDouble();
                System.out.println("Inforem o preco: ");
                double preco = scanf.nextDouble();
                midia = new Midia(titulo, anolancamento, duracao, preco);
                break;

            case 2:
                System.out.println("Filme:");
                System.out.println("Informe o titulo do filme: ");
                String tituloFilme = scanf.next();
                System.out.println("Informe o ano de lancamento do filme: ");
                int anolancamentoFilme = scanf.nextInt();
                System.out.println("Informe a duracao do filme: ");
                double duracaoFilme = scanf.nextDouble();
                System.out.println("Informe o preco do filme: ");
                double precoFilme = scanf.nextDouble();
                System.out.println("Informe o direto do filme: ");
                String direto = scanf.next();
                System.out.println("Informe o genero do filme: ");
                String genero = scanf.next();
                midia = new Filme(tituloFilme, anolancamentoFilme, duracaoFilme, precoFilme, direto, genero);
                break;

            case 3:
                System.out.println("Serie:");
                System.out.println("Informe o titulo da serie: ");
                String tituloSerie = scanf.next();
                System.out.println("Informe o ano de lancamento da serie: ");
                int anolancamentoSerie = scanf.nextInt();
                System.out.println("Informe a duracao da serie: ");
                double duracaoSerie = scanf.nextDouble();
                System.out.println("Informe o preco da serie: ");
                double precoSerie = scanf.nextDouble();
                System.out.println("Informe o numero de temporadas da serie: ");
                int numeroTemporadas = scanf.nextInt();
                System.out.println("Informe o numero de episodios por temporada da serie: ");
                int episodiosPorTemporada = scanf.nextInt();
                midia = new Serie(tituloSerie, anolancamentoSerie, duracaoSerie, precoSerie, numeroTemporadas, episodiosPorTemporada);
                break;
            default:
                System.out.println("Opcao invalida!!!");
                break;
        }
        if (midia != null) {
            System.out.println("\n<<<Informacoes da Midia>>>");
            midia.exibirInfo();
            System.out.println("Preco do aluguel da midia: " + midia.calcularPrecoAluguel());
        }

    }
}
