package eduardofettermann.exercicios.service;

import eduardofettermann.exercicios.solucoes.aula01.*;
import eduardofettermann.exercicios.solucoes.aula02.*;
import eduardofettermann.exercicios.solucoes.aula03.exercicio01lista3.S01A03;
import eduardofettermann.exercicios.solucoes.aula03.exercicio02lista3.service.S02A03;
import eduardofettermann.exercicios.solucoes.aula04.exercicio01lista4.service.S01A04;
import eduardofettermann.exercicios.solucoes.aula04.exercicio02lista4.service.S02A04;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03lista4.service.S03A04;
import eduardofettermann.exercicios.solucoes.aula05.S01A05;
import eduardofettermann.exercicios.solucoes.aula05.S02A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio03lista5.service.S03A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio04lista5.service.S04A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio05lista5.service.S05A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio06lista05.service.S06A05;
import eduardofettermann.exercicios.solucoes.aula06.S02A06;
import eduardofettermann.exercicios.solucoes.aula06.exercicio01aula06.service.S01A06;
import eduardofettermann.exercicios.solucoes.aula06.solucao04aula06.service.S04A06;
import eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.service.S01A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao02aula07.service.S02A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao03aula07.service.S03A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.service.S04A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao05aula07.service.S05A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.service.S06A07;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void showStartMenu() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual lista?
                    1 - Aula 01         2 - Aula 02
                    3 - Aula 03         4 - Aula 04
                    5 - Aula 05         6 - Aula 06
                    7 - Aula 07
                                        
                    0 - Encerrar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (1) -> showLesson01();
                case (2) -> showLesson02();
                case (3) -> showLesson03();
                case (4) -> showLesson04();
                case (5) -> showLesson5();
                case (6) -> showLesson06();
                case (7) -> showLesson07();
                case (0) -> System.out.println("Encerrando...");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        } finally {
            scanner.close();
        }
    }


    public void showEndMenu() {
        try {
            Menu menu = new Menu();
            System.out.println("""
                    Você quer ver outra solução ou sair?
                    1 - Ver outro exercício
                                        
                    0 - Encerrar
                    """);
            int opcao = scanner.nextInt();
            switch (opcao) {
                case (1) -> menu.showStartMenu();
                case (0) -> System.out.println("Encerrando...");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Tente digitar apenas número inteiros de 1 a 2, " + "se o problema persistir tente novamente mais tarde!");
        } finally {
            scanner.close();
        }
    }

    public void showLesson01() {
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
                case (0) -> showStartMenu();
                case (1) -> new S01A01().resolve();
                case (2) -> new S02A01().resolve();
                case (3) -> new S03A01().resolve();
                case (4) -> new S04A01().resolve();
                case (5) -> new S05A01().resolve();
                case (6) -> new S06A01().resolve();
                case (7) -> new S07A01().resolve();
                case (8) -> new S08A01().resolve();
                case (9) -> new S09A01().resolve();
                case (10) -> new S10A01().resolve();
                case (11) -> new S11A01().resolve();
                case (12) -> new S12A01().resolve();
                case (13) -> new S13A01().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void showLesson02() {
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
                case (0) -> showStartMenu();
                case (1) -> new S01A02().resolve();
                case (4) -> new S04A02().resolve();
                case (5) -> new S05A02().resolve();
                case (6) -> new S06A02().resolve();
                case (7) -> new S07A02().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void showLesson03() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 (Conta Bancária)
                    2 - Exercicio 2 (Círculo)
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A03().resolve();
                case (2) -> new S02A03().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void showLesson04() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 (Veículo)
                    2 - Exercicio 2 (Figuras geométricas)
                    3 - Exercicio 3 (Sistema de Tributação para Contas e Bens Financeiros)
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();
            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A04().resolve();
                case (2) -> new S02A04().resolve();
                case (3) -> new S03A04().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    public void showLesson5() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 - Média e Soma da array
                    2 - Exercicio 2 - Procura número na array
                    3 - Exercicio 3 - Lista de Tarefas
                    4 - Exercicio 4 - Lista de Compras
                    5 - Exercicio 5 - Fila de Impressão
                    6 - Exercicio 6 - Sistema de Reservas
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A05().resolve();
                case (2) -> new S02A05().resolve();
                case (3) -> new S03A05().resolve();
                case (4) -> new S04A05().resolve();
                case (5) -> new S05A05().resolve();
                case (6) -> new S06A05().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    private void showLesson06() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 - Stack com livros
                    2 - Exercicio 2 - HashMap com pessoas
                    3 - Exercicio 3 - TreeMap com agenda (Não Solucionado)
                    4 - Exercicio 4 - LinkedHashMap
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A06().resolve();
                case (2) -> new S02A06().resolve();
                case (4) -> new S04A06().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    private void showLesson07() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 - Interface
                    2 - Exercicio 2 - Enum
                    3 - Exercicio 3 - Tratamento de Erros
                    4 - Exercicio 4 - Interface, Enum e Tratamento de Erros
                    5 - Exercicio 5 - Tratamento de Erros com Exceções Personalizadas (RuntimeException)
                    6 - Exercicio 6 - Tratamento de Erros com Exceções Personalizadas (Exception)
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A07().resolve();
                case (2) -> new S02A07().resolve();
                case (3) -> new S03A07().resolve();
                case (4) -> new S04A07().resolve();
                case (5) -> new S05A07().resolve();
                case (6) -> new S06A07().resolve();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }
}


