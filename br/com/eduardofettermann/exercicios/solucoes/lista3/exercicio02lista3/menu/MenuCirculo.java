package br.com.eduardofettermann.exercicios.solucoes.lista3.exercicio02lista3.menu;

import br.com.eduardofettermann.exercicios.solucoes.lista3.exercicio02lista3.model.Circulo;

import java.util.Scanner;

public class MenuCirculo {
    private final Scanner SC = new Scanner(System.in);


    public void exibeMenuNovoCirculo() {
        System.out.println("""
                Você deseja inicializar o círculo com qual valor?
                1 - Raio        2 - Diâmetro
                3 - Área        4 - Circunferência
                    
                0 - Sair
                """);
        switch (SC.nextInt()) {
            case (1) -> exibeMenuRaio();
            case (2) -> exibeMenuDiametro();
            case (3) -> exibeMenuArea();
            case (4) -> exibeMenuCircunferencia();
        }
    }

    public void exibeMenuRaio() {
        Circulo circulo = new Circulo();
        System.out.println("Digite o raio");
        SC.nextLine();
        circulo.setRaio(SC.nextDouble());
        circulo.setDiametro(circulo.calculaDiametroPeloRaio(circulo.getRaio()));
        circulo.setArea(circulo.calculaAreaPeloRaio(circulo.getRaio()));
        circulo.setCircunferencia(circulo.calculaCircunferenciaPeloRaio(circulo.getRaio()));
        exibeMenuDecimais();
        circulo.setCasasDecimais(SC.nextInt());
        System.out.println(circulo);
    }

    public void exibeMenuDiametro() {
        Circulo circulo = new Circulo();
        System.out.println("Digite o diâmetro");
        circulo.setDiametro(SC.nextDouble());
        circulo.setRaio(circulo.calculaRaioPeloDiametro(circulo.getDiametro()));
        circulo.setArea(circulo.calculaAreaPeloRaio(circulo.getRaio()));
        circulo.setCircunferencia(circulo.calculaCircunferenciaPeloRaio(circulo.getRaio()));
        exibeMenuDecimais();
        circulo.setCasasDecimais(SC.nextInt());
        System.out.println(circulo);
    }

    public void exibeMenuCircunferencia() {
        Circulo circulo = new Circulo();
        System.out.println("Digite a circunferencia");
        circulo.setCircunferencia(SC.nextDouble());
        circulo.setRaio(circulo.calculaRaioPelaCircunferencia(circulo.getCircunferencia()));
        circulo.setDiametro(circulo.calculaDiametroPeloRaio(circulo.getRaio()));
        circulo.setArea(circulo.calculaAreaPelaCircunferencia(circulo.getCircunferencia()));
        exibeMenuDecimais();
        circulo.setCasasDecimais(SC.nextInt());
        System.out.println(circulo);
    }

    public void exibeMenuArea() {
        Circulo circulo = new Circulo();
        System.out.println("Digite a área");
        circulo.setArea(SC.nextDouble());
        circulo.setRaio(circulo.calculaRaioPelaArea(circulo.getArea()));
        circulo.setDiametro(circulo.calculaDiametroPeloRaio(circulo.getRaio()));
        circulo.setCircunferencia(circulo.calculaCircunferenciaPelaArea(circulo.getArea()));
        exibeMenuDecimais();
        circulo.setCasasDecimais(SC.nextInt());
        System.out.println(circulo);
    }

    public void exibeMenuDecimais() {
        System.out.println("Digite quantas casas decimais você quer que tenham nos números!");
    }
}
