package eduardofettermann.exercicios.solucoes.aula08.exercicio05aula08.service;

import eduardofettermann.exercicios.solucoes.aula08.exercicio05aula08.util.OperacaoNumero;

import static eduardofettermann.exercicios.model.Soluction.menu;
import static eduardofettermann.exercicios.model.Soluction.scanner;

public class MethodsMenu {
    private static final OperacaoNumero OPERACAO_NUMERO = new OperacaoNumero();

    public void printMainMenu() {
        System.out.println("""
                        
                Digite o número da operação que desejas realizar!
                                
                (1) - Calcular a soma de uma lista de números inteiros
                (2) - Verificar se um número é par
                (3) - Calcular o fatorial de um número inteiro positivo
                (4) - Verificar se uma string é um palíndromo (lê-se igual de trás para frente)
                (5) - Calcular o n-ésimo termo da sequência de Fibonacci
                                
                (0) - Sair
                                
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (0) -> menu.showEndMenu();
            case (1) -> this.printSumMenu();
            case (2) -> this.printEvenOrNotMenu();
            case (3) -> this.printFactorialNumberMenu();
            case (4) -> this.printPalindromeMenu();
            case (5) -> this.printFibonacciMenu();
            default -> printMainMenu();
        }
    }

    public void printSumMenu() {
        scanner.nextLine();
        System.out.println("Digite a quantidade de números que desejas somar:");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\n(%d/%d)Digite um inteiro para adicionar a soma:", i, length);
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        int sum = OPERACAO_NUMERO.somarNumeros(numbers);
        System.out.printf("\nA soma dos números é %d", sum);
        printMainMenu();
    }

    public void printEvenOrNotMenu() {
        System.out.println("Digite o número inteiro que desejas verificar se é par ou não:");
        int number = scanner.nextInt();
        boolean isEven = OPERACAO_NUMERO.ehPar(number);
        if (isEven) {
            System.out.printf("\nO número %d é par!", number);
        } else {
            System.out.printf("\nO número %d não é par!", number);
        }
        printMainMenu();
    }

    public void printFactorialNumberMenu() {
        System.out.println("Digite um número inteiro positivo que desejas calcular o fatorial");
        int number = scanner.nextInt();
        int factorial = OPERACAO_NUMERO.calcularFatorial(number);
        System.out.printf("\nO fatorial de %d é %d!", number, factorial);
        printMainMenu();
    }

    public void printPalindromeMenu() {
        scanner.nextLine();
        System.out.println("Digite uma string para verificar se ela é um palíndromo");
        String string = scanner.nextLine();
        boolean isPalindrome = OPERACAO_NUMERO.ehPalindromo(string);
        if (isPalindrome) {
            System.out.printf("\nA string \"%s\" é um palíndromo!", string);
        } else {
            System.out.printf("\nA string \"%s\" não é um palíndromo!", string);
        }
        printMainMenu();
    }

    public void printFibonacciMenu() {
        System.out.println("Digite o n-ésimo termo da sequência de Fibonacci você deseja que eu retorne:");
        int n = scanner.nextInt();
        int nEsimoTermo = OPERACAO_NUMERO.calcularFibonacci(n);
        System.out.printf("\nO %dº termo da sequência de Fibonacci é %d!", n, nEsimoTermo);
        printMainMenu();
    }
}
