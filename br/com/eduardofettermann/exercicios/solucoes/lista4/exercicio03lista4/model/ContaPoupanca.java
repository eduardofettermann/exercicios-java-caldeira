package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model;

public class ContaPoupanca extends Conta implements Tributavel{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public double retornaTributos() {
        return 0;
    }

    public double retornaSaldoLiquido() {
        return getSaldo() - 0;
    }

}
