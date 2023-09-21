package br.com.eduardofettermann.exercicios.model;

import br.com.eduardofettermann.exercicios.service.Menu;

import java.util.Scanner;

public interface Exercicio {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    default void exibeEnunciado(){
        System.out.println("""
                - Exercicio 01
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
    }
    void resolve();
    default void resolveNovamente(){
        System.out.println("""
                Você deseja executar a solução novamente?
                1 - Sim
                
                0 - Não
                """);
        int respostaDigitada = scanner.nextInt();
        switch (respostaDigitada) {
            case (1) -> this.resolve();
            case (0) -> menu.exibeMenuFinal();
        }
    }
}

