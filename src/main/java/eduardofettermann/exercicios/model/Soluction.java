package eduardofettermann.exercicios.model;

import eduardofettermann.exercicios.service.Menu;

import java.util.Scanner;

public interface Soluction {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    default void printQuestion() {
        System.out.println("""
                - Exercicio 01
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
    }

    void resolves();

    default void questionIfResolvesAgain() {
        System.out.println("""
                                
                Você deseja executar a solução novamente?
                1 - Sim
                                
                0 - Não
                
                """);
        int respostaDigitada = scanner.nextInt();
        switch (respostaDigitada) {
            case (1) -> this.resolves();
            case (0) -> menu.showEndMenu();
        }
    }
}

