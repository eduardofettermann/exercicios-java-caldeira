package eduardofettermann.exercicios.service;

import eduardofettermann.exercicios.solucoes.aula01.*;
import eduardofettermann.exercicios.solucoes.aula02.*;
import eduardofettermann.exercicios.solucoes.aula03.exercicio01aula03.S01A03;
import eduardofettermann.exercicios.solucoes.aula03.exercicio02aula03.service.S02A03;
import eduardofettermann.exercicios.solucoes.aula04.exercicio01aula04.service.S01A04;
import eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.service.S02A04;
import eduardofettermann.exercicios.solucoes.aula04.exercicio03aula04.service.S03A04;
import eduardofettermann.exercicios.solucoes.aula05.exercicio01aula05.service.S01A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio02aula05.service.S02A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio03aula05.service.S03A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio04aula05.service.S04A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio05aula05.service.S05A05;
import eduardofettermann.exercicios.solucoes.aula05.exercicio06aula05.service.S06A05;
import eduardofettermann.exercicios.solucoes.aula06.exercicio02aula06.service.S02A06;
import eduardofettermann.exercicios.solucoes.aula06.exercicio01aula06.service.S01A06;
import eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.service.S03A06;
import eduardofettermann.exercicios.solucoes.aula06.solucao04aula06.service.S04A06;
import eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.service.S01A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao02aula07.service.S02A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao03aula07.service.S03A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.service.S04A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao05aula07.service.S05A07;
import eduardofettermann.exercicios.solucoes.aula07.solucao06aula07.service.S06A07;
import eduardofettermann.exercicios.solucoes.aula08.exercicio01aula08.service.S01A08;
import eduardofettermann.exercicios.solucoes.aula08.exercicio02aula08.service.S02A08;
import eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.service.S03A08;

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
                    7 - Aula 07         8 - Aula 08
                                        
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
                case (8) -> showLesson08();
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
                case (1) -> new S01A01().resolves();
                case (2) -> new S02A01().resolves();
                case (3) -> new S03A01().resolves();
                case (4) -> new S04A01().resolves();
                case (5) -> new S05A01().resolves();
                case (6) -> new S06A01().resolves();
                case (7) -> new S07A01().resolves();
                case (8) -> new S08A01().resolves();
                case (9) -> new S09A01().resolves();
                case (10) -> new S10A01().resolves();
                case (11) -> new S11A01().resolves();
                case (12) -> new S12A01().resolves();
                case (13) -> new S13A01().resolves();
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
                case (1) -> new S01A02().resolves();
                case (4) -> new S04A02().resolves();
                case (5) -> new S05A02().resolves();
                case (6) -> new S06A02().resolves();
                case (7) -> new S07A02().resolves();
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
                case (1) -> new S01A03().resolves();
                case (2) -> new S02A03().resolves();
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
                case (1) -> new S01A04().resolves();
                case (2) -> new S02A04().resolves();
                case (3) -> new S03A04().resolves();
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
                case (1) -> new S01A05().resolves();
                case (2) -> new S02A05().resolves();
                case (3) -> new S03A05().resolves();
                case (4) -> new S04A05().resolves();
                case (5) -> new S05A05().resolves();
                case (6) -> new S06A05().resolves();
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
                    3 - Exercicio 3 - TreeMap com agenda
                    4 - Exercicio 4 - LinkedHashMap
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A06().resolves();
                case (2) -> new S02A06().resolves();
                case (3) -> new S03A06().resolves();
                case (4) -> new S04A06().resolves();
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
                case (1) -> new S01A07().resolves();
                case (2) -> new S02A07().resolves();
                case (3) -> new S03A07().resolves();
                case (4) -> new S04A07().resolves();
                case (5) -> new S05A07().resolves();
                case (6) -> new S06A07().resolves();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }

    private void showLesson08() {
        try {
            System.out.println("""
                    Você quer ver a solução de qual exercício?
                    1 - Exercicio 1 - Maven + Streams
                    2 - Exercicio 2 - Gradle + Streams
                    3 - Exercicio 3 - Testes unitários (fácil)
                    4 - Exercicio 4 - Calculadora de Hipoteca (Não solucionado)
                    5 - Exercicio 5 - Testes unitários de uma aplicação que não foi você que desenvolveu (médio) (Não solucionado)
                          
                    0 - Voltar
                    """);
            int resposta = scanner.nextInt();

            switch (resposta) {
                case (0) -> showStartMenu();
                case (1) -> new S01A08().resolves();
                case (2) -> new S02A08().resolves();
                case (3) -> new S03A08().resolves();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e + "\n" + "Se o problema persistir tente novamente mais tarde!");
        }
    }
}