package exercicios.Lista3java.Questao_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("""
                Escolha uma opcao:
                
                1 - Imovel comum
                2 - Apartamento
                3 - Casa
                
                """);

        int opcao = scanf.nextInt();

        Imovel imovel = null;

        switch (opcao) {
            case 1:
                System.out.println("Informe o endereco: ");
                String endereco = scanf.next();
                System.out.println("Informe a area: ");
                double area = scanf.nextDouble();
                System.out.println("Informe o numero do quarto: ");
                int numeroQuarto = scanf.nextInt();
                System.out.println("Informe o preco: ");
                double preco = scanf.nextDouble();
                imovel = new Imovel(endereco, area, numeroQuarto, preco);
                break;
            case 2:
                System.out.println("Informe o endereco do apartamento: ");
                String enderecoApartamento = scanf.next();
                System.out.println("Informe a area: ");
                double areaApartamento = scanf.nextDouble();
                System.out.println("Informe o numero do quarto: ");
                int numeroQuartoApartamento = scanf.nextInt();
                System.out.println("Informe o preco: ");
                double precoApartamento = scanf.nextDouble();
                System.out.println("Informe o andar: ");
                int andar = scanf.nextInt();
                System.out.println("Informe o valor do condominio: ");
                double valorCondominio = scanf.nextDouble();
                imovel = new Apartamento(enderecoApartamento, areaApartamento, numeroQuartoApartamento, precoApartamento, andar, valorCondominio);
                break;
            case 3:
                System.out.println("Informe o endereco da casa: ");
                String enderecoCasa = scanf.next();
                System.out.println("Informe a area da casa: ");
                double areaCasa = scanf.nextDouble();
                System.out.println("Informe o numero do quarto: ");
                int numeroQuartoCasa = scanf.nextInt();
                System.out.println("Informe o preco da casa: ");
                double precoCasa = scanf.nextDouble();
                System.out.println("Informe a area do quintal: ");
                double areaQuintal = scanf.nextDouble();
                System.out.println("Informe se tem piscina: ");
                boolean temPiscina = scanf.nextBoolean();
                imovel = new Casa(enderecoCasa, areaCasa, numeroQuartoCasa, precoCasa, areaQuintal, temPiscina);
                break;
            default:
                System.out.println("Opcao invalida!!!");
                break;
        }
        if (imovel != null) {
            System.out.println("Informacoes dos imoveis: ");
            imovel.exibirCaracteristicas();
            System.out.println("Taxa de administracao: " + imovel.calcularTaxaAdministracao());
        }
    }
}
