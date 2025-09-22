//3. Tendo como dados de entrada a altura e o sexo de uma pessoa, faça um programa que calcule seu
//peso ideal, utilizando as seguintes fórmulas: (h = altura)
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1 *h) - 44.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao3 {
    public double calcularPesoIdealMasculino(double altura) {
        return (72.7 * altura) - 58;
    }

    public double calcularPesoIdealFeminino(double altura) {
        return (62.1 * altura) - 44;
    }

    public void run() {
        Scanner scanf = new Scanner(System.in);
        String sexo;
        double altura_h;

        System.out.println("Informe sua altura: ");
        altura_h = scanf.nextDouble();

        System.out.println("Informe seu sexo [M, F]: ");
        sexo = scanf.next();

        switch (sexo) {

            case "M":
            case "m":
                System.out.printf("Seu peso ideal é: %.2f kg\n", calcularPesoIdealMasculino(altura_h));
                break;
            case "F":
            case "f":
                System.out.printf("Seu peso ideal é: %.2f kg\n", calcularPesoIdealFeminino(altura_h));
                break;
            default:
                System.out.println("Opcao invalida...");
                break;
        }
        scanf.close();
    }
}
