package br.com.eduardofettermann.exercicios.solucoes.aula01;

import br.com.eduardofettermann.exercicios.model.Solucao;

//Exercicio 09
//        Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
//        em seguida, calcule e exiba a idade.

public class S09A01 implements Solucao {
    private int anoAtual = 2023;

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 09 
                Crie um programa em Java que peça ao usuário para inserir seu ano de nascimento e,
                em seguida, calcule e exiba a idade.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite seu ano de nascimento:");
        int anoDigitado = scanner.nextInt();
        int idade = anoAtual - anoDigitado;
        System.out.println("Sua idade é " + idade + " anos!");
        resolveNovamente();
    }
}
