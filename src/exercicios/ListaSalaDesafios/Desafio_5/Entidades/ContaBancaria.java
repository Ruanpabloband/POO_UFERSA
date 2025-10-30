package exercicios.ListaSalaDesafios.Desafio_5.Entidades;

import exercicios.ListaSalaDesafios.Desafio_5.Intefaces.*;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements Registravel {
    protected int numeroConta;
    protected double saldo;
    protected List<String> historico;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
    }

    @Override
    public void adicionarAoHistorico(String transacao) {
        historico.add(transacao);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            adicionarAoHistorico("Deposito: R$ " + valor);
            System.out.println("✓ Deposito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("✗ Valor invalido para deposito!");
        }
    }

    public abstract boolean sacar(double valor);

    public void exibirHistorico() {
        System.out.println("\n--- Historico de Transacoes (Conta " + numeroConta + ") ---");
        for (String transacao : historico) {
            System.out.println("  • " + transacao);
        }
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        System.out.println("---------------------------------------");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}