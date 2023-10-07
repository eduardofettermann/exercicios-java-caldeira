package eduardofettermann.exercicios.solucoes.aula07.solucao02aula07.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula07.solucao02aula07.model.DayOfWeek;


public class S02A07 implements Soluction {
    DayOfWeek dayOfWeek;

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 02 - Enum
                Crie um enum chamado DiaDaSemana que represente os dias da semana (por exemplo, SEGUNDA, TERCA, etc.).
                Escreva um programa que aceite um dia da semana do usuário e imprima uma mensagem de acordo com o dia escolhido.
                                    
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
                        
                1 - Digitar um dia da semana
                        
                0 - Sair
                        
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (1) -> showMenuDayOfWeek();
            case (0) -> menu.showEndMenu();
            default -> showMenu();
        }
    }

    private void showMenuDayOfWeek() {
        String day = askDayOfWeek();
        returnDayOfWeek(DayOfWeek.valueOf(day.toUpperCase()));
        questionIfResolvesAgain();
    }

    private String askDayOfWeek() {
        scanner.nextLine();
        System.out.println("Digite o dia da semana sem feira(Ex.: Quinta):");
        return scanner.nextLine();
    }

    public void returnDayOfWeek(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SEGUNDA -> System.out.println("O dia da semana é segunda-feira!");
            case TERÇA -> System.out.println("O dia da semana é terça-feira!");
            case QUARTA -> System.out.println("O dia da semana é quarta-feira!");
            case QUINTA -> System.out.println("O dia da semana é quinta-feira!");
            case SEXTA -> System.out.println("O dia da semana é sexta-feira!");
            case SABADO -> System.out.println("O dia da semana é sábado!");
            case DOMINGO -> System.out.println("O dia da semana é domingo!");
            default -> {
                System.out.println("Certifique-se de digitar o dia sem '-feira'");
                showMenuDayOfWeek();
            }
        }
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
