package eduardofettermann.exercicios.solucoes.aula06.exercicio01aula06.service;

import eduardofettermann.exercicios.model.Solucao;
import eduardofettermann.exercicios.solucoes.aula06.exercicio01aula06.model.Livro;

import java.util.Comparator;
import java.util.Stack;

public class S01A06 implements Solucao {
    Stack<Livro> livros = new Stack<Livro>();

    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 01 - Stack com Livros
                Crie um programa Java que utilize uma estrutura de dados do tipo Stack para armazenar objetos da classe
                Livros. Implemente a classe Livro, com titulo e categoria, inicialize a pilha com alguns livros, imprimir
                os elementos da pilha, imprimir com base na categoria e implemente um loop para remover até que ela esteja vazia.
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
                \n
                Digite a ação que você deseja realizar
                1 - Adicionar livro à pilha
                2 - Exibir os livros
                3 - Exibir livro com base na categoria
                4 - Remover todos livros da pilha
                
                0 - Sair
                """);
        int digitado = scanner.nextInt();
        switch (digitado) {
            case (1) -> adicionaNaPilha();
            case (2) -> exibeLivros();
            case (3) -> exibeLivrosPorCategoria();
            case (4) -> removerTodosLivros();
            case (0) -> menu.showEndMenu();
            default -> exibeMenu();
        }
    }

    public void adicionaNaPilha() {
        scanner.nextLine();
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite a categoria do livro:");
        String categoria = scanner.nextLine();
        Livro livro = new Livro(titulo, categoria);
        livros.push(livro);
        System.out.printf("\nLivro %s adicionado na categoria %s!\n",livro.titulo(),livro.categoria());
        exibeMenu();
    }

    public void exibeLivros(){
        System.out.println("Pilha de Livros:");
        System.out.println("Título - Categoria");
        livros.stream().forEach(l -> System.out.printf("\n%s - %s",l.titulo(),l.categoria()));
        exibeMenu();
    }

    public void exibeLivrosPorCategoria(){
        System.out.println("\nPilha de Livros:");
        System.out.println("\nTítulo - Categoria");
        Stack<Livro> livrosPorCategoria = livros;
        livrosPorCategoria.sort(Comparator.comparing(Livro::categoria));
        livrosPorCategoria.stream().forEach(l -> System.out.printf("%s - %s\n",l.titulo(),l.categoria()));
        exibeMenu();
    }

    public void removerTodosLivros() {
        while (!isEmpty(livros)) {
            Livro livroRemovido = livros.pop();
            System.out.printf("\nO livro %s foi removido!", livroRemovido.titulo());
        }
        System.out.println("\nTodos livros foram removidos!");
        exibeMenu();
    }

    public boolean isEmpty(Stack stack) {
        return livros.isEmpty();
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
