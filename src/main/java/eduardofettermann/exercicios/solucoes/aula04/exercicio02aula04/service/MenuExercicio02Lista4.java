package eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.model.*;

import java.util.ArrayList;
import java.util.List;

public class MenuExercicio02Lista4 {
    private List<FormaGeometrica> formasGeometricas = new ArrayList<FormaGeometrica>();

    public void exibeMenuInicial() {

        System.out.println("""
                Qual a forma geométrica você deseja calcular a área e adicionar na lista?
                1 - Quadrado   4 - Círculo
                2 - Retângulo  5 - Losango
                3 - Triângulo
                           
                0 - Voltar
                """);
        int resposta = Soluction.scanner.nextInt();
        switch (resposta) {
            case (1) -> exibeMenuQuadrado();
            case (2) -> exibeMenuRetangulo();
            case (3) -> exibeMenuTriangulo();
            case (4) -> exibeMenuCirculo();
            case (5) -> exibeMenuLosango();
            case (0) -> Soluction.menu.showLesson04();
        }
    }

    public void exibeMenuQuadrado() {
        FormaGeometrica quadrado = new Quadrado();
        quadrado.perguntaInformacoes();
        quadrado.calcularArea();
        quadrado.mostraArea();
        formasGeometricas.add(quadrado);
        exibeMenuFinal();
    }

    public void exibeMenuRetangulo() {
        FormaGeometrica retangulo = new Retangulo();
        retangulo.perguntaInformacoes();
        retangulo.calcularArea();
        retangulo.mostraArea();
        formasGeometricas.add(retangulo);
        exibeMenuFinal();
    }

    public void exibeMenuTriangulo() {
        FormaGeometrica triangulo = new Triangulo();
        triangulo.perguntaInformacoes();
        triangulo.calcularArea();
        triangulo.mostraArea();
        formasGeometricas.add(triangulo);
        exibeMenuFinal();
    }


    public void exibeMenuCirculo() {
        FormaGeometrica circulo = new Circulo();
        circulo.perguntaInformacoes();
        circulo.calcularArea();
        circulo.mostraArea();
        formasGeometricas.add(circulo);
        exibeMenuFinal();
    }

    public void exibeMenuLosango() {
        FormaGeometrica losango = new Losango();
        losango.perguntaInformacoes();
        losango.calcularArea();
        losango.mostraArea();
        formasGeometricas.add(losango);
        exibeMenuFinal();
    }

    public void exibirListaDeFormas() {
        formasGeometricas.forEach(System.out::println);
    }

    public void exibeMenuFinal() {
        System.out.println("""
                Você deseja adicionar outra forma na lista?
                1 - Sim
                0 - Não, Sair
                """);
        switch (Soluction.scanner.nextInt()) {
            case (1) -> exibeMenuInicial();
            case (0) -> exibirListaDeFormas();
        }
    }
}
