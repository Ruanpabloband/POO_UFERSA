//Nível 5: Vetores e Matrizes
//1. Dada uma sequência de n números (vetor de inteiros), imprimi-la na ordem inversa que foi realizada a
//leitura.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao16 {
    public void ordemInversa() {
        Scanner scanf = new Scanner(System.in);
        int num;

        System.out.println("Informe o tamanho do vetor(valores inteiros): ");
        num = scanf.nextInt();

        int[] vet = new int[num];

        System.out.println("Informe os numeros: ");
        for (int i = 0; i < num; i++) {
            vet[i] = scanf.nextInt();
        }

        System.out.println("Ordem inversa: ");
        for (int i = num - 1; i >= 0; i--) {
            System.out.printf("[%d]\n", vet[i]);
        }

    }

    public void run() {
        ordemInversa();
    }
}
