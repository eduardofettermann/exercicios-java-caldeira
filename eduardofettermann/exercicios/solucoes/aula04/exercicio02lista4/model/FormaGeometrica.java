package eduardofettermann.exercicios.solucoes.aula04.exercicio02lista4.model;

public abstract class FormaGeometrica {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calcularArea();

    public void mostraArea(){
        System.out.printf("A área da Forma é %.2f \n",this.getArea());
    }

    public abstract void perguntaInformacoes();
}
