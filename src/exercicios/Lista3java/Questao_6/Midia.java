//Questão 6: Sistema de Entretenimento
//Implemente a classe Midia com os atributos titulo, anoLancamento, duracao e preco, e os métodos:
//calcularPrecoAluguel() - retorna 10% do preço
//exibirInfo()

package exercicios.Lista3java.Questao_6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected double duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, double duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano do lancamento: " + anoLancamento);
        System.out.println("Duracap: " + duracao);
        System.out.println("Preco: " + preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

//a. Crie a classe Filme que herda de Midia e possui atributos diretor e genero. Sobrescreva
//calcularPrecoAluguel() para retornar 15% do preço.

class Filme extends Midia {

    protected String diretor;
    protected String genero;

    public Filme(String titulo, int anoLancamento, double duracao, double preco, String diretor, String genero) {
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.15;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Diretor: " + diretor);
        System.out.println("Genero: " + genero);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}

//b. Crie a classe Serie que herda de Midia e possui atributos numeroTemporadas e episodiosPorTemporada.
//Sobrescreva calcularPrecoAluguel() para retornar 12% do preço.

class Serie extends Midia {

    protected int numeroTemporadas;
    protected int episodiosPorTemporada;

    public Serie(String titulo, int anoLancamento, double duracao, double preco, int numeroTemporadas, int episodiosPorTemporada) {
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporadas = numeroTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.12;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Numero de temporadas: " + numeroTemporadas);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
}