package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.service;

import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.Conta;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.ContaCorrente;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.ContaPoupanca;
import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio03lista4.model.SeguroDeVida;

public class TestaTributavel {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca(2000);
        Conta contaCorrente = new ContaCorrente(2000);
        SeguroDeVida seguroDeVida = new SeguroDeVida(1000);
        seguroDeVida.retornaTributos();

    }
}
