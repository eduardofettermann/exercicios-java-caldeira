package eduardofettermann.exercicios.solucoes.aula05.exercicio02aula05.service;

import eduardofettermann.exercicios.model.Soluction;

import java.util.Arrays;
import java.util.Random;

public class S02A05 implements Soluction {
    private int[] inteiros;
    private int ultimoNumero = 100;
    private Random random = new Random();
    private int numerodigitado;

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 02 - Uso de Array
                Descrição: Crie um programa Java que gere automaticamente um array de 10 números inteiros aleatórios
                entre 1 e 100. Em seguida, peça ao usuário para inserir um número e verifique se esse número está
                presente no array. Exiba uma mensagem indicando se o número foi encontrado ou não.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        criaArrayComAleatorios(10);
        exibePerguntaNumero();
        exibeResultado(temNaArray(numerodigitado));
        exibeArray();
        questionIfResolvesAgain();
    }

    public void criaArrayComAleatorios(int tamanho) {
        inteiros = new int[tamanho];
        System.out.println("Array gerada!");
        for (int i = 0; i < inteiros.length; i++) {
            int numeroAleatorio = geraNumeroAleatorio();
            while (temNaArray(numeroAleatorio)) {
                numeroAleatorio = geraNumeroAleatorio();
            }
            inteiros[i] = numeroAleatorio;
        }
    }

    public int geraNumeroAleatorio() {
        return 1 + random.nextInt(ultimoNumero);
    }

    public void exibePerguntaNumero() {
        System.out.println("Digite um número inteiro e retornarei se ele está na Array:");
        numerodigitado = scanner.nextInt();
    }

    public void exibeResultado(boolean b) {
        if (b) {
            System.out.printf("\nO número %d foi encontrado na Array", numerodigitado);
        } else {
            System.out.printf("\nO número %d não foi encontrado na Array", numerodigitado);
        }
    }

    public boolean temNaArray(int numero) {
        return Arrays.stream(inteiros).anyMatch(i -> i == numero);
    }

    public void exibeArray() {
        System.out.println("\nA array gerada: " + Arrays.toString(inteiros));
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
