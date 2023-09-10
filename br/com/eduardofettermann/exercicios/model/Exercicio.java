package br.com.eduardofettermann.exercicios.model;

import br.com.eduardofettermann.exercicios.service.Menu;

import java.util.Scanner;

public interface Exercicio {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    void resolve();
}

