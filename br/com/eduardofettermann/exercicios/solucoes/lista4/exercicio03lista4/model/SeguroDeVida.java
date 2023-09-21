package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model;

public class SeguroDeVida implements Tributavel {
    private double saldo;

    @Override
    public double retornaTributos() {
        return 42;
    }

    public double retornaSaldoLiquido() {
        return this.saldo - 42;
    }

    public SeguroDeVida(double saldo) {
        this.saldo = saldo;
    }
}
