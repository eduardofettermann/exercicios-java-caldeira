package eduardofettermann.exercicios.solucoes.aula08.exercicio02aula08.service;

import eduardofettermann.exercicios.model.Soluction;
import eduardofettermann.exercicios.solucoes.aula08.exercicio02aula08.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class S02A08 implements Soluction {
    List<Product> products = new ArrayList<>();
    HashMap<Product, Double> totalOfProducts = new HashMap<>();
    HashMap<Product, Integer> quantityProducts = new HashMap<>();
    private List<Product> withMoreThanTenUnits = new ArrayList<>();

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 02 - Gradle + Streams
                Crie um projeto Java usando o Gradle que processe
                uma lista de objetos do tipo "Produto"
                com os seguintes atributos: nome (String), preço (double) e quantidade (int).
                Utilizando Streams, implemente as seguintes operações:
                a) Encontre o produto mais caro na lista.
                b) Calcule o preço total de todos os produtos na lista.
                c) Filtre os produtos com quantidade superior a 10 e crie uma nova lista com eles.
                Solução:
                """);
    }

    @Override
    public void resolves() {
        printMenuQuestion();
    }

    private void printMenuQuestion() {
        System.out.println("""
                                
                Digite o que você deseja realizar:
                                
                1 - Adicionar um produto
                2 - Adicionar alguns produtos exemplos
                3 - Exibir a lista de produtos
                4 - Imprimir o produto mais caro da lista
                5 - Imprimir o total de todos produtos
                6 - Imprimir apenas os produtos com quantidade >10
                                
                0 - Sair
                                
                """);

        switch (scanner.nextInt()) {
            case (0) -> menu.showEndMenu();
            case (1) -> {
                addProductToList(returnProduct());
                printMenuQuestion();
            }
            case (2) -> {
                addSomeProducts();
                printMenuQuestion();
            }
            case (3) -> {
                printList(products);
                printMenuQuestion();
            }
            case (4) -> {
                printExpensiveProduct();
                printMenuQuestion();
            }
            case (5) -> {
                printTotalOfPrices();
                printMenuQuestion();
            }
            case (6) -> {
                printWithMoreThanTenUnits();
                printMenuQuestion();
            }
        }
    }

    private void addProductToList(Product product) {
        products.add(product);
        System.out.printf("\n%s adicionado na lista\n", product.getName());
    }

    private Product returnProduct() {
        scanner.nextLine();
        System.out.println("Digite o nome do produto:");
        String name = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double price = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        int quantity = scanner.nextInt();
        return new Product(name, price, quantity);
    }

    private void printList(List<Product> list) {
        list.forEach(System.out::println);
    }

    private Product returnExpensivestProduct() {
        return products.stream().max(Comparator.comparing(Product::getPrice)).get();
    }

    private void printExpensiveProduct() {
        System.out.println("Buscando o produto mais caro da lista...");
        System.out.println("Encontrado: " + returnExpensivestProduct());
    }

    private void updateProductsTotal() {
        products.forEach(p -> totalOfProducts.put(p, p.getTotal()));

    }
    private void updateProductsQuantity(){
        products.forEach(p -> quantityProducts.put(p, p.getQuantity()));
    }

    private void updateWithMoreThanTenUnitsList() {
        withMoreThanTenUnits = quantityProducts.keySet().stream().filter(product -> product.getQuantity() > 10).toList();
    }

    private Double returnTotalOfPrices() {
        return totalOfProducts.values().stream()
                .reduce((double) 0, (Double::sum));
    }

    private void printTotalOfPrices() {
        updateProductsTotal();
        System.out.printf("O preço total de todos produtos da lista é de: R$%.2f", returnTotalOfPrices());
    }

    private void printWithMoreThanTenUnits() {
        updateProductsQuantity();
        updateWithMoreThanTenUnitsList();
        System.out.println("Exibindo todos produtos com quantidade maior que 10:");
        withMoreThanTenUnits.forEach(System.out::println);
    }

    private void addSomeProducts() {
        products.add(new Product("Meta", 34.45, 1));
        products.add(new Product("Amazon", 4.00, 2));
        products.add(new Product("Netflix", 100.00, 26));
        products.add(new Product("Google", 100.00, 11));
        products.add(new Product("Apple", 100.00, 10));
        products.add(new Product("Instituto Caldeira", 2000000.00, 100));
        System.out.println("Produtos adicionados na lista!");
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }

    public static void main(String[] args) {
    }
}
