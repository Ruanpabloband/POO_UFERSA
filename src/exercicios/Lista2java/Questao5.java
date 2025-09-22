//5. Escreva um programa que leia:
//a quantidade de números que deverá processar;
//os números que deverá processar,e calcule e exiba, para cada número a ser processado o seu
//fatorial.
//Lembrete: O fatorial de um número N é dado pela fórmula: N! = 1 2 3 4 5 ... N

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao5 {
    public int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public void run() {
        Scanner scanf = new Scanner(System.in);

        int n1;

        System.out.println("Informe o numero que deseja calcular o fatorial: ");
        n1 = scanf.nextInt();

        System.out.printf("Fatorial de %d é: %d\n", n1, fatorial(n1));

    }
}
