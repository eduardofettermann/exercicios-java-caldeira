package br.com.eduardofettermann.exercicios.solucoes.lista4;

import br.com.eduardofettermann.exercicios.model.Exercicio;

public class Exercicio02Lista4 implements Exercicio {
    @Override
    public void exibeEnunciado() {
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
    public void resolve() {

    }

    @Override
    public void resolveNovamente() {
        Exercicio.super.resolveNovamente();
    }
}
