package br.com.eduardofettermann.exercicios.service;
import java.util.Scanner;

//Exercicio 01
//        Crie um programa que leia seu nome e imprima na tela.

public class Exercicio01 {
    Scanner scanner = new Scanner(System.in);

    public void imprimeNome(){
        System.out.println("Digite seu nome;");
        String nomeDigitado = scanner.nextLine();
        System.out.println(nomeDigitado);
    }
}
