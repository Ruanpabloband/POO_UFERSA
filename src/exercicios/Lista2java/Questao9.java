//9. Escrever um programa que leia um conjunto de números positivos, e exiba se o número lido é par ou
//ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos números ímpares
//lidos. Suporemos que o número de elementos deste conjunto não é conhecido, e que um número
//negativo será utilizado para sinalizar o fim dos dados.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao9 {
    public void conjuntoNumPositivos() {
        Scanner scanf = new Scanner(System.in);

        int somaImpares = 0, somaPares = 0;

        System.out.println("Informe numeros positivos(negativos para sair): ");

        while (true) {
            int num1 = scanf.nextInt();

            if (num1 < 0) {
                break;
            }

            if (num1 % 2 == 0) {

                System.out.println("Numero par: " + num1);
                somaPares += num1;

            } else {

                System.out.println("Numero impar: " + num1);
                System.out.println(num1);
                somaImpares += num1;

            }

        }

        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Soma dos numeros ímpares: " + somaImpares);
    }

    public void run() {
        conjuntoNumPositivos();
    }
}
