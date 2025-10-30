package exercicios.Lista4java.Questao_2;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("Ruan", 1, 4000);
        Desenvolvedor dev2 = new Desenvolvedor("Pablo", 2, 6000);
        Desenvolvedor dev3 = new Desenvolvedor("Lyss", 3, 9000);
        Desenvolvedor dev4 = new Desenvolvedor("Lara", 9, 5000);

        System.out.println(dev1.nome + " - Bonus: R$ " + dev1.calcularBonificacao());
        System.out.println(dev2.nome + " - Bonus: R$ " + dev2.calcularBonificacao());
        System.out.println(dev3.nome + " - Bonus: R$ " + dev3.calcularBonificacao());
        System.out.println(dev4.nome + " - Bonus: R$ " + dev4.calcularBonificacao());
    }
}

