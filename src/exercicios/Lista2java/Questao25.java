//25. Escreva um programa que deverá ter as seguintes opções:
//Opções Disponíveis
//1 - Carregar Vetor
//2 - Listar Vetor
//3 - Exibir apenas os números pares do vetor
//4 - Exibir apenas os números ímpares do vetor
//5 - Exibir a quantidade de números pares existem nas posições ímpares do
//6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
//0 - Sair

package exercicios.Lista2java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao25 {

    public List<Integer> carregarVetor() {
        Scanner scanf = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        int numero, i = 0;

        do {
            System.out.printf("Informe os valores para o vetor[%d]: ", i);
            numero = scanf.nextInt();
            i++;
            if (numero < 0) {
                break;
            }
            vetor.add(numero);
        } while (true);

        return vetor;
    }

    public void listarVetor(List<Integer> vetor) {
        for (int i = 0; i < vetor.size(); i++) {
            System.out.printf("Vetor[%d] = %d\n", i, vetor.get(i));
        }
    }

    public void exibirNumerosPares(List<Integer> vetor) {
        for (Integer valor : vetor) {
            if (valor % 2 == 0) {
                System.out.printf("Valores pares: %d\n", valor);
            }
        }
    }

    public void exibirNumerosImpares(List<Integer> vetor) {
        for (Integer valor : vetor) {
            if (valor % 2 == 1) {
                System.out.printf("Valores impares: %d\n", valor);
            }
        }
    }

    public void qtdParesPosImpares(List<Integer> vetor) {
        int qtd = 0;
        for (int i = 0; i < vetor.size(); i++) {
            if (i % 2 != 0 && vetor.get(i) % 2 == 0) { // posição ímpar e número par
                qtd++;
            }
        }
        System.out.println("Quantidade de numeros pares em posicoes impares: " + qtd);
    }

    public void qtdImparesPosPares(List<Integer> vetor) {
        int qtd = 0;
        for (int i = 0; i < vetor.size(); i++) {
            if (i % 2 == 0 && vetor.get(i) % 2 != 0) {
                qtd++;
            }
        }
        System.out.println("Quantidade de numeros impares em posicoes pares: " + qtd);
    }

    public void run() {
        Scanner scanf = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        int opcao;

        do {
            System.out.println("""
                    Menu
                    
                    1 - Carregar Vetor
                    2 - Listar Vetor
                    3 - Exibir apenas os numeros pares do vetor
                    4 - Exibir apenas os numeros impares do vetor
                    5 - Exibir a quantidade de numeros pares que estao em posicoes impares do vetor
                    6 - Exibir a quantidade de numeros impares que estao em posicoes pares do vetor
                    0 - Sair""");
            opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    vetor = carregarVetor();
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    exibirNumerosPares(vetor);
                    break;
                case 4:
                    exibirNumerosImpares(vetor);
                    break;
                case 5:
                    qtdParesPosImpares(vetor);
                    break;
                case 6:
                    qtdImparesPosPares(vetor);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!!!");
                    break;
            }

        } while (opcao != 0);

    }
}