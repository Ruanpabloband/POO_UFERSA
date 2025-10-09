//Questão 7: Sistema de Esportes
//Implemente a classe Esporte com os atributos nome, numeroJogadores, duracaoPartida e popularidade, e
//os métodos:
//calcularCustoEquipamento() - retorna valor base de R$ 500,00
//exibirRegras()

package exercicios.Lista3java.Questao_7;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected double duracaoPartida;
    protected int popularidade;

    public Esporte(String nome, int numeroJogadores, double duracaoPartida, int popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento() {
        return 500.00;
    }

    public void exibirRegras() {
        System.out.println("Nome: " + nome);
        System.out.println("Numero de jogadores: " + numeroJogadores);
        System.out.println("Duracao da partida: " + duracaoPartida);
        System.out.println("Popularidade: " + popularidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public double getDuracaoPartida() {
        return duracaoPartida;
    }

    public void setDuracaoPartida(double duracaoPartida) {
        this.duracaoPartida = duracaoPartida;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }
}

//a. Crie a classe Futebol que herda de Esporte e possui atributo tamanhoCampo. Sobrescreva
//calcularCustoEquipamento() para retornar R$ 300,00.

class Futebol extends Esporte {

    protected double tamanhoCampo;

    public Futebol(String nome, int numeroJogadores, double duracaoPartida, int popularidade, double tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 300.00;
    }

    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Tamanho do campo: " + tamanhoCampo);
    }

    public double getTamanhoCampo() {
        return tamanhoCampo;
    }

    public void setTamanhoCampo(double tamanhoCampo) {
        this.tamanhoCampo = tamanhoCampo;
    }
}

//b. Crie a classe Basquete que herda de Esporte e possui atributo alturaCesta. Sobrescreva
//calcularCustoEquipamento() para retornar R$ 400,00.

class Basquete extends Esporte {

    protected double alturaCesta;

    public Basquete(String nome, int numeroJogadores, double duracaoPartida, int popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.00;
    }

    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Altura da cesta: " + alturaCesta);
    }

    public double getAlturaCesta() {
        return alturaCesta;
    }

    public void setAlturaCesta(double alturaCesta) {
        this.alturaCesta = alturaCesta;
    }
}