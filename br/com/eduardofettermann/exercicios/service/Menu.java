package br.com.eduardofettermann.exercicios.service;

import br.com.eduardofettermann.exercicios.model.Exercicio;
import br.com.eduardofettermann.exercicios.solucoes.lista1.*;
import br.com.eduardofettermann.exercicios.solucoes.lista2.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Exercicio exercicio01Lista1 = new Exercicio01Lista1();
    Exercicio exercicio02Lista1 = new Exercicio02Lista1();
    Exercicio exercicio03Lista1 = new Exercicio03Lista1();
    Exercicio exercicio04Lista1 = new Exercicio04Lista1();
    Exercicio exercicio05Lista1 = new Exercicio05Lista1();
    Exercicio exercicio06Lista1 = new Exercicio06Lista1();
    Exercicio exercicio07Lista1 = new Exercicio07Lista1();
    Exercicio exercicio08Lista1 = new Exercicio08Lista1();
    Exercicio exercicio09Lista1 = new Exercicio09Lista1();
    Exercicio exercicio10Lista1 = new Exercicio10Lista1();
    Exercicio exercicio11Lista1 = new Exercicio11Lista1();
    Exercicio exercicio12Lista1 = new Exercicio12Lista1();
    Exercicio exercicio13Lista1 = new Exercicio13Lista1();
    Exercicio exercicio01Lista2 = new Exercicio01Lista2();
    Exercicio exercicio04Lista2 = new Exercicio04Lista2();
    Exercicio exercicio05Lista2 = new Exercicio05Lista2();
    Exercicio exercicio06Lista2 = new Exercicio06Lista2();
    Exercicio exercicio07Lista2 = new Exercicio07Lista2();


    public void exibeMenuInicial() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual lista?
                    1 - Lista 1         2 - Lista 2
                    0 - Sair    
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (1) -> exibeMenuLista1();
                case (2) -> exibeMenuLista2();
                case (0) -> System.out.println("Encerrando...");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" +
                    "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void exibeMenuFinal() {
        try {
            Menu menu = new Menu();
            System.out.println("""
                    Você quer ver outra solução ou sair?
                    1 - Ver outro exercício
                    2 - Sair
                    """);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case (1) -> menu.exibeMenuInicial();
                case (2) -> System.out.println("Finalizado!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Tente digitar apenas número inteiros de 1 a 2, " +
                    "se o problema persistir tente novamente mais tarde!");
        }
    }

    public void exibeMenuLista1() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1         8 - Exercicio 8
                    2 - Exercicio 2         9 - Exercicio 9
                    3 - Exercicio 3         10 - Exercicio 10
                    4 - Exercicio 4         11 - Exercicio 11
                    5 - Exercicio 5         12 - Exercicio 12
                    6 - Exercicio 6         13 - Exercicio 13
                    7 - Exercicio 7   
                                        
                    0 - Voltar     
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> exibeMenuInicial();
                case (1) -> exercicio01Lista1.resolve();
                case (2) -> exercicio02Lista1.resolve();
                case (3) -> exercicio03Lista1.resolve();
                case (4) -> exercicio04Lista1.resolve();
                case (5) -> exercicio05Lista1.resolve();
                case (6) -> exercicio06Lista1.resolve();
                case (7) -> exercicio07Lista1.resolve();
                case (8) -> exercicio08Lista1.resolve();
                case (9) -> exercicio09Lista1.resolve();
                case (10) -> exercicio10Lista1.resolve();
                case (11) -> exercicio11Lista1.resolve();
                case (12) -> exercicio12Lista1.resolve();
                case (13) -> exercicio13Lista1.resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" +
                    "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void exibeMenuLista2() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1         6 - Exercicio 6
                    4 - Exercicio 4         7 - Exercicio 7
                    5 - Exercicio 5         
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> exibeMenuInicial();
                case (1) -> exercicio01Lista2.resolve();
                case (4) -> exercicio04Lista2.resolve();
                case (5) -> exercicio05Lista2.resolve();
                case (6) -> exercicio06Lista2.resolve();
                case (7) -> exercicio07Lista2.resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" +
                    "Se o problema persistir tente novamente mais tarde!");
        }
    }
}


