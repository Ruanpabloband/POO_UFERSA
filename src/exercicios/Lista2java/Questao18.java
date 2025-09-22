//18. Considere um vetor de 10 números inteiros positivos maiores que zero e um único número inteiro,
//também positivo e maior que zero. Faça um programa para:
//a. ler pelo teclado o vetor;
//b. ler pelo teclado o número X;
//c. dizer quantos números no vetor são maiores que X, menores que X e iguais a X.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao18 {
    public void vetordezNumeros() {
        Scanner scanf = new Scanner(System.in);
        int[] vet = new int[10];
        int x;

        int qtdMaiores = 0;
        int qtdMenores = 0;
        int qtdIguais = 0;

        System.out.println("Informe os valores do vetor[1...10]: ");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = scanf.nextInt();
        }

        System.out.println("Informe o valor de X: ");
        x = scanf.nextInt();

        for (int newvet : vet) {
            if (newvet > x) {
                qtdMaiores++;
            } else if (newvet < x) {
                qtdMenores++;
            } else {
                qtdIguais++;
            }
        }

        System.out.println("Quantidade maiores que x: " + qtdMaiores);

        System.out.println("Quantidade menores que x: " + qtdMenores);

        System.out.println("Quantidade iguais a x: " + qtdIguais);

    }

    public void run(){
        vetordezNumeros();
    }
}
