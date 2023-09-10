package br.com.eduardofettermann.exercicios.service;
import java.util.Scanner;

//Exercicio 09
//        Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
//        em seguida, calcule e exiba a idade.

public class Exercicio09 {
    private Scanner scanner = new Scanner(System.in);
    private int anoAtual = 2023;

    public void calculaIdade(){
        System.out.println("Digite seu ano de nascimento:");
        int anoDigitado = scanner.nextInt();
        int idade = anoAtual - anoDigitado;
        System.out.println("Sua idade é " + idade + " anos!");
    }
}
