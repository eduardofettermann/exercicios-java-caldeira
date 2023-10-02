package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Solucao;

import java.text.DecimalFormat;

//Exercicio 03
//        Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

public class S03A01 implements Solucao {
    private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("0.00");

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 02
                Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        System.out.println("Digite o primeiro número inteiro:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número inteiro:");
        int terceiroNumero = scanner.nextInt();
        int maior = primeiroNumero;
        int menor = primeiroNumero;

        if (segundoNumero >= maior) maior = segundoNumero;
        if (terceiroNumero >= maior) maior = terceiroNumero;
        if (segundoNumero <= menor) menor = segundoNumero;
        if (terceiroNumero <= menor) menor = terceiroNumero;

        double mediaAritmetica = (double) (primeiroNumero + segundoNumero + terceiroNumero) / 3;
        var mediaAritmeticaConvertida = FORMATO_DECIMAL.format(mediaAritmetica);

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média aritmética é " + mediaAritmeticaConvertida);
        resolveNovamente();
    }
}
