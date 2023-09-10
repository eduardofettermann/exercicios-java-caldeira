package br.com.eduardofettermann.exercicios.solucoes;

import br.com.eduardofettermann.exercicios.model.Exercicio;

import java.text.DecimalFormat;

//Exercicio 04
//        Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
//        calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
//        assuma que o salário mínimo é R$1.320.

public class Exercicio04 implements Exercicio {
    private final double SALARIO_MINIMO = 1320;
    private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("0.0");

    @Override
    public void resolve() {
        System.out.println("""
                - Exercicio 04 
                Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
                calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
                assuma que o salário mínimo é R$1.320.
                Solução:
                """);
        System.out.println("Digite seu salário:");
        Double salarioDigitado = scanner.nextDouble();
        Double salariosMinimosPorSalario = salarioDigitado / SALARIO_MINIMO;
        String salariosMinimosPorSalarioArredondado = FORMATO_DECIMAL.format(salariosMinimosPorSalario);
        System.out.println("O seu salário é equivalente a " + salariosMinimosPorSalarioArredondado + " salários mínimos!");

        menu.exibeMenuFinal();
    }
}
