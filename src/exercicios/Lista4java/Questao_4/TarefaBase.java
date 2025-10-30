package exercicios.Lista4java.Questao_4;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida() {
        concluida = true;
        System.out.println("Tarefa concluida!");
    }

    public boolean isConcluida() {
        return concluida;
    }
}

