package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio02lista4.model;

import static br.com.eduardofettermann.exercicios.model.Solucao.scanner;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;
    @Override
    public void calcularArea() {
        this.setArea((this.getBase() * this.getAltura())/2);
    }

    @Override
    public void perguntaInformacoes() {
        System.out.println("Qual a base?");
        this.setBase(scanner.nextDouble());
        System.out.println("Qual a altura?");
        this.setAltura(scanner.nextDouble());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Triângulo (Área) = %.2f",this.getArea());
    }
}
