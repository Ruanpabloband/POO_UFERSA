package exercicios.Lista4java.Questao_3;


public class processadorCSV implements IProcessadorDeDados {

    @Override
    public void processar(String[] dados) {
        System.out.println("Processando dados CSV...\n");

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Linha " + i + ": " + dados[i]);
        }
    }
}
