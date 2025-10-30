package exercicios.ListaSalaDesafios.Desafio_5.Entidades;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            adicionarAoHistorico("Saque: R$ " + valor);
            System.out.println("✓ Saque de R$ " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("✗ Saque não autorizado! Saldo insuficiente.");
            return false;
        }
    }
}