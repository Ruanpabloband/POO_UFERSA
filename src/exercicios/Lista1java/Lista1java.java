package exercicios.Lista1java;

import java.util.Scanner;

public class Lista1java {


    //Nível 1: Entrada, Processamento e Saída

    /* 1.Faça um programa para calcular o estoque médio de uma peça, sendo que:
     * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
     */

    public static void questao1() {

        Scanner scanf = new Scanner(System.in);

        double quantidadeMinima, quantidadeMaxima, estoqueMedio;

        System.out.println("Informe a quantidade minima:");
        quantidadeMinima = scanf.nextDouble();

        System.out.println("Informe a quantidade maxima:");
        quantidadeMaxima = scanf.nextDouble();

        estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("Estoque media e = %.2f\n", estoqueMedio);

        scanf.close();
    }


    /*
     * 2.Faça um programa que:
     * Leia a cotação do dólar
     * Leia um valor em dólares
     * Converta esse valor para Real
     * Mostre o resultado
     */

    public static void questao2() {
        Scanner scanf = new Scanner(System.in);
        double cotacao, dolares, real;
        System.out.println("Informe a cotacao do dolar:");
        cotacao = scanf.nextDouble();
        System.out.println("Informe a quantidade de dolares:");
        dolares = scanf.nextDouble();
        real = cotacao * dolares;
        System.out.printf("O valor em reais e: %.2f", real);

        scanf.close();
    }


    /* 3.Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados:
    Identificação do vendedor
    Código da peça
    Preço unitário da peça
    Quantidade vendida
     */

    public static void questao3() {
        Scanner scanf = new Scanner(System.in);

        String identificacaoVendedor;
        int codigoPeca, quantidadeVendida;
        double precoUnitario, comissaoVendedor, totalVendas;

        System.out.println("Informe a identificação do vendedor:");
        identificacaoVendedor = scanf.next();

        System.out.println("Informe o código da peça:");
        codigoPeca = scanf.nextInt();

        System.out.println("Informe o preço unitário da peça:");
        precoUnitario = scanf.nextDouble();

        System.out.println("Informe a quantidade de peças vendidas:");
        quantidadeVendida = scanf.nextInt();

        totalVendas = precoUnitario * quantidadeVendida;
        comissaoVendedor = totalVendas * 0.05;

        System.out.printf("O total de vendas do vendedor %s (Código da peça: %d) foi de R$%.2f e sua comissão é R$%.2f.\n",
                identificacaoVendedor, codigoPeca, totalVendas, comissaoVendedor);

        scanf.close();
    }


    /* 4.Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os valores lidos, baseando-se na utilização do conceito de propriedade distributiva.
     Dica: se forem lidas as variáveis A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e por último C com D.
     Note que para cada operação serão utilizadas seis combinações.
     Assim sendo, devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.
     */

    public static void questao4() {
        Scanner scanf = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Informe um valor numero para A:");
        A = scanf.nextInt();
        System.out.println("Informe um valor numero para B:");
        B = scanf.nextInt();
        System.out.println("Informe um valor numero para C:");
        C = scanf.nextInt();
        System.out.println("Informe um valor numero para D:");
        D = scanf.nextInt();

        System.out.println("Seis combinacoes. \n Seis Adicoes. \n Seis Multiplicacoes.");

        System.out.println();

        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println();

        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        scanf.close();
    }


    /*
     * 5.Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.
     * Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
     * Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
     * Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12.
     * O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem.
     * Dica: trabalhe com valores reais
     */

    public static void questao5() {
        Scanner scanf = new Scanner(System.in);

        double tempoGastoHoras, velocidadeMedia, distancia, litrosUsados;

        System.out.println("Informe o tempo gasto na viagem (horas):");
        tempoGastoHoras = scanf.nextDouble();

        System.out.println("Informe a velocidade média (Km/h):");
        velocidadeMedia = scanf.nextDouble();

        distancia = tempoGastoHoras * velocidadeMedia;
        litrosUsados = distancia / 12;

        System.out.printf("A velocidade media foi de %.2f (Km/h)", velocidadeMedia);
        System.out.println();
        System.out.printf("O tempo gasto foi de %.2f (Horas)", tempoGastoHoras);
        System.out.println();
        System.out.printf("A distancia que esse automovel percorreu foi de %.2f (Km)", distancia);
        System.out.println();
        System.out.printf("A quantidade de litros que foi usada na viagem e %.2f L ", litrosUsados);

        scanf.close();

    }


    /*
    6. Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit.
    A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5.
    Em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa é a temperatura em graus Celsius.
     */

