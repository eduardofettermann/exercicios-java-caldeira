package br.com.eduardofettermann.exercicios.solucoes;
import br.com.eduardofettermann.exercicios.model.Exercicio;

//Exercicio 02
//        Crie um programa que receba 2 números e imprima na tela.

public class Exercicio02 implements Exercicio {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 02 
                Crie um programa que receba 2 números e imprima na tela.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite o primeiro número inteiro:");
        int primeroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int segundoNumero = scanner.nextInt();
        System.out.println("Os números digitados foram: " + primeroNumero + " e " + segundoNumero);

        menu.exibeMenuFinal();
    }


}
