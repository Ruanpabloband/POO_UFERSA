package exercicios.Lista3java.Questao_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("""
                Escolha uma opção:
                
                1 - Produto Eletrônico Comum
                2 - Smartphone
                3 - Notebook
                
                """);

        int escolha = scanf.nextInt();
        scanf.nextLine();

        ProdutoEletronico produto = null;

        switch (escolha) {
            case 1:
                System.out.println("Informe a marca do produto: ");
                String marca = scanf.nextLine();

                System.out.println("Informe o modelo: ");
                String modelo = scanf.nextLine();

                System.out.println("Informe o preço: ");
                double preco = scanf.nextDouble();

                System.out.println("Informe a voltagem: ");
                int voltagem = scanf.nextInt();

                produto = new ProdutoEletronico(marca, modelo, preco, voltagem);
                break;

            case 2:
                System.out.println("Informe a marca do smartphone: ");
                String marcaSmart = scanf.nextLine();

                System.out.println("Informe o modelo: ");
                String modeloSmart = scanf.nextLine();

                System.out.println("Informe o preço: ");
                double precoSmart = scanf.nextDouble();

                System.out.println("Informe a voltagem: ");
                int voltagemSmart = scanf.nextInt();

                System.out.println("Informe o tamanho da tela (em polegadas): ");
                double tamanhoTela = scanf.nextDouble();

                System.out.println("Informe a capacidade da bateria (mAh): ");
                int capacidadeBateria = scanf.nextInt();

                produto = new Smartphone(marcaSmart, modeloSmart, precoSmart, voltagemSmart, tamanhoTela, capacidadeBateria);
                break;

            case 3:
                System.out.println("Informe a marca do notebook: ");
                String marcaNote = scanf.nextLine();

                System.out.println("Informe o modelo: ");
                String modeloNote = scanf.nextLine();

                System.out.println("Informe o preço: ");
                double precoNote = scanf.nextDouble();

                System.out.println("Informe a voltagem: ");
                int voltagemNote = scanf.nextInt();
                scanf.nextLine();

                System.out.println("Informe o processador: ");
                String processador = scanf.nextLine();

                System.out.println("Informe a memória RAM (em GB): ");
                int memoriaRAM = scanf.nextInt();

                produto = new Notebook(marcaNote, modeloNote, precoNote, voltagemNote, processador, memoriaRAM);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        if (produto != null) {
            System.out.println("\n<<<Especificoes do Produto>>>");
            produto.exibirEspecificacoes();
            System.out.println("Valor da garantia estendida: R$ " + produto.calcularGarantiaEstendida());
        }
    }
}
