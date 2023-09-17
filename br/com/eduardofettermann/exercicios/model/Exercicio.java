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
    };
    void resolve();

}

