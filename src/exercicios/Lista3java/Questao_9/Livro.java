package exercicios.Lista3java.Questao_9;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularMultaAtraso(int dias) {
        return dias * 2.0;
    }

    public void exibirFichaCatalografica() {
        System.out.println("\n Ficha Catalografica ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Preco: R$ " + preco);
    }
}

class LivroDidatico extends Livro {
    protected String disciplina;

    public LivroDidatico(String titulo, String autor, int anoPublicacao, double preco, String disciplina) {
        super(titulo, autor, anoPublicacao, preco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public double calcularMultaAtraso(int dias) {
        return dias * 1.0;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Disciplina: " + disciplina);
    }
}

class LivroRaro extends Livro {
    protected String edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, String edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    public String getEdicaoLimitada() {
        return edicaoLimitada;
    }

    public void setEdicaoLimitada(String edicaoLimitada) {
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int dias) {
        return dias * 5.0;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Edicao limitada: " + edicaoLimitada);
    }
}