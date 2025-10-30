package exercicios.Lista4java.Questao_5;

public class Main {
    public static void main(String[] args) {
        ValidadorSeguranca validador = new ValidadorSeguranca();

        validador.validarAcesso("Abcdef12");
        validador.validarAcesso("senha");
    }
}

