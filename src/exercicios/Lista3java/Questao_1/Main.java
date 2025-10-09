package exercicios.Lista3java.Questao_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha uma opcao: ");
        System.out.println("""
                1- Veiculo normal
                2- Moto
                3- Caminhao
                """);

        int opcao = scanf.nextInt();

        Veiculo veiculo = null;

        switch (opcao) {
            case 1:
                veiculo = new Veiculo();

                System.out.println("Veiculo Normal:");
                System.out.print("Informe o modelo: ");
                veiculo.setModelo(scanf.next());

                System.out.print("Informe a marca: ");
                veiculo.setMarca(scanf.next());

                System.out.print("Informe o ano: ");
                veiculo.setAno(scanf.nextInt());

                System.out.print("Informe o preco: ");
                veiculo.setPreco(scanf.nextDouble());
                break;

            case 2:
                Moto moto = new Moto();

                System.out.println("Moto:");
                System.out.print("Informe o modelo: ");
                moto.setModelo(scanf.next());

                System.out.print("Informe a marca: ");
                moto.setMarca(scanf.next());

                System.out.print("Informe o ano: ");
                moto.setAno(scanf.nextInt());

                System.out.print("Informe o preco: ");
                moto.setPreco(scanf.nextDouble());

                System.out.print("Digite a cilindrada da moto: ");
                moto.setCilindrada(scanf.nextInt());

                veiculo = moto;
                break;

            case 3:
                Caminhao caminhao = new Caminhao();

                System.out.println("Caminhao:");
                System.out.print("Informe o modelo: ");
                caminhao.setModelo(scanf.next());

                System.out.print("Informe a marca: ");
                caminhao.setMarca(scanf.next());

                System.out.print("Informe o ano: ");
                caminhao.setAno(scanf.nextInt());

                System.out.print("Informe o preco: ");
                caminhao.setPreco(scanf.nextDouble());

                System.out.print("Digite a capacidade de carga (toneladas): ");
                caminhao.setCapacidadeCarga(scanf.nextDouble());

                veiculo = caminhao;
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        if (veiculo != null) {
            System.out.println("\n<<Detalhes>>");
            veiculo.exibirDetalhes();
        }
    }
}
