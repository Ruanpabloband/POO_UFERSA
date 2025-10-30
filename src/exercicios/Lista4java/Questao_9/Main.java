package exercicios.Lista4java.Questao_9;

public class Main {
    public static void main(String[] args) {
        ProdutoAlimenticio produto = new ProdutoAlimenticio(10);

        System.out.print("Solicitacao de 12 unidades: ");
        produto.verificarDisponibilidade(12);

        System.out.print("Solicitacao de 10 unidades: ");
        produto.verificarDisponibilidade(10);

        System.out.print("Solicitacao de 5 unidades: ");
        produto.verificarDisponibilidade(5);
    }
}
