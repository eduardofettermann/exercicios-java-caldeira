package br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio04lista5.service;

import br.com.eduardofettermann.exercicios.model.Solucao;
import br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio04lista5.model.Compra;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04Lista5 implements Solucao {
    private List<Compra> comprasList = new ArrayList<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 04 - Uso de List e ArrayList
                Descrição: Crie um programa Java que simule uma lista de compras. O programa deve permitir que o usuário
                adicione itens à lista, remova itens da lista e exiba a lista de compras atual. Use um ArrayList para armazenar
                os itens da lista de compras. Compra deve ser uma classe do seu código com os atributos: nome e data de validade
                e métodos que você julgue necessários.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        exibeMenu();
        resolveNovamente();
    }

    public void exibeMenu() {
        System.out.println("""
                                
                Digite o que você deseja realizar
                1 - Exibir lista
                2 - Adicionar Compra
                3 - Remover compra
                                
                0 - Sair
                                
                """);
        switch (retornaInteiroDigitado()) {
            case (1) -> executaAcao(1);
            case (2) -> executaAcao(2);
            case (3) -> executaAcao(3);
        }
    }

    public int retornaInteiroDigitado() {
        return scanner.nextInt();
    }

    public void executaAcao(int inteiroDigitado) {
        switch (inteiroDigitado) {
            case (1) -> exibeListaMenu();
            case (2) -> criaCompraEAdicionaNaArray();
            case (3) -> removeCompra();
            case (0) -> resolveNovamente();
        }
    }

    public void exibeListaMenu() {
        exibeLista();
        exibeMenu();
    }


    public void criaCompraEAdicionaNaArray() {
        scanner.nextLine();
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        Compra compra = new Compra(nome, quantidade);
        comprasList.add(compra);
        System.out.printf("""
                                
                Compra adicionada:
                Produto: %s
                Quantidade: %d
                                
                """, compra.produto(), compra.quantidade());
        exibeMenu();
    }

    public void removeCompra() {
        exibeLista();
        System.out.println("Digite o número da tarefa que você deseja excluir da lista:");
        int digitado = retornaInteiroDigitado();
        System.out.println("Compra removida: " + comprasList.get((digitado - 1)).produto());
        comprasList.remove((digitado - 1));
        exibeMenu();
    }

    public void exibeLista() {
        System.out.println("Lista de compras");
        comprasList.forEach(t -> System.out.println((comprasList.indexOf(t) + 1) + " - " + t.produto() + " (" + t.quantidade() + ")"));
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
