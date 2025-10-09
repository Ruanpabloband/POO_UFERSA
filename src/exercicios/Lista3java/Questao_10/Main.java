package exercicios.Lista3java.Questao_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha o tipo de transporte:");
        System.out.println("""
                
                1 - Transporte comum
                2 - Onibus
                3 - Metro
                
                """);
        int tipo = scanf.nextInt();
        scanf.nextLine();

        Transporte transporte = null;

        switch (tipo) {
            case 1:
                System.out.println("Informe a capacidade de passageiros:");
                int capacidade = scanf.nextInt();

                System.out.println("Informe a velocidade maxima (km/h):");
                double velocidade = scanf.nextDouble();

                System.out.println("Informe o consumo (km/l):");
                double consumo = scanf.nextDouble();

                System.out.println("Informe o preco (R$):");
                double preco = scanf.nextDouble();

                transporte = new Transporte(capacidade, velocidade, consumo, preco);
                break;

            case 2:
                System.out.println("Informe a capacidade de passageiros:");
                int capOnibus = scanf.nextInt();

                System.out.println("Informe a velocidade maxima (km/h):");
                double velOnibus = scanf.nextDouble();

                System.out.println("Informe o consumo (km/l):");
                double consOnibus = scanf.nextDouble();

                System.out.println("Informe o preco (R$):");
                double precoOnibus = scanf.nextDouble();

                System.out.println("Informe o numero de eixos:");
                int eixos = scanf.nextInt();

                transporte = new Onibus(capOnibus, velOnibus, consOnibus, precoOnibus, eixos);
                break;

            case 3:
                System.out.println("Informe a capacidade de passageiros:");
                int capMetro = scanf.nextInt();

                System.out.println("Informe a velocidade maxima (km/h):");
                double velMetro = scanf.nextDouble();

                System.out.println("Informe o consumo (km/l):");
                double consMetro = scanf.nextDouble();

                System.out.println("Informe o preco (R$):");
                double precoMetro = scanf.nextDouble();

                scanf.nextLine();
                System.out.println("O metro e eletrico? (sim/não)");
                String eletricoStr = scanf.nextLine();
                boolean eletrico = eletricoStr.equalsIgnoreCase("sim");

                transporte = new Metro(capMetro, velMetro, consMetro, precoMetro, eletrico);
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        if (transporte != null) {
            transporte.exibirDados();
            System.out.println("Informe a distancia da viagem (km):");
            double distancia = scanf.nextDouble();
            System.out.printf("Custo da viagem: R$ %.2f\n", transporte.calcularCustoViagem(distancia));
        }
    }
}
