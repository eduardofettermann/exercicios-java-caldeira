package br.com.eduardofettermann.exercicios.solucoes.aula05;

import br.com.eduardofettermann.exercicios.model.Solucao;

import java.util.Arrays;

public class S01A05 implements Solucao {
    int[] numeros;
    int soma = 0;
    double media = 0;

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01 - Uso de Array
                Descrição: Crie um programa Java que peça ao usuário para inserir 5 números inteiros
                 e armazene-os em um array. Em seguida, calcule e exiba a soma e a média dos números inseridos.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        System.out.println("Digite a quantidade de números que você deseja inserir para calcular a soma e a média:");
        criaArray(scanner.nextInt());
        insereValoresNaArray();
        calculaSoma();
        calculaMedia();
        imprimeResultado();
        resolveNovamente();
    }


    public void criaArray(int quantidade) {
        numeros = new int[quantidade];
        System.out.println("Será necessário que você digite um número inteiro " + quantidade + " vezes!");
    }

    public void insereValoresNaArray() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite 1 número inteiro " + (i + 1) + "/" + numeros.length + " :");
            numeros[i] = scanner.nextInt();
        }
    }

    public void calculaSoma() {
        for (int numero : numeros) {
            soma += numero;
        }
    }

    public void calculaMedia() {
        media = (double) soma / numeros.length;
    }

    public void imprimeResultado() {
        System.out.printf("""
                Os números digitados foram: %s
                A soma é %d
                E a média é %.2f
                """, Arrays.toString(numeros), soma, media);
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
