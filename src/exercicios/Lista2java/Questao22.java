//22. Escreva um programa que solicite dois caracteres de A a Z ao usuário e imprima o número de
//caracteres existente entre eles. Assuma que o usuário digite os 2 caracteres em ordem alfabética. Caso
//não o estejam, emitir mensagem de erro.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao22 {
    public void solicitarCaracteres() {
        Scanner scanf = new Scanner(System.in);

        char caractere1;
        char caractere2;

        System.out.println("Informe 2 caraceteres (A...Z): ");
        caractere1 = scanf.next().toUpperCase().charAt(0);
        caractere2 = scanf.next().toUpperCase().charAt(0);


        if (caractere1 < 'A' || caractere1 > 'Z' || caractere2 < 'A' || caractere2 > 'Z') {
            System.out.println("Esta errado, os caracteres devem estar entre A...Z!!!");
            return;
        }

        if (caractere1 < caractere2) {
            int qtdCaracteres = (caractere2 - caractere1) - 1;
            System.out.println("Resultado:" + caractere1 + " e " + caractere2 + ",o numero de caracteres entre eles e: " + qtdCaracteres);
        } else {
            System.out.println("Caracteres nao estao em ordem alfabetica!!!");
        }
    }

    public void run() {
        solicitarCaracteres();
    }
}
