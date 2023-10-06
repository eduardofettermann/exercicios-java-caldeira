package eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.service;

import eduardofettermann.exercicios.model.Soluction;

public class S02A04 implements Soluction {
    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 02 - Figuras geométricas
                                
                2.1 Crie uma classe abstrata chamada FormaGeometrica com um método 
                abstrato calcularArea();
                                                                     
                2.2 Crie três classes concretas que herdem de FormaGeometrica: 
                Retangulo, Circulo, Triangulo, Quadrado e Losango. Implemente o 
                método calcularArea() em cada uma dessas classes para calcular a 
                área da forma específica.
                                                                     
                2.3 Na classe Principal, crie uma lista de formas geométricas que 
                inclua retângulos, círculos, triângulos, quadrados e losangos.
                                                                     
                2.4 Use um loop para calcular e exibir a área de cada forma 
                geométrica na lista, mesmo que sejam tipos diferentes, usando o 
                polimorfismo.
                                
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printQuestion();
        MenuExercicio02Lista4 menu = new MenuExercicio02Lista4();
        menu.exibeMenuInicial();
        questionIfResolvesAgain();
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
