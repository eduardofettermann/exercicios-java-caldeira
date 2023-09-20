package br.com.eduardofettermann.exercicios.solucoes.lista4.exercicio02lista4.model;

import static br.com.eduardofettermann.exercicios.model.Exercicio.scanner;

public class Circulo extends FormaGeometrica {
    private double raio;

    @Override
    public void perguntaInformacoes() {
        System.out.println("Digite o raio do círculo:");
        this.setRaio(scanner.nextDouble());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.setArea(Math.PI * Math.pow(getRaio(),2));
    }

    @Override
    public String toString() {
        return String.format("Círculo (Área) = %.2f",this.getArea());
    }
}
