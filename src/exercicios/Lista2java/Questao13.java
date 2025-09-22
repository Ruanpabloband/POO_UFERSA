//13. Faça um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: "Múltiplo de
//10".

package exercicios.Lista2java;

public class Questao13 {
    public void multiplodeDez() {

        for (int i = 1; i < 101; i++) {

            System.out.println(i);

            if (i % 10 == 0) {
                System.out.println("Esse numero e multiplo de 10!!");
            }
        }
    }

    public void run() {
        multiplodeDez();
    }
}