package exercicios.Lista3java.Questao_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("""
                Escolha uma opcao:
                
                1 - Curso Comum
                2 - Curso Presencial
                3 - Curso Online
                
                """);

        int escolha = scanf.nextInt();
        Cursos cursos = null;

        switch (escolha) {
            case 1:
                System.out.println("Informe o nome do curso: ");
                String nomeCurso = scanf.next();
                System.out.println("Informe a carga horaria do curso: ");
                double cargaHorariaCurso = scanf.nextDouble();
                System.out.println("Informe o preco do curso: ");
                double precoCurso = scanf.nextDouble();
                System.out.println("Informe o nivel do curso (Basico/Intermediario/Avancado): ");
                String nivelCurso = scanf.next();
                cursos = new Cursos(nomeCurso, cargaHorariaCurso, precoCurso, nivelCurso);
                break;

            case 2:
                scanf.nextLine();
                System.out.println("Informe o nome do curso: ");
                String nomeCursoPresencial = scanf.nextLine();
                System.out.println("Informe a carga horaria do curso: ");
                double cargaHorariaCursoPresencial = scanf.nextDouble();
                System.out.println("Informe o preco do curso: ");
                double precoCursoPresencial = scanf.nextDouble();
                scanf.nextLine();
                System.out.println("Informe o nivel do curso (Basico/Intermediario/Avancado): ");
                String nivelCursoPresencial = scanf.nextLine();
                System.out.println("Informe o local do curso: ");
                String local = scanf.nextLine();
                cursos = new CursoPresencial(nomeCursoPresencial, cargaHorariaCursoPresencial, precoCursoPresencial, nivelCursoPresencial, local);
                break;

            case 3:
                scanf.nextLine();
                System.out.println("Informe o nome do curso: ");
                String nomeCursoOnline = scanf.nextLine();
                System.out.println("Informe a carga horaria do curso: ");
                double cargaHorariaCursoOnline = scanf.nextDouble();
                System.out.println("Informe o preco do curso: ");
                double precoCursoOnline = scanf.nextDouble();
                scanf.nextLine();
                System.out.println("Informe o nivel do curso (Basico/Intermediario/Avancado): ");
                String nivelCursoOnline = scanf.nextLine();
                System.out.println("Informe a plataforma do curso: ");
                String plataforma = scanf.nextLine();
                cursos = new CursoOnline(nomeCursoOnline, cargaHorariaCursoOnline, precoCursoOnline, nivelCursoOnline, plataforma);
                break;

            default:
                System.out.println("Opcao invalida!!!");
                break;
        }

        if (cursos != null) {
            System.out.println("\n <<<Informacoes do Curso>>> ");
            cursos.exibirInformacoes();
            System.out.println("Desconto aplicado: R$ " + cursos.calcularDesconto());
        }

        scanf.close();
    }
}
