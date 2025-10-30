package exercicios.Lista4java.Questao_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<IProcessadorDeDados> processadores = new ArrayList<>();

        processadores.add(new processadorCSV());

        String[] dadosCSV = {"ID,Nome,Idade", "1,Ruan,22", "2,Pablo,25", "3,Jackson,30"};

        for (IProcessadorDeDados proc : processadores) {
            proc.processar(dadosCSV);
        }
    }
}