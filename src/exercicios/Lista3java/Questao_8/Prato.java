//Questão 8: Sistema de Restaurante
//Implemente a classe Prato com os atributos nome, preco, tempoPreparo e ingredientes (lista), e os
//métodos:
//calcularTaxaServico() - retorna 10% do preço
//exibirCardapio()

package exercicios.Lista3java.Questao_8;

import java.util.List;

class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo;
    protected List<String> ingredientes;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.println("\n--- Cardápio ---");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Tempo de preparo: " + tempoPreparo + " min");
        System.out.println("Ingredientes:");
        for (String ing : ingredientes) {
            System.out.println("- " + ing);
        }
    }
}

//a. Crie a classe PratoVegano que herda de Prato e possui atributo certificacaoVegan. Sobrescreva
//calcularTaxaServico() para retornar 5% do preço.

class PratoVegano extends Prato {
    private String certificacaoVegan;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingredientes, String certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.05;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Certificação Vegana: " + certificacaoVegan);
    }

    public String getCertificacaoVegan() {
        return certificacaoVegan;
    }

    public void setCertificacaoVegan(String certificacaoVegan) {
        this.certificacaoVegan = certificacaoVegan;
    }
}

//b. Crie a classe PratoGourmet que herda de Prato e possui atributo chefResponsavel. Sobrescreva
//calcularTaxaServico() para retornar 15% do preço.

class PratoGourmet extends Prato {
    private String chefResponsavel;

    public PratoGourmet(String nome, double preco, int tempoPreparo, List<String> ingredientes, String chefResponsavel) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.chefResponsavel = chefResponsavel;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.15;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Chef responsável: " + chefResponsavel);
    }

    public String getChefResponsavel() {
        return chefResponsavel;
    }

    public void setChefResponsavel(String chefResponsavel) {
        this.chefResponsavel = chefResponsavel;
    }
}
