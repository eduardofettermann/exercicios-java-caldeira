package br.com.eduardofettermann.exercicios.solucoes.lista5.exercicio03lista5.model;

public record Tarefa(String titulo,String descricao) {
    @Override
    public String toString() {
        return "titulo = " + titulo + '\n' +
                "descricao = " + descricao + '\n';
    }
}
