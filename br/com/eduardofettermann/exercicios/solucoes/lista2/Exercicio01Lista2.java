package br.com.eduardofettermann.exercicios.solucoes.lista2;

import br.com.eduardofettermann.exercicios.model.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01Lista2 implements Exercicio {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01
                Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite dois números inteiros que eu retornarei todos números inteiros no intervalo deles");
        System.out.println("Digite o primeiro número:");
        int nPrimeiro = scanner.nextInt();
        System.out.println("Digite o último número:");
        int nUltimo = scanner.nextInt();

        List<Integer> arrayDePrimos = new ArrayList<>();

        // Se for passado o mesmo número nas duas entradas
        if (nPrimeiro == nUltimo) {
            int contadorDeDivisoesComResto0 = 0;
            for (int i = 2; i <= nPrimeiro; i++) {
                if (nPrimeiro % i == 0) {
                    contadorDeDivisoesComResto0++;
                }
            }
            if (contadorDeDivisoesComResto0 == 1) {
                System.out.printf("O número %d é primo!", nPrimeiro);
            } else {
                System.out.printf("O número %d não é primo!", nPrimeiro);
            }
        } else if (nPrimeiro > nUltimo) { // Se o primeiro número passado for maior que o segundo número passado
            int nMaior = nPrimeiro;
            int nMenor = nUltimo;
            System.out.printf("Os números primos entre %d e %d são: \n", nMenor, nMaior);
            for (int i = nMenor; i <= nMaior; i++) {
                int contadorDeDivisoesComResto0 = 0;

                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        contadorDeDivisoesComResto0++;
                    }
                }

                if (contadorDeDivisoesComResto0 == 1) {
                    arrayDePrimos.add(i);
                }
            }
            arrayDePrimos.forEach(System.out::println);

        } else { // O padrão esperado
            System.out.printf("Os números primos entre %d e %d são: \n", nPrimeiro, nUltimo);
            for (int i = nPrimeiro; i <= nUltimo; i++) {
                int contadorDeDivisoesComResto0 = 0;

                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        contadorDeDivisoesComResto0++;
                    }
                }

                if (contadorDeDivisoesComResto0 == 1) {
                    arrayDePrimos.add(i);
                }
            }
            arrayDePrimos.forEach(System.out::println);
        }
        menu.exibeMenuFinal();
    }
}
