package br.com.eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.service;

import br.com.eduardofettermann.exercicios.model.Solucao;
import br.com.eduardofettermann.exercicios.solucoes.aula07.solucao01aula07.model.*;



public class Solucao01A07 implements Solucao {
    Drawable circle = new Circle();
    Drawable square = new Square();
    @Override
    public void exibeEnunciado() {
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
    public void resolve() {
        exibeEnunciado();
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
            case (0) -> menu.exibeMenuFinal();
            default -> showMenu();
        }
    }


    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
