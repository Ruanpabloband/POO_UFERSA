package exercicios.ListaSalaDesafios.Desafio_2;

import exercicios.ListaSalaDesafios.Desafio_2.Entidades.*;
import exercicios.ListaSalaDesafios.Desafio_2.Interfaces.ProcessadorPagamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    SISTEMA DE PAGAMENTOS - E-COMMERCE");
        System.out.println("========================================\n");

        Checkout checkout = new Checkout();

        ProcessadorPagamento cartao = new CartaoCredito(1000);
        ProcessadorPagamento pix = new Pix();
        ProcessadorPagamento boleto = new Boleto();

        System.out.println("=== SIMULACAO DE COMPRAS ===\n");

        System.out.println("Compra 1: R$ 800,00");
        checkout.finalizarCompra(cartao, 800.0);

        System.out.println("\nCompra 2: R$ 1200,00");
        checkout.finalizarCompra(cartao, 1200.0);

        System.out.println("\nCompra 3: R$ 300,00");
        checkout.finalizarCompra(pix, 300.0);

        System.out.println("\nCompra 4: R$ 150,00");
        checkout.finalizarCompra(boleto, 150.0);

        System.out.println("\n========================================");
        System.out.println("    FIM DAS SIMULACOES");
        System.out.println("========================================");
    }
}
