//Questão 2: Sistema Bancário
//Implemente a classe ContaBancaria com os atributos numeroConta, saldo e titular, e os métodos:
//depositar(double valor)
//sacar(double valor)
//consultarSaldo()

package exercicios.Lista3java.Questao_2;

public class ContaBancaria {
    protected int numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Conta %d | Titular: %s | Saldo: R$ %.2f%n", numeroConta, titular, saldo);
    }

    public void adicionarRendimento() {
        System.out.println("Esta conta nao possui rendimento!");
    }
}

//a. Crie a classe ContaCorrente que herda de ContaBancaria e possui atributo limiteChequeEspecial.
//Sobrescreva o método sacar() para permitir saques até o limite do cheque especial.

class ContaCorrente extends ContaBancaria {
    protected double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double saldo, String titular, double limiteEspecial) {
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente (mesmo com cheque especial).");
        }
    }
}

//b. Crie a classe ContaPoupanca que herda de ContaBancaria e possui atributo taxaRendimento. Adicione o
//método aplicarRendimento().

class ContaPoupanca extends ContaBancaria {
    protected double taxaRendimento;

    public ContaPoupanca(int numeroConta, double saldo, String titular, double taxaRendimento) {
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void adicionarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.printf("Rendimento aplicado. Novo saldo: R$ %.2f\n", saldo);
    }
}