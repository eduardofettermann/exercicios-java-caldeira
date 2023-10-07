package eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.model.Calculator;
import eduardofettermann.exercicios.solucoes.aula07.solucao04aula07.model.Operation;

import java.util.InputMismatchException;

public class S04A07 implements Soluction {
    Calculator calculator = new Calculator();

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 04 - Interface, Enum e Tratamento de Erros
                Expanda o exercício 3 adicionando uma interface chamada Calculavel com métodos para adicionar, subtrair,
                multiplicar e dividir números inteiros. Em seguida, crie uma classe que implemente a interface Calculavel
                e use um enum para selecionar a operação desejada. Trate exceções adequadamente para situações como divisão
                por zero ou operação inválida.
                                    
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        showMenu();

    }


    private void showMenu() {
        System.out.println("""
                        
                Digite a operação que você deseja realizar!
                                
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                                
                0 - Sair
                                
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (1) -> showOperationMenu(Operation.ADICAO);
            case (2) -> showOperationMenu(Operation.SUBTRACAO);
            case (3) -> showOperationMenu(Operation.MULTIPLICACAO);
            case (4) -> showOperationMenu(Operation.DIVISAO);
            case (0) -> menu.showEndMenu();
            default -> showMenu();
        }
    }

    private void showOperationMenu(Operation operation) {
        try {
            scanner.nextLine();
            System.out.println("Digite um número inteiro");
            int num1 = scanner.nextInt();
            System.out.println("Digite outro número inteiro");
            int num2 = scanner.nextInt();
            System.out.printf("\nOs números digitados foram %d e %d\n", num1, num2);
            calculator.calculates(operation, num1, num2);
            questionIfResolvesAgain();
        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro! Apenas números inteiros são permitidos!");
            showOperationMenu(operation);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            showOperationMenu(operation);
        }
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
