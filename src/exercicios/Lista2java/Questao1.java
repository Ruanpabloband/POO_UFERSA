//1. Escreva um programa que exiba as seguintes opções e realize os que se pede em cada uma delas:

//1 – Adição

//2 – Subtração

//3 – Multiplicação

//4 – Divisão

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao1 {
    public double adicao(double n1, double n2) {
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicacao(double n1, double n2) {
        return n1 + n2;
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Divisao por 0 invalida!!");
            return 0;
        }

        return n1 / n2;
    }


    public void run() {
        Scanner scanf = new Scanner(System.in);
        double num1, num2;

        System.out.println("Informe o primeiro numero: ");
        num1 = scanf.nextDouble();

        System.out.println("Informe o segundo numero: ");
        num2 = scanf.nextDouble();

        System.out.printf("Soma e: %.2f\n", adicao(num1, num2));
        System.out.printf("Subtracao e: %.2f\n", subtracao(num1, num2));
        System.out.printf("Multiplicacao e: %.2f\n", multiplicacao(num1, num2));
        System.out.printf("Divisao e: %.2f\n", divisao(num1, num2));
    }
}
