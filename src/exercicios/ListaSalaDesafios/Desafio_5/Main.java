package exercicios.ListaSalaDesafios.Desafio_5;

import exercicios.ListaSalaDesafios.Desafio_5.Entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("      SISTEMA BANCARIO");
        System.out.println("========================================\n");

        ContaCorrente contaCorrente = new ContaCorrente(1001, 0.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2001, 0.00);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        for (ContaBancaria conta : contas) {
            String tipoConta = conta.getClass().getSimpleName();

            System.out.println("\n==========================================");
            System.out.println("Operacoes na " + tipoConta + " (Conta " + conta.getNumeroConta() + ")");
            System.out.println("==========================================");

            System.out.println("\n--- Deposito de R$ 1000,00 ---");
            conta.depositar(1000.00);

            System.out.println("\n--- Tentativa de Saque de R$ 300,00 ---");
            conta.sacar(300.00);

            System.out.println("\n--- Tentativa de Saque de R$ 900,00 ---");
            conta.sacar(900.00);

            conta.exibirHistorico();
        }

        System.out.println("\n========================================");
        System.out.println("      FIM DO SISTEMA BANCARIO");
        System.out.println("========================================");
    }
}