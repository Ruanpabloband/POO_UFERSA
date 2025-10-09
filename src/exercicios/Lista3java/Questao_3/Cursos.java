//Questão 3: Sistema de Cursos
//Implemente a classe Curso com os atributos nome, cargaHoraria, preco e nivel (Básico, Intermediário,
//Avançado), e os métodos:
//calcularDesconto() - retorna 10% do preço
//exibirInformacoes()
//a. Crie a classe CursoPresencial que herda de Curso e possui atributo local. Sobrescreva
//calcularDesconto() para retornar 5% do preço.
//b. Crie a classe CursoOnline que herda de Curso e possui atributo plataforma. Sobrescreva
//calcularDesconto() para retornar 15% do preço

package exercicios.Lista3java.Questao_3;

public class Cursos {
    protected String nome;
    protected double cargaHoraria;
    protected double preco;
    protected String nivel;

    public Cursos(String nome, double cargaHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public String getnomeCurso() {
        return nome;
    }

    public void setnomeCurso(String nome) {
        this.nome = nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double calcularDesconto() {
        return preco * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Informacoes referente ao curso: ");
        System.out.println("Nome: " + nome);
        System.out.println("Carga Horaria: " + cargaHoraria);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Nivel: " + nivel);
    }
}

class CursoPresencial extends Cursos {

    protected String local;

    public CursoPresencial(String nome, double cargaHoraria, double preco, String nivel, String local) {
        super(nome, cargaHoraria, preco, nivel);
        this.local = local;
    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Local do seu curso: " + local);
    }
}

class CursoOnline extends Cursos {

    protected String plataforma;

    public CursoOnline(String nome, double cargaHoraria, double preco, String nivel, String plataforma) {
        super(nome, cargaHoraria, preco, nivel);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Sua plataforma de estudos e: " + plataforma);
    }
}