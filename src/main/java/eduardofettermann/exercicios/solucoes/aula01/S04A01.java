package eduardofettermann.exercicios.solucoes.aula01;

import eduardofettermann.exercicios.model.Soluction;

import java.text.DecimalFormat;

//Exercicio 04
//        Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
//        calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
//        assuma que o salário mínimo é R$1.320.

public class S04A01 implements Soluction {
    private final double SALARIO_MINIMO = 1320;
    private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("0.0");

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 04 
                Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
                calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
                assuma que o salário mínimo é R$1.320.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        System.out.println("Digite seu salário:");
        double salarioDigitado = scanner.nextDouble();
        double salariosMinimosPorSalario = salarioDigitado / SALARIO_MINIMO;
        String salariosMinimosPorSalarioArredondado = FORMATO_DECIMAL.format(salariosMinimosPorSalario);
        System.out.println("O seu salário é equivalente a " + salariosMinimosPorSalarioArredondado + " salários mínimos!");
        questionIfResolvesAgain();
    }
}
