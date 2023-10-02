package br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio05lista5.service;

import br.com.eduardofettermann.exercicios.model.Solucao;
import br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio05lista5.model.Impressao;

import java.util.LinkedList;

public class Exercicio05Lista5 implements Solucao {
    private LinkedList<Impressao> filaDeImpressao = new LinkedList<>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 05 - Uso de List e LinkedList
                Descrição: Crie um programa Java que simule um sistema de fila de impressão. O programa deve permitir
                que os usuários adicionem documentos à fila de impressão e, em seguida, imprimir documentos da fila.
                Use uma LinkedList para representar a fila de impressão. Impressão deve ser uma classe do seu código
                com os atributos: nome e numero de páginas e métodos que você julgue necessários.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        exibeMenu();
    }

    public void exibeMenu() {
        System.out.println("""
                                
                Digite o que você deseja realizar
                1 - Adicionar documento à fila
                2 - Imprime documentos da fila
                                
                0 - Sair
                                
                """);
        switch (retornaInteiroDigitado()) {
            case (1) -> executaAcao(1);
            case (2) -> executaAcao(2);
            case (0) -> executaAcao(0);
        }
    }

    public int retornaInteiroDigitado() {
        return scanner.nextInt();
    }

    public void executaAcao(int inteiroDigitado) {
        switch (inteiroDigitado) {
            case (1) -> criaImpressaoEAdicionaNaFila();
            case (2) -> imprimeFila();
            case (0) -> menu.exibeMenuFinal();
        }
    }

    public void criaImpressaoEAdicionaNaFila() {
        scanner.nextLine();
        System.out.println("Digite o nome da impressão:");
        String nome = scanner.nextLine();
        System.out.println("Digite o número de páginas:");
        int numeroDePaginas = scanner.nextInt();
        Impressao impressao = new Impressao(nome, numeroDePaginas);
        filaDeImpressao.addLast(impressao);
        System.out.printf("""
                                
                Impressão adicionada à fila:
                Nome: %s
                Número de páginas: %d
                                
                """, impressao.nome(), impressao.numeroDePaginas());
        exibeMenu();
    }

    public void imprimeFila() {
        while (!filaDeImpressao.isEmpty()) {
            System.out.println("\nImprimindo...");
            System.out.println(filaDeImpressao.getFirst().nome() + " (" + filaDeImpressao.getFirst().numeroDePaginas() + ")");
            filaDeImpressao.removeFirst();
        }
        System.out.println("\nTodos documentos foram impressos com êxito!");
        exibeMenu();
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
