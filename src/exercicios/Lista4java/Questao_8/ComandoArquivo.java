package exercicios.Lista4java.Questao_8;

public class ComandoArquivo implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Arquivo...");
        if (parametros != null && parametros.length > 0) {
            System.out.print("Parâmetros: ");
            for (String p : parametros) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
