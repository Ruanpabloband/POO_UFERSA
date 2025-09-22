//19. Uma agência de publicidade pediu à agência de modelos Luz & Beleza para encontrar uma modelo que
//tenha idade entre 18 e 20 anos para participar de uma campanha publicitária milionária de produtos de
//beleza. Foram inscritas 20 candidatas e, ao se inscreverem, forneceram nome e idade. Tais informações
//foram armazenadas em 2 vetores distintos. Faça um programa para imprima o vetor que contém os
//nomes das candidatas aptas a concorrer a uma vaga para a campanha milionária

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao19 {
    public void agenciadeModelos() {
        Scanner scanf = new Scanner(System.in);

        int[] idadeModelos = new int[20];
        String[] nomesModelos = new String[20];

        for (int i = 0; i < nomesModelos.length; i++) {
            System.out.printf("Digite o nome da candidata %d: ", i + 1);
            nomesModelos[i] = scanf.next();

            System.out.printf("Digite a idade de %s: ", nomesModelos[i]);
            idadeModelos[i] = scanf.nextInt();
        }
        int modelaptas = 0;
        for (int i = 0; i < idadeModelos.length; i++) {
            if (idadeModelos[i] >= 18 && idadeModelos[i] <= 20) {
                System.out.printf("%s com %d anos.\n", nomesModelos[i], idadeModelos[i]);
                modelaptas++;
            }
        }

        System.out.println("Quantidade de modelos aptas: " + modelaptas);

    }

    public void run() {
        agenciadeModelos();
    }
}
