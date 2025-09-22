//24. Escreva um programa que verifique se um número é par ou ímpar através de um método chamado
//VERIFICA. O método deverá receber um número inteiro (n) e deverá retornar a mensagem "PAR" ou
//"ÍMPAR".

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao24 {
    public String verificarNumParorImpar(int num){

        if (num % 2 ==0){
            return "Par";
        } else {
            return "Impar";
        }
    }

    public void run(){
        Scanner scanf = new Scanner(System.in);
        int numero;

        System.out.println("Informe um numero(positivo): ");
        numero = scanf.nextInt();

        System.out.println("Numero: " + numero + " e " + verificarNumParorImpar(numero));
    }
}