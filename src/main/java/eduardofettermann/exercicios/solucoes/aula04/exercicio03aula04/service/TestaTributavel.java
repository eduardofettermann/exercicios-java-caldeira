package eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.service;

import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.Conta;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.ContaCorrente;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.ContaPoupanca;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.model.SeguroDeVida;

public class TestaTributavel {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca(2000);
        Conta contaCorrente = new ContaCorrente(2000);
        SeguroDeVida seguroDeVida = new SeguroDeVida(1000);
        seguroDeVida.retornaTributos();

    }
}
