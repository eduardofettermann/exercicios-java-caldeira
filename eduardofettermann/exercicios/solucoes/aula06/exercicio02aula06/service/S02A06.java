package eduardofettermann.exercicios.solucoes.aula06.exercicio02aula06.service;

import eduardofettermann.exercicios.model.Solucao;

import java.util.HashMap;
import java.util.Map;

public class S02A06 implements Solucao {
    Map<String, Integer> pessoas = new HashMap<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                 - Exercicio 02 - HashMap com pessoas
                Crie um programa Java que utilize uma estrutura de dados do tipo HashMap para associar nomes a idades.
                Insira algumas entradas no mapa e, em seguida, acesse e imprima a idade de um nome específico. Crie um
                método para imprimir nomes das pessoas que estão na terceira idade. Certifique-se de lidar com o caso
                em que o nome não está presente no mapa.
                Solução:
                 """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        exibeMenu();
    }

    private void exibeMenu() {
        System.out.println("""
                \n
                Digite a ação que você deseja realizar
                1 - Adicionar pessoa ao HashMap
                2 - Exibir a HashMap
                3 - Procurar a idade de uma pessoa
                4 - Exibir nome das pessoas que estão na terceira idade (+65 anos)
                                
                0 - Sair
                """);
        int digitado = scanner.nextInt();
        switch (digitado) {
            case (1) -> inserirNoHashMap();
            case (2) -> exibeHashMap();
            case (3) -> procuraIdade();
            case (4) -> exibeIdosos();
            case (0) -> menu.showEndMenu();
            default -> exibeMenu();
        }
    }

    public void inserirNoHashMap() {
        scanner.nextLine();
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();
        pessoas.put(nome, idade);
        exibeMenu();
    }

    private void exibeHashMap() {
        System.out.println("HashMap:");
        System.out.println("\nNome - Idade");
        pessoas.keySet().forEach(p -> System.out.printf("\nNome: %s, Idade: %d", p, pessoas.get(p)));
        exibeMenu();
    }

    private boolean isIdoso(int idade) {
        return idade >= 65;
    }

    private void procuraIdade() {
        scanner.nextLine();
        System.out.println("Digite o nome da pessoa que você deseja ver a idade:");
        String nome = scanner.nextLine();
        if (temNoHashMap(nome)) {
            System.out.println("Pesquisa realizada!");
            System.out.printf("\nNome: %s, Idade: %d", nome, pessoas.get(nome));
        } else {
            System.out.printf("\nPessoa com o nome %s não encontrada, certifique-se de escrever exatamente como foi registrado(Maiusculas e acentos)\n", nome);
            System.out.println("Segue a lista com os nomes:");
            pessoas.keySet().forEach(System.out::println);
        }
        exibeMenu();
    }

    private void exibeIdosos() {
        Map<String, Integer> idosos = pessoas;
        idosos.keySet().removeIf(p -> !isIdoso(idosos.get(p)));
        System.out.println("HashMap de Idosos:");
        System.out.println("Nome (Idade)");
        idosos.keySet().forEach(i -> System.out.printf("%s (%d)\n", i, idosos.get(i)));
        exibeMenu();
    }

    public boolean temNoHashMap(String nome) {
        return pessoas.containsKey(nome);
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