    public static void questao6() {
        Scanner scanf = new Scanner(System.in);

        double c, f;

        System.out.println("Conversao de Celsius para Fahrenheit:");
        System.out.println("Informe a temperatura em Celsius:");
        c = scanf.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.printf("A temperatura em Fahrenheit e %.2f\n", f);

        scanf.close();
    }


    /*
    7. Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius.
    A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) * 5 / 9.
    Em que a variável F é a temperatura em graus Fahrenheit e a variável C é a temperatura em graus Celsius.
     */

    public static void questao7() {
        Scanner scanf = new Scanner(System.in);

        double c, f;

        System.out.println("Conversor de Fahrenheit em Celsius");
        System.out.println("Informe a temperatura em Fahrenheit:");
        f = scanf.nextDouble();

        c = (f - 32) * 5 / 9;

        System.out.printf("A temperatura em Celsius e: %.2f\n", c);

        scanf.close();
    }


    /*
    8. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
    V = 3.14159 R R * A Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
     */

    public static void questao8() {
        Scanner scanf = new Scanner(System.in);

        double volume, raio, altura;

        System.out.println("Informe o raio da lata de oleo:");
        raio = scanf.nextDouble();

        System.out.println("Informe a altura da lata de oleo:");
        altura = scanf.nextDouble();

        //Pode ser usado o "Math.PI" para chegar a esse valor que voce dar na questão e usei tambem o "Math.pow" para pegar o raio ao quadrado
        volume = 3.14159 * (Math.pow(raio, 2)) * altura;

        System.out.printf("O volume da lata de oleo e: %.2f (cm³)\n", volume);

        scanf.close();
    }



    /*
    9. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
        Considerar ano com 365 dias e mês com 30 dias.
     */

    public static void questao9() {
        Scanner scanf = new Scanner(System.in);

        int idadeAnos, idadeDias, idadeMeses, totalDias;

        System.out.println("Informe sua idade em dias:");
        idadeDias = scanf.nextInt();

        System.out.println("Informe sua idade em meses:");
        idadeMeses = scanf.nextInt();

        System.out.println("Meu genuino usuario(a), informe sua idade em anos:");
        idadeAnos = scanf.nextInt();

        totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.printf("Sua idade em anos e %d\n", idadeAnos);
        System.out.printf("Sua idade em meses e %d\n", idadeMeses);
        System.out.printf("Sua idade em dias e %d\n", idadeDias);
        System.out.printf("Sua idade total em dias (considerando 365 dias/ano e 30 dias/mes): %d\n", totalDias);

        scanf.close();

    }


    /*
    10. Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos de ordem existentes entre eles.
    Os relacionamentos possíveis são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
    */

    public static void questao10() {
        Scanner scanf = new Scanner(System.in);

        int n1, n2;

        System.out.println("Informe o primeiro numero:");
        n1 = scanf.nextInt();

        System.out.println("Informe o segundo numero:");
        n2 = scanf.nextInt();

        System.out.println("Numeros iguais: " + (n1 == n2));
        System.out.println("Numeros nao iguais: " + (n1 != n2));
        System.out.println("Maior: " + (n1 > n2));
        System.out.println("Menor: " + (n1 < n2));
        System.out.println("Maior ou igual: " + (n1 >= n2));
        System.out.println("Menor ou igual: " + (n1 <= n2));

        scanf.close();
    }

    // Nível 2: Estruturas Condicionais

    /*
    2.1  Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A.
         Apresentar os valores antes e depois da troca.
     */

    public static void questao11() {
        Scanner scanf = new Scanner(System.in);

        int A, B, troca;

        System.out.println("Informe o valor de A:");
        A = scanf.nextInt();

        System.out.println("Informe o valor de B:");
        B = scanf.nextInt();

        System.out.printf("Valor de A: %d\n", A);
        System.out.printf("Valor de B: %d\n", B);

        troca = A;
        A = B;
        B = troca;

        System.out.printf("Valor de A: %d\n", A);
        System.out.printf("Valor de B: %d\n", B);

        scanf.close();

    }


    /*
    2.2 Escreva um programa que leia um número inteiro e exiba o seu módulo.
    O módulo de um número x é:
    x, se x é maior ou igual a zero.
    x * (-1), se x é menor que zero.
     */

    public static void questao12() {
        Scanner scanf = new Scanner(System.in);
        int n1;

        System.out.println("Informe um valor:");
        n1 = scanf.nextInt();

        if (n1 >= 0) {
            System.out.printf("O modulo de %d e: |%d|\n", n1, n1);
        } else {
            System.out.printf("Numero com modulo: |%d|\n", n1 * (-1));
        }

        scanf.close();

    }


