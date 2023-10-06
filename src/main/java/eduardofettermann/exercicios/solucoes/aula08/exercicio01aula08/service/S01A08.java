package eduardofettermann.exercicios.solucoes.aula08.exercicio01aula08.service;

import eduardofettermann.exercicios.model.Soluction;

public class S01A08 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 01 - Maven + Streams
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
