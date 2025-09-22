//6. Faça um programa que gera e escreve os números ímpares dos números lidos entre 100 e 200.

package exercicios.Lista2java;

public class Questao6 {
    public void impares() {
        for (int i = 100; i < 200; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void run() {
        impares();
    }
}
