//21. Fazer um programa que sorteie um número de 0 a 100 e que permita que o usuário (sem conhecer o
//número sorteado) tente acertar. Caso não acerte, o programa deve imprimir uma mensagem
//informando se o número sorteado é maior ou menor que a tentativa feita. Ao acertar o número, o
//programa deve imprimir a quantidade de tentativas feitas.

package exercicios.Lista2java;

import java.util.Random;
import java.util.Scanner;

public class Questao21 {
    public void sortearNumeros() {
        Scanner scanf = new Scanner(System.in);
        Random aleatorioNum = new Random();

        int numSorteado = aleatorioNum.nextInt(101);
        int qtdTentativas = 0;
        int numero;

        do {
            System.out.println("Informe um numero: ");
            numero = scanf.nextInt();
            qtdTentativas++;
            if (numero > numSorteado) {
                System.out.println("Menor que a tentativa feita");
            } else if (numero < numSorteado) {
                System.out.println("Maior que a tentativa feita");
            } else {
                System.out.println("Parabens, voce acertou, sua quantidade de tentativas foi: " + qtdTentativas);
            }
        } while (numero != numSorteado);
    }

    public void run() {
        sortearNumeros();
    }
}