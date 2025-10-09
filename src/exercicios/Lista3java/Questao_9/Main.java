package exercicios.Lista3java.Questao_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha o tipo de livro:");
        System.out.println("""
                
                1 - Livro comum
                2 - Livro Didatico
                3 - Livro Raro
                
                """);
        int tipo = scanf.nextInt();
        scanf.nextLine();

        Livro livro = null;

        switch (tipo) {
            case 1:

                System.out.println("Informe o título do livro:");
                String titulo = scanf.nextLine();

                System.out.println("Informe o autor do livro:");
                String autor = scanf.nextLine();

                System.out.println("Informe o ano de publicação:");
                int ano = scanf.nextInt();

                System.out.println("Informe o preço do livro:");
                double preco = scanf.nextDouble();
                scanf.nextLine();
                livro = new Livro(titulo, autor, ano, preco);
                break;
            case 2:

                System.out.println("Informe o título do livro:");
                String tituloDidatico = scanf.nextLine();

                System.out.println("Informe o autor do livro:");
                String autorDidatico = scanf.nextLine();

                System.out.println("Informe o ano de publicação:");
                int anoDidatico = scanf.nextInt();

                System.out.println("Informe o preço do livro:");
                double precoDidatico = scanf.nextDouble();
                scanf.nextLine();
                System.out.println("Informe a disciplina do livro didático:");
                String disciplina = scanf.nextLine();
                livro = new LivroDidatico(tituloDidatico, autorDidatico, anoDidatico, precoDidatico, disciplina);
                break;
            case 3:

                System.out.println("Informe o título do livro:");
                String tituloRaro = scanf.nextLine();

                System.out.println("Informe o autor do livro:");
                String autorRaro = scanf.nextLine();

                System.out.println("Informe o ano de publicação:");
                int anoRaro = scanf.nextInt();

                System.out.println("Informe o preço do livro:");
                double precoRaro = scanf.nextDouble();
                scanf.nextLine();
                System.out.println("Informe a edição limitada do livro raro:");
                String edicao = scanf.nextLine();
                livro = new LivroRaro(tituloRaro, autorRaro, anoRaro, precoRaro, edicao);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if (livro != null) {
            livro.exibirFichaCatalografica();
            System.out.println("Informe a quantidade de dias de atraso:");
            int dias = scanf.nextInt();
            System.out.printf("Multa por atraso: R$ %.2f\n", livro.calcularMultaAtraso(dias));
        }
    }
}
