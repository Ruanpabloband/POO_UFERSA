//17. Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou
//seja, realizar a soma de todos dos resultados da multiplicação de x[i] por y[i]

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao17 {
    public void podrutoEscalar() {
        Scanner scanf = new Scanner(System.in);
        int num;

        System.out.println("Informe o tamanho dos vetores(valores inteiros): ");
        num = scanf.nextInt();

        int[] x = new int[num];
        int[] y = new int[num];

        System.out.println("Informe os valores do vetor X: ");
        for (int i = 0; i < num; i++) {
            x[i] = scanf.nextInt();
        }
        System.out.println("Informe os valores do vetor Y: ");
        for (int i = 0; i < num; i++) {
            y[i] = scanf.nextInt();
        }

        int escalarProduto = 0;
        for (int i = 0; i < num; i++) {
            escalarProduto += x[i] * y[i];
        }

        System.out.println("O produto escalar entre os vetores x e y: " + escalarProduto);

    }


    public void run() {
        podrutoEscalar();
    }
}
