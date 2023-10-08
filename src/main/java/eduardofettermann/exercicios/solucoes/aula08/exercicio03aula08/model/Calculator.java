package eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model;


import java.util.InputMismatchException;

import static eduardofettermann.exercicios.model.Soluction.menu;
import static eduardofettermann.exercicios.model.Soluction.scanner;
import static eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Operation.*;

public class Calculator {

    public void printCalculatorMenu() {
        System.out.println("""
                        
                Digite o número da operação que desejas realizar!
                                
                (1) - Adição
                (2) - Subtração
                (3) - Multiplicação
                (4) - Divisão
                (5) - Raiz Quadrada
                (6) - Potenciação
                                
                (0) - Sair
                                
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (1) -> printMenuEasyCalculation(ADICAO);
            case (2) -> printMenuEasyCalculation(SUBTRACAO);
            case (3) -> printMenuEasyCalculation(MULTIPLICACAO);
            case (4) -> printMenuEasyCalculation(DIVISAO);
            case (5) -> printSquareRootMenu();
            case (6) -> printPotenciationMenu();
            case (0) -> menu.showEndMenu();
            default -> printCalculatorMenu();
        }
    }

    private void calculatesEasy(Operation operation, double num1, double num2) {
        switch (operation) {
            case ADICAO -> sum(num1, num2);
            case SUBTRACAO -> difference(num1, num2);
            case MULTIPLICACAO -> product(num1, num2);
            case DIVISAO -> quotient(num1, num2);
        }
    }

    private void printSquareRootMenu() {
        System.out.println("Digite o número que você deseja descobrir sua própria raiz quadrada:");
        double radicando = scanner.nextDouble();
        squaredRootOf(radicando);
    }

    private void printPotenciationMenu() {
        System.out.println("Digite o a base da operação:");
        double base = scanner.nextDouble();
        System.out.println("Digite o expoente da operação (inteiro):");
        int expoent = scanner.nextInt();
        potencia(base, expoent);
    }

    private void printMenuEasyCalculation(Operation operation) {
        try {
            scanner.nextLine();
            System.out.println("Digite o primeiro número da operação");
            double num1 = scanner.nextInt();
            System.out.println("Digite o segundo número da operação");
            double num2 = scanner.nextInt();
            System.out.printf("\nOs números digitados foram %.2f e %.2f\n", num1, num2);
            calculatesEasy(operation, num1, num2);
            printCalculatorMenu();
        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro! Apenas números inteiros são permitidos!");
            printMenuEasyCalculation(operation);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            printMenuEasyCalculation(operation);
        }
    }

    public double sum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.printf("\n%.2f + %.2f = %.2f", num1, num2, sum);
        return sum;
    }

    public double difference(double num1, double num2) {
        double difference = num1 - num2;
        System.out.printf("\n%.2f - %.2f = %.2f", num1, num2, difference);
        return difference;
    }

    public double product(double num1, double num2) {
        double product = num1 * num2;
        System.out.printf("\n%.2f * %.2f = %.2f", num1, num2, product);
        return product;
    }

    public double quotient(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Erro: O divisor não pode ser 0");
        }
        double quocient = num1 / num2;
        System.out.printf("\n%.2f / %.2f = %.2f", num1, num2, quocient);
        return quocient;
    }

    public double potencia(double base, int expoent) {
        double result = Math.pow(base, expoent);
        System.out.printf("\n%.2f^%d = %.2f", base, expoent, result);
        return result;
    }

    public double squaredRootOf(double radicando) {
        double result = Math.sqrt(radicando);
        System.out.printf("\n√%.2f = %.2f", radicando, result);
        return result;
    }
}
