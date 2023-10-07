package eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.model.Circle;
import eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.model.Drawable;
import eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.model.Square;


public class S01A07 implements Soluction {
    Drawable circle = new Circle();
    Drawable square = new Square();
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 01 - Interface
                Crie uma interface chamada Desenhavel com um método desenhar().
                Em seguida, crie duas classes, Circulo e Quadrado, que implementam essa
                interface e tenham implementações diferentes para o método desenhar().
                ---> O método desenhar pode só criar um print na dela dizendo "vou desenhar
                o 'nomedafigura'.
                                    
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
                1 - Desenhar quadrado
                2 - Desenhar círculo
                    
                0 - Sair
                """);
        int nextInt = scanner.nextInt();
        switch (nextInt) {
            case (1) -> square.draw();
            case (2) -> circle.draw();
            case (0) -> menu.showEndMenu();
            default -> showMenu();
        }
    }


    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
