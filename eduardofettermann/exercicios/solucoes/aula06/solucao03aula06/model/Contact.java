package eduardofettermann.exercicios.solucoes.aula06.solucao03aula06.model;

public record Contact(String nome, String numeroDeTelefone, String zona){
    @Override
    public String toString() {
        return String.format("%s - %s (%s)",nome,numeroDeTelefone,zona);
    }
}
