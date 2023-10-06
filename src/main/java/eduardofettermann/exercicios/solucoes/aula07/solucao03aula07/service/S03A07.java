package eduardofettermann.exercicios.solucoes.aula07.solucao03aula07.service;

import eduardofettermann.exercicios.model.Soluction;

import java.util.InputMismatchException;

public class S03A07 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 03 - Tratamento de Erros
                Crie um programa que solicite ao usuário que insira dois números inteiros. Utilize tratamento de exceções
                para lidar com a possibilidade de entrada inválida (por exemplo, uma entrada que não seja um número inteiro)
                e exiba uma mensagem de erro apropriada.
                                    
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
                                
                Digite o que você deseja realizar:
                        
                1 - Digitar dois números inteiros
                        
                0 - Sair
                        
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (1) -> askIntegers();
            case (0) -> menu.showEndMenu();
            default -> showMenu();
        }
    }

    private void askIntegers() {
        // Pede pra inserir dois números
        try {
            scanner.nextLine();
            System.out.println("Digite um número inteiro");
            int firstInteger = scanner.nextInt();
            System.out.println("Digite outro número inteiro");
            int secondInteger = scanner.nextInt();
            System.out.printf("\nOs números digitados foram %d e %d\n", firstInteger, secondInteger);
            questionIfResolvesAgain();
        } catch (InputMismatchException e) {
            System.out.println("Ocorreu um erro! Apenas números inteiros são permitidos!");
            askIntegers();
        }
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
