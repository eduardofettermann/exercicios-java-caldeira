package br.com.eduardofettermann.exercicios.solucoes.lista3.Exercicio02Lista3.model;

public class Circulo {
    private double raio;
    private double area;
    private double circunferencia;
    private double diametro;
    private int casasDecimais;
    private String unidadeDeMedida;
    private final double PI = Math.PI;

    public double calculaAreaPeloRaio(double raio) {
        return area = PI * (raio * raio);
    }

    public double calculaCircunferenciaPeloRaio(double raio) {
        return circunferencia = 2 * PI * raio;
    }

    public double calculaDiametroPeloRaio(double raio) {
        return diametro = raio * 2;
    }

    public double calculaRaioPeloDiametro(double diametro) {
        return raio = diametro / 2;
    }

    public double calculaAreaPelaCircunferencia(double circunferencia) {
        return area = PI * (calculaRaioPelaCircunferencia(circunferencia) * calculaRaioPelaCircunferencia(circunferencia)); // ok
    }

    public double calculaRaioPelaCircunferencia(double circunferencia) {
        return raio = circunferencia / (2 * PI); // ok
    }

    public double calculaRaioPelaArea(double area) {
        raio = (double) Math.sqrt(area / PI); // ok
        return raio;
    }

    public double calculaCircunferenciaPelaArea(double area) {
        return circunferencia = 2 * PI * calculaRaioPelaArea(area);
    }

    public double calculaDiametro(double raio) {
        return diametro = raio * 2;
    }


// Setters

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCasasDecimais(int casasDecimais) {
        this.casasDecimais = casasDecimais;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    //Getters

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        return area;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public double getDiametro() {
        return diametro;
    }

    @Override
    public String toString() {
        String toStringFormatado = "Medidas do círculo %n" +
                "Raio = %." + casasDecimais + "f %n" +
                "Diâmetro = %." + casasDecimais + "f %n" +
                "Área = %." + casasDecimais + "f %n" +
                "Circunferência = %." + casasDecimais + "f";
        return String.format(toStringFormatado, raio,diametro,area,circunferencia);
    }
}
