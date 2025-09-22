//15. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que
//são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o
//índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice
//crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice
//atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um programa que
//leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas. O
//algoritmo só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja
//encerrar o programa?" ou o índice for 0,0.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao15 {
    public void secretaria() {
        Scanner scanf = new Scanner(System.in);

        double indice;

        while (true) {
            System.out.println("Informe o indice: ");
            indice = scanf.nextDouble();

            if (indice == 0.0) {
                System.out.println("Indice foi 0,0 → encerrar programa!!!");
                break;
            }

            if (indice < 0.0) {
                System.out.println("Indice invalido (negativo), digite um valor >= 0.0.");
                continue;
            }

            if (indice >= 0.5) {
                System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
            } else if (indice >= 0.4) {
                System.out.println("Industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades");
            } else if (indice >= 0.3) {
                System.out.println("Industrias do 1º grupo são intimadas a suspenderem suas atividades");
            } else if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("O indice de poluicao é aceitável");
            } else {
                System.out.println("Indice abaixo do aceitavel");
            }

            System.out.println("Deseja encerrar o programa [S/N]: ");
            String resposta = scanf.next();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Fim do programa, por desejo do usuario!!!");
                break;
            }
            System.out.println();
        }
        scanf.close();
    }

    public void run() {
        secretaria();
    }
}