    /*
    2.3 Escreva um programa que leia 5 números inteiros e imprima na tela os valores em ordem crescente e decrescente.
     */

    public static void questao13() {
        Scanner scanf = new Scanner(System.in);
        int i;

        int[] valores = new int[5];

        System.out.println("Informe os numeros:");
        for (i = 0; i < 5; i++) {
            valores[i] = scanf.nextInt();
        }
        for (i = 0; i < 5; i++) {
            System.out.printf("Numeros em ordem crescente: %d\n", valores[i]);
        }

        System.out.println();

        for (i = 4; i >= 0; i--) {
            System.out.printf("Numeros em ordem decrescente: %d\n", valores[i]);
        }
        scanf.close();
    }


    /*
    2.4 Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
     */

    public static void questao14() {
        Scanner scanf = new Scanner(System.in);

        int n1, n2, diferenca;

        System.out.println("Informe o primeiro numero:");
        n1 = scanf.nextInt();

        System.out.println("Informe o segundo numero:");
        n2 = scanf.nextInt();

        if (n1 > n2) {
            diferenca = n1 - n2;
        } else {
            diferenca = n2 - n1;
        }
        System.out.printf("A diferenca entre esses dois numeros e: %d\n", diferenca);

        scanf.close();
    }

    /*
    2.5 Escreva um programa que leia quatro notas escolares de um aluno e apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar for maior ou igual a 7.
    Se o valor da média for menor que 7, solicitar a nota do recuperação, somar com o valor da média e obter a nova média.
    Se a nova média for maior ou igual a 7, apresentar uma mensagem informando que o aluno foi aprovado na recuperação.
    Se o aluno não foi aprovado, apresentar uma mensagem informando a condição de reprovado.
    Apresentar junto com as mensagens o valor da média do aluno.
     */

