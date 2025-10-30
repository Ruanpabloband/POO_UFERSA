package exercicios.Lista4java.Questao_6;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        logger.salvarLocal("Erro ao carregar modulo de relatorios");

        logger.salvarRemoto("Conexao estabelecida com o servidor remoto");
    }
}