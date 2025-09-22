//14. Faça um programa que leia 10 valores inteiros e positivos e:
//Encontre o maior valor
//Encontre o menor valor
//Calcule a média dos números lidos

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao14 {
    public void valoresInteirosPositivos() {
        Scanner scanf = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.println("Informe 10 valores inteiros e positivos: ");
        num = scanf.nextInt();

        int maior = num;
        int menor = num;

        for (int i = 0; i < 9; i++) {
            num = scanf.nextInt();

            soma += num;

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        double media = (double) soma / 10;

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.printf("Media dos numeros: %.2f\n", media);

    }

    public void run() {
        valoresInteirosPositivos();
    }
}