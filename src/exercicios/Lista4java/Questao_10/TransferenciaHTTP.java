package exercicios.Lista4java.Questao_10;

public class TransferenciaHTTP implements ITransferencia {

    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;
        while (bytesRecebidos < tamanhoTotal && continuar) {
            bytesRecebidos++;

            int progresso = (bytesRecebidos * 100) / tamanhoTotal;
            System.out.println("Progresso: " + progresso + "%");

            if (progresso >= 50) {
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }

        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo!");
        } else {
            System.out.println("Download Pausado/Interrompido!");
        }
    }
}
