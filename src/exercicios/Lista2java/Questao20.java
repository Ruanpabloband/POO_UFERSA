//20. Leia 2 vetores de inteiros V1 e V2 de N componentes cada (no máximo 50). Determine e imprima
//quantas vezes que V1 e V2 possuem valores idênticos nas mesmas posições.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao20 {
    public void valoresIdenticos() {
        Scanner scanf = new Scanner(System.in);

        int[] v1 = new int[2];
        int[] v2 = new int[2];

        int componentesIguais = 0;
        for (int i = 0; i < v1.length; i++) {

            System.out.printf("Informe os valores de V1, %d numero:\n", i + 1);
            v1[i] = scanf.nextInt();

            System.out.printf("Informe os valores de V2, %d numero:\n", i + 1);
            v2[i] = scanf.nextInt();

            if (v1[i] == v2[i]) {
                componentesIguais++;
            }
        }

        System.out.printf("Valores identicos: %d\n", componentesIguais);

    }

    public void run() {
        valoresIdenticos();
    }
}
