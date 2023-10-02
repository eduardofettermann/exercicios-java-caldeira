package br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio03lista5.service;

import br.com.eduardofettermann.exercicios.model.Solucao;
import br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio03lista5.model.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03Lista5 implements Solucao {
    private List<Tarefa> tarefasList = new ArrayList<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 03 - Uso de List e ArrayList
                Descrição: Crie um programa Java que permita ao usuário criar uma lista de tarefas. O programa deve permitir adicionar tarefas à lista,
                remover tarefas e exibir todas as tarefas na lista. Use um ArrayList para armazenar as tarefas. Tarefa deve ser uma classe do seu código
                com os atributos: titulo, data e descrição e métodos que você julgue necessários.
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
                2 - Adicionar tarefa
                3 - Exibir detalhes de uma tarefa
                4 - Remover tarefa
                                
                0 - Sair
                                
                """);
        switch (retornaInteiroDigitado()) {
            case (1) -> executaAcao(1);
            case (2) -> executaAcao(2);
            case (3) -> executaAcao(3);
            case (4) -> executaAcao(4);
        }
    }


    public int retornaInteiroDigitado() {
        return scanner.nextInt();
    }

    public void executaAcao(int inteiroDigitado) {
        switch (inteiroDigitado) {
            case (1) -> exibeListaMenu();
            case (2) -> criaTarefaEAdicionaNaArray();
            case (3) -> perguntaTarefa();
            case (4) -> removeTarefa();
            case (0) -> resolveNovamente();
        }
    }

    public void exibeListaMenu() {
        exibeLista();
        exibeMenu();
    }


    public void criaTarefaEAdicionaNaArray() {
        scanner.nextLine();
        System.out.println("Digite o título:");
        String titulo = scanner.nextLine();

        System.out.println("Digite a descrição:");
        String descricao = scanner.nextLine();
        Tarefa tarefa = new Tarefa(titulo, descricao);
        tarefasList.add(tarefa);
        System.out.printf("""
                                
                Tarefa adicionada:
                Título: %s
                Descrição: %s
                                
                """, tarefa.titulo(), tarefa.descricao());
        exibeMenu();
    }


    public void perguntaTarefa() {
        exibeLista();
        System.out.println("Digite o índice da tarefa que você deseja ver a descrição:");
        int digitado = scanner.nextInt();
        exibirDescricaoTarefa(tarefasList.get((digitado - 1)));
    }

    public void exibirDescricaoTarefa(Tarefa tarefa) {
        System.out.printf("""
                                
                Tarefa - %d
                Título: %s
                Descrição: %s
                                
                """, (tarefasList.indexOf(tarefa) + 1), tarefa.titulo(), tarefa.descricao());
        exibeMenu();
    }


    public void removeTarefa() {
        exibeLista();
        System.out.println("Digite o número da tarefa que você deseja excluir da lista:");
        int digitado = retornaInteiroDigitado();
        System.out.println("Tarefa removida: " + tarefasList.get((digitado - 1)).titulo());
        tarefasList.remove((digitado - 1));
        exibeMenu();
    }

    public void exibeLista() {
        System.out.println("Lista de tarefas");
        tarefasList.forEach(t -> System.out.println((tarefasList.indexOf(t) + 1) + " - " + t.titulo()));
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
