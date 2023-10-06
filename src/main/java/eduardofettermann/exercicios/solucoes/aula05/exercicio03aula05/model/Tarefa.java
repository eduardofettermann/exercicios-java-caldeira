package eduardofettermann.exercicios.solucoes.aula05.exercicio03aula05.model;

public record Tarefa(String titulo,String descricao) {
    @Override
    public String toString() {
        return "titulo = " + titulo + '\n' +
                "descricao = " + descricao + '\n';
    }
}
