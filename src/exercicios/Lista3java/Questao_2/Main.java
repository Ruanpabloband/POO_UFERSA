package exercicios.Lista3java.Questao_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Escolha uma opcao: ");
        System.out.println("""
                
                1- Conta Bancaria
                2- Conta Corrente
                3- Conta Poupança
                
                """);

        int escolha = scanf.nextInt();
        scanf.nextLine();

        ContaBancaria contaBancaria = null;

        switch (escolha) {
            case 1:
                System.out.println("Conta Bancaria:");
                System.out.println("Informe o numero da conta: ");
                int numeroConta = scanf.nextInt();
                scanf.nextLine();

                System.out.println("Informe o titular da conta: ");
                String titularConta = scanf.nextLine();

                System.out.println("Informe o saldo da conta: ");
                double saldoConta = scanf.nextDouble();
                contaBancaria = new ContaBancaria(numeroConta, saldoConta, titularConta);
                break;
            case 2:
                System.out.println("Conta Corrente: ");
                System.out.println("Informe o numero da conta: ");
                int numeroContaCorrente = scanf.nextInt();
                scanf.nextLine();

                System.out.println("Informe o titular da conta: ");
                String titularContaCorrente = scanf.nextLine();

                System.out.println("Informe o saldo da conta: ");
                double saldoContaCorrente = scanf.nextDouble();
                System.out.println("Informe o quanto é o limite especial: ");
                double limiteEspecial = scanf.nextDouble();
                contaBancaria = new ContaCorrente(numeroContaCorrente, saldoContaCorrente, titularContaCorrente, limiteEspecial);
                break;

            case 3:
                System.out.println("Conta Poupanca: ");
                System.out.println("Informe o numero da conta: ");
                int numeroContaPoupanca = scanf.nextInt();
                scanf.nextLine();

                System.out.println("Informe o titular da conta: ");
                String titularContaPoupanca = scanf.nextLine();

                System.out.println("Informe o saldo da conta: ");
                double saldoContaPoupanca = scanf.nextDouble();
                System.out.println("Informe a taxa de rendimento: ");
                double taxarendimento = scanf.nextDouble();
                contaBancaria = new ContaPoupanca(numeroContaPoupanca, saldoContaPoupanca, titularContaPoupanca, taxarendimento);
                break;

            default:
                System.out.println("Opcao invalida!");
                break;
        }
        if (contaBancaria == null) {
            System.out.println("Nenhuma conta foi criada. Encerrando o programa.");
            scanf.close();
            return;
        }

        System.out.println("Saldo em conta: ");
        contaBancaria.consultarSaldo();

        int outraopcao;
        do {
            System.out.println("""
                    
                    1 - Sacar
                    2 - Depositar
                    3 - Consultar saldo
                    4 - Adicionar Rendimento
                    
                    0 - Sair
                    """);

            outraopcao = scanf.nextInt();

            switch (outraopcao) {
                case 1:
                    System.out.println("Quanto deseja sacar: ");
                    double moneySaque = scanf.nextDouble();
                    contaBancaria.sacar(moneySaque);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar: ");
                    double moneyDeposito = scanf.nextDouble();
                    contaBancaria.depositar(moneyDeposito);
                    break;
                case 3:
                    System.out.println("Consultar saldo: ");
                    contaBancaria.consultarSaldo();
                    break;
                case 4:
                    contaBancaria.adicionarRendimento();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (outraopcao != 0);

        scanf.close();
    }
}
