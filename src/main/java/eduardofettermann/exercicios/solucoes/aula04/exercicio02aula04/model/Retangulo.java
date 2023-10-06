package eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.model;

import static eduardofettermann.exercicios.model.Soluction.scanner;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    @Override
    public void perguntaInformacoes() {
        System.out.println("Qual a base?");
        this.setBase(scanner.nextDouble());
        System.out.println("Qual a altura?");
        this.setAltura(scanner.nextDouble());
    }

    public void calcularArea() {
        setArea(this.getBase() * this.getAltura());
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
        return String.format("Retângulo (Área) = %.2f", this.getArea());
    }
}
