package br.com.eduardofettermann.exercicios.solucoes.aula06.solucao04aula06.model;

public record Product(String name, double price) {
    @Override
    public String toString() {
        return String.format("Nome: %s, Preço: R$%.2f",name,price);
    }
}
