package exercicios.Lista3java.Questao_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha o tipo de prato:");
        System.out.println("""
                
                1 - Prato comum
                2 - Prato Vegano
                3 - Prato gourmet
                
                """);
        int tipo = scanf.nextInt();

        List<String> ingredientes = new ArrayList<>();
        System.out.println("Quantos ingredientes o prato possui?");
        int qtd = scanf.nextInt();
        scanf.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o ingrediente " + (i + 1) + ":");
            ingredientes.add(scanf.nextLine());
        }


        Prato prato = null;
        switch (tipo) {
            case 1:

                System.out.println("Informe o nome do prato:");
                String nome = scanf.nextLine();

                System.out.println("Informe o preço do prato:");
                double preco = scanf.nextDouble();

                System.out.println("Informe o tempo de preparo (em minutos):");
                int tempo = scanf.nextInt();
                scanf.nextLine();

                prato = new Prato(nome, preco, tempo, ingredientes);
                break;
            case 2:

                System.out.println("Informe o nome do prato:");
                String nomeVegano = scanf.nextLine();

                System.out.println("Informe o preço do prato:");
                double precoVegano = scanf.nextDouble();

                System.out.println("Informe o tempo de preparo (em minutos):");
                int tempoVegano = scanf.nextInt();
                scanf.nextLine();

                System.out.println("Informe a certificação vegana:");
                String certVegan = scanf.nextLine();
                prato = new PratoVegano(nomeVegano, precoVegano, tempoVegano, ingredientes, certVegan);
                break;
            case 3:

                System.out.println("Informe o nome do prato:");
                String nomeGourmet = scanf.nextLine();

                System.out.println("Informe o preço do prato:");
                double precoGourmet = scanf.nextDouble();

                System.out.println("Informe o tempo de preparo (em minutos):");
                int tempoGourmet = scanf.nextInt();
                scanf.nextLine();
                System.out.println("Informe o nome do chef responsável:");
                String chef = scanf.nextLine();
                prato = new PratoGourmet(nomeGourmet, precoGourmet, tempoGourmet, ingredientes, chef);
                break;
            default:
                System.out.println("Opção inválida! ");
        }
        if (prato != null){
            prato.exibirCardapio();
            System.out.println("Taxa de serviço: " + prato.calcularTaxaServico());
        }
    }
}
