//26. Escreva um programa que calcule e retorne o tipo do triângulo quanto a sua classificação por lados, de
//acordo com a descrição a seguir:
//Classificação por Lados
//Equilátero: Possui todos os três lados com a mesma medida.
//Isósceles: Tem dois lados com a mesma medida e um lado com medida diferente.
//Escaleno: Apresenta todos os três lados com medidas diferentes.
//O programa deve ter três métodos, um pra cada tipo, cada método deve verificar as condições e
//retornar true ou false. Esses métodos devem ser chamados passando os ângulos.

package exercicios.Lista2java;

import java.util.Scanner;

public class Questao26 {
    public boolean equilatero(double ladoA, double ladoB, double ladoC) {
        return (ladoA == ladoB && ladoB == ladoC);
    }


    public boolean isosceles(double ladoA, double ladoB, double ladoC) {
        return (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) && !equilatero(ladoA, ladoB, ladoC);
    }


    public boolean escaleno(double ladoA, double ladoB, double ladoC) {
        return (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC);
    }

    public void run() {
        Scanner scanf = new Scanner(System.in);
        double a, b, c;

        System.out.println("Informe as medidas do triangulo: ");
        a = scanf.nextDouble();
        b = scanf.nextDouble();
        c = scanf.nextDouble();

        if (equilatero(a, b, c)) {
            System.out.println("Equilatero: Possui todos os três lados com a mesma medida.");
        } else if (isosceles(a, b, c)) {
            System.out.println("Isosceles: Tem dois lados com a mesma medida e um lado com medida diferente.");
        } else if (escaleno(a, b, c)) {
            System.out.println("Escaleno: Apresenta todos os tres lados com medidas diferentes.");
        } else {
            System.out.println("As medidas informadas nao formam um tringulo valido!!!");
        }
    }
}
