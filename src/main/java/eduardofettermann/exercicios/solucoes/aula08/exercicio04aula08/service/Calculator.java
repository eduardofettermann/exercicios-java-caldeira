package eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.service;

import eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Operation;
import eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util.MortgageCalculator;
import eduardofettermann.exercicios.solucoes.aula08.exercicio04aula08.util.OperatesWithMessage;

import java.util.InputMismatchException;

import static eduardofettermann.exercicios.model.Soluction.menu;
import static eduardofettermann.exercicios.model.Soluction.scanner;
import static eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Operation.*;
import static eduardofettermann.exercicios.solucoes.aula08.exercicio03aula08.model.Operation.DIVISAO;

public class Calculator {
    private static final OperatesWithMessage OPERATES_WITH_MESSAGE = new OperatesWithMessage();
    private static final MortgageCalculator MORTGAGE_CALCULATOR = new MortgageCalculator();

    public void printCalculatorMenu() {
        System.out.println("""
                        
                Digite o número da operação que desejas realizar!
                                
                (1) - Adição
                (2) - Subtração
                (3) - Multiplicação
                (4) - Divisão
                (5) - Raiz Quadrada
                (6) - Potenciação
                (7) - Calcular pagamento mensal de uma hipoteca (new)
                                
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
            case (7) -> printMortgageMenu();
            case (0) -> menu.showEndMenu();
            default -> printCalculatorMenu();
        }
    }

    private void calculatesEasy(Operation operation, double num1, double num2) {
        switch (operation) {
            case ADICAO -> OPERATES_WITH_MESSAGE.sum(num1, num2);
            case SUBTRACAO -> OPERATES_WITH_MESSAGE.difference(num1, num2);
            case MULTIPLICACAO -> OPERATES_WITH_MESSAGE.product(num1, num2);
            case DIVISAO -> OPERATES_WITH_MESSAGE.quotient(num1, num2);
        }
    }

    private void printSquareRootMenu() {
        System.out.println("Digite o número que você deseja descobrir sua própria raiz quadrada:");
        double radicando = scanner.nextDouble();
        OPERATES_WITH_MESSAGE.squaredRootOf(radicando);
        printCalculatorMenu();
    }

    private void printPotenciationMenu() {
        System.out.println("Digite o a base da operação:");
        double base = scanner.nextDouble();
        System.out.println("Digite o expoente da operação (inteiro):");
        int expoent = scanner.nextInt();
        OPERATES_WITH_MESSAGE.potencia(base, expoent);
        printCalculatorMenu();
    }

    private void printMortgageMenu() {
        System.out.println("Digite o valor total da hipoteca");
        double totalValue = scanner.nextDouble();
        System.out.println("Digite a taxa de juros (se for 20% -> digite 20):");
        double interestRate = scanner.nextDouble();
        System.out.println("Digite o prazo em anos");
        double termInYears = scanner.nextDouble();
        double monthValue = MORTGAGE_CALCULATOR.calculaPagamentoMensalDaHipoteca(totalValue, interestRate, termInYears);
        System.out.printf("""
                O valor mensal da hipoteca será de R$%.2f!
                """, monthValue);
        printCalculatorMenu();
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
}
