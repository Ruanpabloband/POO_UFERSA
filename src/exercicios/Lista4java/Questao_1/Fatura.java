package exercicios.Lista4java.Questao_1;

public class Fatura implements IImprimivel {

    @Override
    public void imprimir(int copias) {
        if (copias > 5) {
            System.out.println("Imprimindo " + copias + " copias em modo rascunho.");
        } else {
            System.out.println("Imprimindo " + copias + " copias em modo alta qualidade.");
        }
    }
}