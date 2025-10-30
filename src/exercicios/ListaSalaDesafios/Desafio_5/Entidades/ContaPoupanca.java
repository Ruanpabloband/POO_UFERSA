package exercicios.ListaSalaDesafios.Desafio_5.Entidades;

public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_SAQUE = 1.00;

    public ContaPoupanca(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;

        if (valor > 0 && saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            adicionarAoHistorico("Saque: R$ " + valor + " (Taxa: R$ " + TAXA_SAQUE + ")");
            System.out.println("✓ Saque de R$ " + valor + " realizado com sucesso!");
            System.out.println("  Taxa cobrada: R$ " + TAXA_SAQUE);
            return true;
        } else {
            System.out.println("✗ Saque nao autorizado! Saldo insuficiente (incluindo taxa de R$ " + TAXA_SAQUE + ")");
            return false;
        }
    }
}