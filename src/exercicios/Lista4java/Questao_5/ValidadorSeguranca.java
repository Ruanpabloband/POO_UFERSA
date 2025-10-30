package exercicios.Lista4java.Questao_5;

public class ValidadorSeguranca extends ValidadorBase {

    @Override
    public void validarAcesso(String senha) {
        if (validarFormato(senha)) {

            if (senha.length() >= 8 && senha.contains("A")) {
                System.out.println("Acesso OK");
            } else {
                System.out.println("Acesso Negado");
            }

        } else {
            System.out.println("Formato invalido!");
        }
    }
}