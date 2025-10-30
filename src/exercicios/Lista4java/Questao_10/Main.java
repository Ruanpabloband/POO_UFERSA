package exercicios.Lista4java.Questao_10;

public class Main {
    public static void main(String[] args) {
        ITransferencia downloadHTTP = new TransferenciaHTTP();

        downloadHTTP.iniciarDownload(100);
    }
}