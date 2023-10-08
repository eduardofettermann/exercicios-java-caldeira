package eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Calculator;

public class S03A08 implements Soluction {
    Calculator calculator = new Calculator();
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 03 - Testes unitários (fácil)
                Desenvolva uma aplicação Java utilizando o Gradle que seja uma calculadora com operações de
                adição,
                subtração,
                multiplicação,
                divisão,
                raiz quadrada e
                potência.
                Crie testes unitários para cada operação.
                Solução:
                """);
    }

    @Override
    public void resolves() {

    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
