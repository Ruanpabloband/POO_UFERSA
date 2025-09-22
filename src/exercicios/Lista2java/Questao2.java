//2. Escreva um programa que leia dois números inteiros e apresente as opções para usuário escolher o que deseja realizar:
//1 – Verificar se um dos números lidos é ou não múltiplo do outro
//2 – Verificar se os dois números lidos são pares
//3 – Verificar se a média dos dois números é maior ou igual a 7.
//4 – Sair

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao2 {
    public boolean verificarNumMultiplo(double n1, double n2) {
        return (n1 % n2 == 0) || (n2 % n1 == 0);
    }

    public boolean verificarNumPares(double n1, double n2) {
        return (n1 % 2 == 0) && (n2 % 2 == 0);
    }

    public boolean verificarNumMedia(double n1, double n2) {
        double media = (n1 + n2) / 2.0;
        return media >= 7;
    }

    public void run() {
        Scanner scanf = new Scanner(System.in);

        int num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scanf.nextInt();

        System.out.println("Informe o segundo numero: ");
        num2 = scanf.nextInt();

        int opcao;

        System.out.println("""
                Menu de opcoes:
                
                1- Verificar se os numeros sao multiplos
                2- Verificar se os numeros sao pares
                3- Verificar se a media e maior que 7
                
                0- Sair""");
        opcao = scanf.nextInt();

        switch (opcao) {
            case 1:
                if (verificarNumMultiplo(num1, num2)) {
                    System.out.println("Sim, um dos numeros e multiplo do outro.");
                } else {
                    System.out.println("Nao sao multiplos.");
                }
                break;

            case 2:
                if (verificarNumPares(num1, num2)) {
                    System.out.println("Os 2 numeros sao pares.");
                } else {
                    System.out.println("Nem todos sao pares.");
                }
                break;

            case 3:
                if (verificarNumMedia(num1, num2)) {
                    System.out.println("Media e maior ou igual a 7.");
                } else {
                    System.out.println("Media e menor que 7.");
                }                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opcao invalida...");
                break;
        }
    }
}
