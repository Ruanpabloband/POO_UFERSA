package exercicios.Lista4java.Questao_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IComando> comandos = new ArrayList<>();
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());

        String[] parametrosExemplo = {"param1", "param2"};

        for (IComando cmd : comandos) {
            cmd.executar(parametrosExemplo);
        }
    }
}