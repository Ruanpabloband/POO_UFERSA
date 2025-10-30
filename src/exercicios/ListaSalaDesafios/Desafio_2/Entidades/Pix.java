package exercicios.ListaSalaDesafios.Desafio_2.Entidades;

import exercicios.ListaSalaDesafios.Desafio_2.Interfaces.ProcessadorPagamento;

public class Pix implements ProcessadorPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via PIX recebido com sucesso.");
        return true;
    }
}