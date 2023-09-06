package br.com.eduardofettermann.exercicios.service.service;

import java.util.Scanner;

public class Exercicio01 {
    private Scanner scanner = new Scanner(System.in);

    public void imprimeNome(){
        System.out.println("Digite seu nome:");
        String nomeDigitado = scanner.nextLine();
        System.out.println(nomeDigitado);
    }
}
