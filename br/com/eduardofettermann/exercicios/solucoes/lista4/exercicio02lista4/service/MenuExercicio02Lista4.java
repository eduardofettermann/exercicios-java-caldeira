package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio02lista4.service;

import br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio02lista4.model.*;

import java.util.ArrayList;
import java.util.List;

import static br.com.eduardofettermann.exercicios.model.Exercicio.menu;
import static br.com.eduardofettermann.exercicios.model.Exercicio.scanner;

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
        int resposta = scanner.nextInt();
        switch (resposta) {
            case (1) -> exibeMenuQuadrado();
            case (2) -> exibeMenuRetangulo();
            case (3) -> exibeMenuTriangulo();
            case (4) -> exibeMenuCirculo();
            case (5) -> exibeMenuLosango();
            case (0) -> menu.exibeMenuLista4();
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
        switch (scanner.nextInt()) {
            case (1) -> exibeMenuInicial();
            case (0) -> exibirListaDeFormas();
        }
    }
}
