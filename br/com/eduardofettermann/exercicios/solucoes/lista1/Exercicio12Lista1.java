package br.com.eduardofettermann.exercicios.solucoes.lista1;

import br.com.eduardofettermann.exercicios.model.Exercicio;

import java.text.DecimalFormat;

//Exercicio 12
//        Crie um programa que converta uma quantia em dólares para outra moeda,
//        como euros ou reais. Peça ao usuário para inserir a quantia em dólares e a taxa
//        de câmbio atual. Em seguida, calcule e exiba o valor convertido.

public class Exercicio12Lista1 implements Exercicio {
    private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("0.00");

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 12 
                Crie um programa que converta uma quantia em dólares para outra moeda,
                como euros ou reais. Peça ao usuário para inserir a quantia em dólares e a taxa
                de câmbio atual. Em seguida, calcule e exiba o valor convertido.
                Solução:
                                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Você quer converter o dólar em que moeda?");
        String moeda = scanner.nextLine();
        System.out.println("Insira a quantia de dólar a ser convertida:");
        double quantiaDeDolar = scanner.nextDouble();
        System.out.println("Insira a taxa do câmbio do " + moeda);
        double taxaDoCambio = scanner.nextDouble();
        double dolarConvertido = quantiaDeDolar * taxaDoCambio;
        String dolarArredondado = FORMATO_DECIMAL.format(dolarConvertido);
        System.out.println(quantiaDeDolar + " dolar(es)" + " = " + dolarArredondado + " em " + moeda);
        resolveNovamente();
    }
}
