package exercicios.ListaSalaDesafios.Desafio_2.Entidades;

import exercicios.ListaSalaDesafios.Desafio_2.Interfaces.ProcessadorPagamento;

public class CartaoCredito implements ProcessadorPagamento {
    protected int limite;

    public CartaoCredito(int limite) {
        this.limite = limite;
    }

    @Override
    public boolean processar(double valor) {
        if (valor <= limite) {
            System.out.println("Pagamento de R$ " + valor + " aprovado no Cartao de Credito.");
            return true;
        } else {
            return false;
        }
    }
}