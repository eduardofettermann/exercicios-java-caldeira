package eduardofettermann.exercicios.solucoes.aula08.exercicio02aula08.model;

public class Product {
    private String name;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        return String.format("Nome: %s, Preço: %.2f, Quantidade: %d", this.getName(), this.getPrice(), this.getQuantity());
    }


    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return getPrice() * getQuantity();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
