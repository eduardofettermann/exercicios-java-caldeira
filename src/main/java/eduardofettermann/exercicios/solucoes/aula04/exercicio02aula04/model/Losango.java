package eduardofettermann.exercicios.solucoes.aula04.exercicio02aula04.model;

import static eduardofettermann.exercicios.model.Solucao.scanner;

public class Losango extends FormaGeometrica{
    private double diagonalMenor;
    private double diagonalMaior;

    @Override
    public void perguntaInformacoes() {
        System.out.println("Digite o valor da diagonal menor");
        this.setDiagonalMenor(scanner.nextDouble());
        System.out.println("Digite o valor da diagonal maior");
        this.setDiagonalMaior(scanner.nextDouble());
    }

    @Override
    public void calcularArea() {
        this.setArea((getDiagonalMaior() * getDiagonalMenor()) / 2);
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public double getDiagonalMaior() {
        return diagonalMaior;
    }

    public void setDiagonalMaior(double diagonalMaior) {
        this.diagonalMaior = diagonalMaior;
    }

    @Override
    public String toString() {
        return String.format("Losango (Área) = %.2f",this.getArea());
    }
}
