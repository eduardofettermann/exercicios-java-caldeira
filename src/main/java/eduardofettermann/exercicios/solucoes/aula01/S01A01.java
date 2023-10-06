package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

//         Exercicio 01
//        Crie um programa que leia seu nome e imprima na tela.

public class S01A01 implements Soluction {

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 01 
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite seu nome;");
        String nomeDigitado = scanner.nextLine();
        System.out.println(nomeDigitado);
        questionIfResolvesAgain();
    }
}
