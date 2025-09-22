//10. Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros números inteiros
//positivos ímpares a partir do número informado pelo usuário menor que 10 e maior que zero.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao10 {
    public void somaDosQuadrados() {
        Scanner scanf = new Scanner(System.in);

        int num;

        do {
            System.out.print("Informe um numero entre 1 e 10: ");
            num = scanf.nextInt();
        } while (num <= 0 || num >= 10);

        int soma = 0;
        int newNum = num;
        int i = 0;

        while (i < 20) {
            if (newNum % 2 == 1) {
                int quadrado = newNum * newNum;
                System.out.printf("O numero %d, e seu valor ao quadrado: %d\n", newNum, quadrado);
                soma += quadrado;
                i++;
            }
            newNum++;
        }
        System.out.printf("Soma dos 20 primeiros numeros impares ao quadrado: %d\n", soma);
    }

    public void run() {
        somaDosQuadrados();
    }
}