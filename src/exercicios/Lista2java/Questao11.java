//11. Escreva um programa que calcule e exiba a média da nota dos alunos de uma turma em uma prova. O
//número de alunos é desconhecido. Os dados de um aluno são: número de matrícula e a sua nota na
//prova em questão.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao11 {
    public void mediaNotasAlunos() {
        Scanner scanf = new Scanner(System.in);

        int contadorAlunos = 0;
        double somaNotas = 0;

        while (true) {

            System.out.println("Informe a matricula do aluno(digite algo <= 0 para sair): ");
            int matricula = scanf.nextInt();

            if (matricula <= 0) {
                break;
            }

            System.out.println("Nota do aluno: ");
            double notas = scanf.nextDouble();

            somaNotas += notas;
            contadorAlunos++;

        }
        if (contadorAlunos > 0) {
            double media = somaNotas / contadorAlunos;
            System.out.println("\nQuantidade de alunos: " + contadorAlunos);
            System.out.printf("Media das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhum aluno foi informado.");
        }
    }

    public void run() {
        mediaNotasAlunos();
    }
}
