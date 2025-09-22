//8. Faça um programa para imprimir uma tabuada.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao8 {
   public void taboada(int num){

       for (int i = 1; i <= 10; i++) {
           System.out.printf("%d x %d = %d\n", num, i, num * i);
       }
   }

   public void run(){
       Scanner scanf = new Scanner(System.in);

       int n1;

       System.out.println("Informe o numero que deseja ver a sua tabuada: ");
       n1 = scanf.nextInt();

       taboada(n1);

   }
}
