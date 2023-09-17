package br.com.eduardofettermann.exercicios.solucoes.lista2;

import br.com.eduardofettermann.exercicios.model.Exercicio;

public class Exercicio04Lista2 implements Exercicio {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 04
                Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
                Durante a execução o programa deve perguntar ao usuário se ele deseja continuar, se ele não quiser, deve digitar ‘n’
                para o programa encerrar.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite o primeiro número da operação: ");
        double nPrimeiro = scanner.nextDouble();
        System.out.println("Digite o segundo número da operação: ");
        double nSegundo = scanner.nextDouble();
        System.out.println("""
                Qual operação você deseja realizar?
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                """);
        int opcaoDigitada = scanner.nextInt();
        switch (opcaoDigitada) {
            case (1) -> System.out.printf("%.2f + %.2f = %.2f \n", nPrimeiro, nSegundo, (nPrimeiro + nSegundo));
            case (2) -> System.out.printf("%.2f - %.2f = %.2f \n", nPrimeiro, nSegundo, (nPrimeiro - nSegundo));
            case (3) -> System.out.printf("%.2f * %.2f = %.2f \n", nPrimeiro, nSegundo, (nPrimeiro * nSegundo));
            case (4) -> System.out.printf("%.2f / %.2f = %.2f \n", nPrimeiro, nSegundo, (nPrimeiro / nSegundo));
        }
        System.out.println("""
                Você deseja continuar?
                1 - Sim
                0 - Não
                """);
        int respostaDigitada = scanner.nextInt();
        switch (respostaDigitada) {
            case (1) -> resolve();
            case (0) -> menu.exibeMenuFinal();
        }
    }
}