    public static void questao15() {
        Scanner scanf = new Scanner(System.in);

        double n1, n2, n3, n4, recuperacao, media, novaMedia;

        System.out.println("Informe a primeira nota:");
        n1 = scanf.nextDouble();

        System.out.println("Informe a segunda nota:");
        n2 = scanf.nextDouble();

        System.out.println("Informe a terceira nota:");
        n3 = scanf.nextDouble();

        System.out.println("Informe a quarta nota:");
        n4 = scanf.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("Voce foi aprovado com sucesso, com media: %.2f\n", media);
        } else {
            System.out.println("Voce esta em recuperacao, sua media foi de: " + media);
            System.out.println("Informe a nota da recuperacao: ");
            recuperacao = scanf.nextDouble();

            novaMedia = (media + recuperacao) / 2;

            if (novaMedia >= 7) {
                System.out.printf("Aluno aprovado na recuperacao, com media: %.2f\n", novaMedia);
            } else {
                System.out.printf("Aluno reprovado com media: %.2f\n", novaMedia);
            }
        }
        scanf.close();
    }


    /*
    2.6 Escreva um programa que leia dois números e exiba mensagem informando o valor do maior número e o valor do menor número.
    Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
     */

    public static void questao16() {
        Scanner scanf = new Scanner(System.in);

        double n1, n2;

        System.out.println("Informe o primeiro valor:");
        n1 = scanf.nextDouble();

        System.out.println("Informe o segundo valor:");
        n2 = scanf.nextDouble();

        if (n1 > n2) {
            System.out.printf("O maior valor e: %.2f e o menor valor e %.2f", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("O maior valor e %.2f e o menor valor %.2f", n2, n1);
        } else {
            System.out.println("Os valores sao iguais!!");
        }
        scanf.close();
    }


    /*
    2.7 Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove).
    Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”.
    Caso contrário, apresentar a mensagem “valor inválido”, em qualquer outro caso, informe "erro".
     */


    public static void questao17() {
        Scanner scanf = new Scanner(System.in);

        int n1;

        System.out.println("Informe um numero:");
        n1 = scanf.nextInt();

        if (n1 >= 0 && n1 <= 9) {
            System.out.println("Valor valido!");
        } else {
            System.out.println("Valor invalido!");
        }

        scanf.close();
    }


    /*
    2.8 Escreva um programa que leia um número inteiro (variável CÓDIGO).
    Verificar se o código é igual a 1, igual a 2 ou igual a 3.
    Caso não seja, apresentar a mensagem “Código inválido”.
    Ao ser verificado o código e constatado que é um valor válido,
    o programa deve verificar cada código em separado para determinar seu valor por extenso, ou seja,
    apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
     */


    public static void questao18() {
        Scanner scanf = new Scanner(System.in);

        int CODIGO;

        System.out.println("Informe um numero inteiro:");
        CODIGO = scanf.nextInt();

        switch (CODIGO) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Valor invalido!!");
                break;
        }
        scanf.close();
    }


    /*
    2.9 Escreva um programa que leia três valores para os lados de um triângulo (variáveis A, B e C).
    Verificar se cada lado é menor que a soma dos outros dois lados.
    Se sim, saber de A==B e se B==C, sendo verdade o triângulo é equilátero;
    Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles; e caso contrário, o triângulo será escaleno.
    Caso os lados fornecidos não caracterizarem um triângulo, avisar a ocorrência.
     */

    public static void questao19() {
        Scanner scanf = new Scanner(System.in);

        double A, B, C;

        System.out.println("Informe o valor de A:");
        A = scanf.nextDouble();

        System.out.println("Informe o valor de B:");
        B = scanf.nextDouble();

        System.out.println("Informe o valor de C:");
        C = scanf.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Tem condicoes de ser um triangulo!!");

            if (A == B && B == C) {
                System.out.println("E um triangulo equilatero");
            } else if (A == B || A == C || B == C) {
                System.out.println("E um triangulo isosceles");
            } else {
                System.out.println("E um triangulo escaleno");
            }

        } else {
            System.out.println("Os valores nao formam um triangulo!");
        }

        scanf.close();
    }


    /*
    2.10 Escrever um programa declarando três variáveis do tipo inteiro (a, b e c).
         Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente).
         Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.
    */

    public static void questao20() {
        Scanner scanf = new Scanner(System.in);

        int a, b, c;

        do {
            System.out.println("Informe o primeiro valor(tem que ser maior que 0):");
            a = scanf.nextInt();
            if (a <= 0) {
                System.out.println("Valor invalido!");
            }
        } while (a <= 0);

        do {
            System.out.println("Informe o segundo valor(tem que ser maior que 0):");
            b = scanf.nextInt();
            if (b <= 0) {
                System.out.println("Valor invalido!");
            }
        } while (b <= 0);

        do {
            System.out.println("Informe o terceiro valor(tem que ser maior que 0):");
            c = scanf.nextInt();
            if (c <= 0) {
                System.out.println("Valor invalido!");
            }
        } while (c <= 0);

        int maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        int menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;


        System.out.printf("Menor valor: %d x Maior valor: %d = %d\n", menor, maior, menor * maior);
        System.out.printf("Maior valor: %d ÷ Menor valor: %d = %.2f\n", maior, menor, (double) maior / menor);

        scanf.close();
    }


    /*
    2.11 Faça um programa que leia um número inteiro
    e mostre uma mensagem na tela indicando se este número é positivo ou negativo.
    */


    public static void questao21() {
        Scanner scanf = new Scanner(System.in);

        int n1;

        System.out.println("informe um numero inteiro:");
        n1 = scanf.nextInt();

        if (n1 > 0) {
            System.out.println("O numero e positivo!!");
        } else {
            System.out.println("O numero e negativo!!");
        }
        scanf.close();
    }


    /*
    Faça um programa que leia um número.
    Se positivo, armazene-o em A, se for negativo, em B.
    No final mostrar o os número em um único print.
     */

    public static void questao22() {
        Scanner scanf = new Scanner(System.in);

        int n1, A = 0, B = 0;

        System.out.println("Informe um valor:");
        n1 = scanf.nextInt();

        if (n1 > 0) {
            A = n1;
        } else if (n1 < 0) {
            B = n1;
        } else {
            System.out.println("O número é zero!");
        }

        System.out.println("Valores armazenados: A = " + A + ", B = " + B);
        scanf.close();
    }


    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int escolha;
        System.out.println("Escolha a questao que deseja executar:");
        escolha = scanf.nextInt();

        switch (escolha) {
            case 1:
                questao1();
                break;
            case 2:
                questao2();
                break;
            case 3:
                questao3();
                break;
            case 4:
                questao4();
                break;
            case 5:
                questao5();
                break;
            case 6:
                questao6();
                break;
            case 7:
                questao7();
                break;
            case 8:
                questao8();
                break;
            case 9:
                questao9();
                break;
            case 10:
                questao10();
                break;
            case 11:
                questao11();
                break;
            case 12:
                questao12();
                break;
            case 13:
                questao13();
                break;
            case 14:
                questao14();
                break;
            case 15:
                questao15();
                break;
            case 16:
                questao16();
                break;
            case 17:
                questao17();
                break;
            case 18:
                questao18();
                break;
            case 19:
                questao19();
                break;
            case 20:
                questao20();
                break;
            case 21:
                questao21();
                break;
            case 22:
                questao22();
                break;
            default:
                System.out.println("Opcao invalida!!");
                break;
        }
        scanf.close();
    }
}