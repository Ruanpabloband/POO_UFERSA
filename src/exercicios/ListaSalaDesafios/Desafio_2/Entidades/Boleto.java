package exercicios.ListaSalaDesafios.Desafio_2.Entidades;

import exercicios.ListaSalaDesafios.Desafio_2.Interfaces.ProcessadorPagamento;
public class Boleto implements ProcessadorPagamento {

    @Override
    public boolean processar(double valor) {
        System.out.println("Boleto de R$ " + valor + " gerado. Aguardando pagamento.");
        return true;
    }
}

