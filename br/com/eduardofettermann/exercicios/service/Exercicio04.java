package br.com.eduardofettermann.exercicios.service;
import java.text.DecimalFormat;
import java.util.Scanner;

//Exercicio 04
//        Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário,
//        calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado,
//        assuma que o salário mínimo é R$1.320.

public class Exercicio04 {
    private final double SALARIO_MINIMO = 1320;
    private final DecimalFormat FORMATO_DECIMAL = new DecimalFormat("0.0");
    private Scanner scanner = new Scanner(System.in);

        public void imprimeSalariosMinimos(){
            System.out.println("Digite seu salário:");
            Double salarioDigitado = scanner.nextDouble();
            Double salariosMinimosPorSalario = salarioDigitado / SALARIO_MINIMO;
            String salariosMinimosPorSalarioArredondado = FORMATO_DECIMAL.format(salariosMinimosPorSalario);
            System.out.println("O seu salário é equivalente a " + salariosMinimosPorSalarioArredondado + " salários mínimos!");
        }
}
