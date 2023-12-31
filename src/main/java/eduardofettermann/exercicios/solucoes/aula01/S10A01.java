package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

//Exercicio 10
//        Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus
//        Celsius e, em seguida, converta essa temperatura em graus Fahrenheit usando a fórmula:
//        Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.

public class S10A01 implements Soluction {

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 10
                Crie um programa em Java que peça ao usuário para inserir uma temperatura em graus
                Celsius e, em seguida, converta essa temperatura em graus Fahrenheit usando a fórmula:
                Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado na tela.
                Solução:
                                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite o valor em Celsius:");
        double valorEmCelsius = scanner.nextDouble();
        double valorEmFahrenheit = (valorEmCelsius * 9 / 5) + 32;
        System.out.println("O valor em Fahrenheit é " + valorEmFahrenheit);
        questionIfResolvesAgain();
    }
}
