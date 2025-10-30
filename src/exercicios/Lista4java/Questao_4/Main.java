package exercicios.Lista4java.Questao_4;

public class Main {
    public static void main(String[] args) {
        TarefaLonga tarefa = new TarefaLonga();
        tarefa.executar();

        System.out.println("Status final: " + (tarefa.isConcluida() ? "Concluída" : "Pendente"));
    }
}
