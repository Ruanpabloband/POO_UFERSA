package exercicios.Lista4java.Questao_8;

public class ComandoRede implements IComando {

    @Override
    public void executar(String[] parametros) {
        System.out.println("Executando Comando de Rede...");
        if (parametros != null && parametros.length > 0) {
            System.out.print("Parametros: ");
            for (String p : parametros) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}