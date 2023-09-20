package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public double retornaTributos() {
        return this.getSaldo() / 100;
    }
}
