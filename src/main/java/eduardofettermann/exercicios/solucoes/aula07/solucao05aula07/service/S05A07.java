package eduardofettermann.exercicios.solucoes.aula07.solucao05aula07.service;

import eduardofettermann.exercicios.model.Solucao;
import eduardofettermann.exercicios.solucoes.aula07.solucao05aula07.model.InvalidAgeException;

public class S05A07 implements Solucao {
    @Override
    public void exibeEnunciado() {
        System.out.println("""
                - Exercicio 05 - Tratamento de Erros com Exceções Personalizadas (RuntimeException)
                Crie uma exceção personalizada chamada IdadeInvalidaException que herde de RuntimeException.
                Em um programa, peça ao usuário que insira sua idade. Se a idade for menor que 0 ou maior que 150, lance
                a exceção IdadeInvalidaException com uma mensagem apropriada.
                Solução:
                """);
    }

    @Override
    public void resolve() {
        exibeEnunciado();
        showMenu();
    }

    private void showMenu() {
        System.out.println("""
                Digite o que deseja realizar!
                
                1 - Digitar uma idade
                                
                0 - Sair

                """);

        try {
            switch (scanner.nextInt()) {
                case (1) -> typeAnAge();
                case (0) -> menu.showEndMenu();
            }


        } catch (InvalidAgeException e) {
            System.out.println("Você digitou uma idade inválida!");
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private void typeAnAge() throws InvalidAgeException {
        System.out.println("Digite uma idade! (apenas inteiros)");
        int age = scanner.nextInt();
        if (ageIsInvalid(age)) {
            throw new InvalidAgeException("A idade não pode ser menor que 0 ou maior que 150!");
        }
        System.out.println("A idade digitada foi " + age);
        resolveNovamente();
    }

    private boolean ageIsInvalid(int age) {
        return (age < 0 || age > 150);
    }

    @Override
    public void resolveNovamente() {
        Solucao.super.resolveNovamente();
    }
}
