package br.com.eduardofettermann.exercicios.solucoes.aula06.solucao04aula06.service;

import br.com.eduardofettermann.exercicios.model.Solucao;
import br.com.eduardofettermann.exercicios.solucoes.aula06.solucao04aula06.model.Product;

import java.util.LinkedHashMap;

public class S04A06 implements Solucao {
    int i = 0;
    LinkedHashMap<Integer, Product> shelf = new LinkedHashMap<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 04 - LinkedHashMap
                Crie um programa Java que utilize uma estrutura de dados do tipo LinkedHashMap para associar produtos
                a seus preços. Insira algumas entradas no mapa e, em seguida, imprima a lista de produtos na ordem em
                que foram inseridos, exibindo o nome do produto e seu preço.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        addSomeProducts();
        showMenu();
    }

    public void addSomeProducts(){
        i += 1;
        shelf.put(i, new Product("Margarina", 14.20));
        i += 1;
        shelf.put(i, new Product("Chocolate", 1.20));
        i += 1;
        shelf.put(i, new Product("Leite", 0.20));
        i += 1;
        shelf.put(i, new Product("Iphone 18", 2000.10));
    }

    private void showMenu() {
        System.out.println("""
                \n
                Digite a ação que você deseja realizar:
                1 - Exibir a prateleira
                2 - Adicionar um produto à prateleira
                3 - Remover um produto da prateleira
                                
                0 - Sair
                """);
        int digitado = scanner.nextInt();
        switch (digitado) {
            case (1) -> showShelfWithMenu();
            case (2) -> addProductToShelf();
            case (3) -> removeProductFromShelf();
            case (0) -> menu.exibeMenuFinal();
            default -> showMenu();
        }
    }

    private void showShelfWithMenu() {
        showShelfNoMenu();
        showMenu();
    }

    private void showShelfNoMenu() {
        System.out.println("\nPrateleira de produtos:");
        System.out.println("(Código) Nome - Preço");
        shelf.forEach((index, product) -> System.out.printf("(%d) %s\n", index, product.toString()));
    }

    private void addProductToShelf() {
        scanner.nextLine();
        System.out.println("Digite o nome do produto:");
        String name = scanner.nextLine();
        System.out.println("Digite o preço do produto: (Ex.: 10,50)");
        double price = scanner.nextDouble();
        i += 1;
        shelf.put(i, new Product(name, price));
        showShelfWithMenu();
    }

    private void removeProductFromShelf() {
        scanner.nextLine();
        showShelfNoMenu();
        System.out.println("\nDigite o código do produto que você deseja remover:");
        int nextInt = scanner.nextInt();
        if (!isEmpty(nextInt)) {
            Product removed = shelf.remove(nextInt);
            System.out.printf("\n%s removido!\n", removed);
        } else {
            System.out.printf("\nNão foi encontrado nenhum produto com o código %d!", nextInt);
        }
        showShelfWithMenu();
    }

    private boolean isEmpty(int key) {
        return !(shelf.containsKey(key));
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
