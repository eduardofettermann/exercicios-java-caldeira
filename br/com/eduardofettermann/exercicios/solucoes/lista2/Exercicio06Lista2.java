package br.com.eduardofettermann.exercicios.solucoes.lista2;

import br.com.eduardofettermann.exercicios.model.Solucao;

public class Exercicio06Lista2 implements Solucao {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 06
                Escreva um programa que receba uma string do usuário e imprima ela ao contrário
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite algo que retornarei ao contrário!");
        scanner.nextLine();
        String str = scanner.nextLine();


        String strInversa = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            String charAtual = str.substring(i, i + 1);
            strInversa += charAtual;
        }
        System.out.println(strInversa);
        System.out.println("\n");
        resolveNovamente();
    }
}




