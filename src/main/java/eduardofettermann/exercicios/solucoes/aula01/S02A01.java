package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

//Exercicio 02
//        Crie um programa que receba 2 números e imprima na tela.

public class S02A01 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 02 
                Crie um programa que receba 2 números e imprima na tela.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite o primeiro número inteiro:");
        int primeroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int segundoNumero = scanner.nextInt();
        System.out.println("Os números digitados foram: " + primeroNumero + " e " + segundoNumero);
        questionIfResolvesAgain();
    }
}
