package exercicios.ListaSalaDesafios.Desafio_2.Entidades;

import exercicios.ListaSalaDesafios.Desafio_2.Interfaces.ProcessadorPagamento;

public class Checkout {

    public void finalizarCompra(ProcessadorPagamento metodo, double valorTotal) {
        System.out.println("\n--- Processando Pagamento ---");
        boolean sucesso = metodo.processar(valorTotal);

        if (sucesso) {
            System.out.println("✓ Transacao realizada com sucesso!");
        } else {
            System.out.println("✗ Transacao falhou. Pagamento nao autorizado.");
        }
        System.out.println("-----------------------------");
    }
}
