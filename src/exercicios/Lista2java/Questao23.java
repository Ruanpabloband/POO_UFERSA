//Nível 6: Métodos
//Todas as opções dessa sessão devem ser feitas usando funções.
//23. Escreva um programa que calcule e retorne o salário atualizado através do método REAJUSTE. O
//método deve receber o valor do salário e o índice de reajuste.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao23 {

    public double salarioAtualizado(double salario, double indice) {

        double reajuste;

        reajuste = (salario * (indice / 100));

        return reajuste + salario;
    }


    public void run() {
        Scanner scanf = new Scanner(System.in);
        double salario, indice;

        System.out.println("Informe o salario: ");
        salario = scanf.nextDouble();

        System.out.println("Informe o indice: ");
        indice = scanf.nextDouble();


        System.out.printf("Salario normal: %.2f\n", salario);
        System.out.printf("Indice: %.2f\n", indice);
        System.out.printf("Salario atualizado: %.3f\n", salarioAtualizado(salario, indice));
    }
}