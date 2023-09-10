package br.com.eduardofettermann.exercicios.service;

import br.com.eduardofettermann.exercicios.model.Exercicio;
import br.com.eduardofettermann.exercicios.solucoes.*;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Exercicio exercicio01 = new Exercicio01();
    Exercicio exercicio02 = new Exercicio02();
    Exercicio exercicio04 = new Exercicio04();
    Exercicio exercicio05 = new Exercicio05();
    Exercicio exercicio06 = new Exercicio06();
    Exercicio exercicio07 = new Exercicio07();
    Exercicio exercicio08 = new Exercicio08();
    Exercicio exercicio09 = new Exercicio09();
    Exercicio exercicio10 = new Exercicio10();
    Exercicio exercicio11 = new Exercicio11();
    Exercicio exercicio12 = new Exercicio12();
    Exercicio exercicio13 = new Exercicio13();

    public void exibeMenuInicial() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1         8 - Exercicio 8
                    2 - Exercicio 2         9 - Exercicio 9
                    4 - Exercicio 4         10 - Exercicio 10
                    5 - Exercicio 5         11 - Exercicio 11
                    6 - Exercicio 6         12 - Exercicio 12
                    7 - Exercicio 7         13 - Exercicio 13
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (1) -> exercicio01.resolve();
                case (2) -> exercicio02.resolve();
                case (4) -> exercicio04.resolve();
                case (5) -> exercicio05.resolve();
                case (6) -> exercicio06.resolve();
                case (7) -> exercicio07.resolve();
                case (8) -> exercicio08.resolve();
                case (9) -> exercicio09.resolve();
                case (10) -> exercicio10.resolve();
                case (11) -> exercicio11.resolve();
                case (12) -> exercicio12.resolve();
                case (13) -> exercicio13.resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e);
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
            System.out.println("Ocorreu um erro: " + e);
        }
    }
}


