package br.com.eduardofettermann.exercicios.solucoes.lista2;

import br.com.eduardofettermann.exercicios.model.Exercicio;

public class Exercicio07Lista2 implements Exercicio {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 07
                Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar. Leônidas pede para 
                que seus soldados tentem adivinhar quantos inimigos irão combater. O usuário deve digitar seu palpite e se o número 
                for menor do que 300.000, Leônidas deve dizer Um pouco mais!, caso o número dito pelo usuário seja menor, ele dirá 
                Um pouco menos!".
                Solução:
                """);
    }

    @Override
    public void resolve() {

    }
}
