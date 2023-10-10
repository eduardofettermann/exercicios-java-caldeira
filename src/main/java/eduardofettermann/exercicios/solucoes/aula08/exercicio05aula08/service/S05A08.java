package eduardofettermann.exercicios.solucoes.aula08.exercicio05aula08.service;

import eduardofettermann.exercicios.model.Soluction;

public class S05A08 implements Soluction {

    @Override
    public void printQuestion() {
        System.out.println("""
                - Exercicio 05 - Testes unitários de uma aplicação que não foi você que desenvolveu (médio)
                a) Crie um projeto com Gradle e
                importe a classe Operacao que está dentro dessa pasta,
                leia o código e implemente um teste unitário para cada método.
                b) Te liga! Se um método pode retornar uma exceção, você precisa implementar um teste unitário para esse cenário
                c) Revise se tem todos os cenários codificados.
                                
                Solução:
                """);
    }

    @Override
    public void resolves() {
        final MethodsMenu METHODS_MENU = new MethodsMenu();
        METHODS_MENU.printMainMenu();
        menu.showEndMenu();
    }

    @Override
    public void questionIfResolvesAgain() {
        Soluction.super.questionIfResolvesAgain();
    }
}
