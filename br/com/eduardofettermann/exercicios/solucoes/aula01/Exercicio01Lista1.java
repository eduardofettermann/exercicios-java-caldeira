package br.com.eduardofettermann.exercicios.solucoes.aula01;

import br.com.eduardofettermann.exercicios.model.Solucao;

//         Exercicio 01
//        Crie um programa que leia seu nome e imprima na tela.

public class Exercicio01Lista1 implements Solucao {

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01 
                Crie um programa que leia seu nome e imprima na tela.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite seu nome;");
        String nomeDigitado = scanner.nextLine();
        System.out.println(nomeDigitado);
        resolveNovamente();
    }
}
