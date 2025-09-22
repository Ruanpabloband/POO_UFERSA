//12. Escreva um programa que leia um conjunto de números positivos e exiba o menor e o maior.
//Suporemos que o número de elementos deste conjunto não é conhecido, e que um número negativo
//será utilizado para sinalizar o fim dos dados.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao12 {
    public void conjuntoDeNumeros() {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Informe os numeros(negativos para sair): ");
        int num = scanf.nextInt();

        int maior = num;
        int menor = num;

        while (true) {
            System.out.println("Informe os numeros(negativos para sair): ");
            num = scanf.nextInt();

            if (num < 0) {
                break;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }

    public void run() {
        conjuntoDeNumeros();
    }
}
